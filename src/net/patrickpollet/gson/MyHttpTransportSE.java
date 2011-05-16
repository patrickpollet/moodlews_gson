/*
 * Copyright (c) 2011 Patrick Pollet France
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 * EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE
 * USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * Contributor(s): 
 */

package net.patrickpollet.gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;


public class MyHttpTransportSE  {

	private String url;
	private boolean debug;
	public String requestDump="";
	public String responseDump="";

	public MyHttpTransportSE(String url, boolean debug) {
		this.url=url; 
		this.debug = debug;
	}
	
	public String call (String method_name, MyRestSerializationEnvelope envelope) throws IOException {
		  URL getUrl = new URL(url);
          HttpURLConnection connection = (HttpURLConnection)getUrl.openConnection();
          connection.setRequestMethod("POST");
          connection.setRequestProperty("Accept", "application/xml");
          connection.setDoOutput(true);
          OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
          writer.write(envelope.toString());
          writer.flush();
          writer.close();
          this.requestDump=envelope.toString();
          // Used for testing
          BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
          StringBuilder res=new StringBuilder();
          String line=reader.readLine();
          while (line!=null) {
              res.append(line);
              line=reader.readLine();
          }
          reader.close();
          
          
          
          
          connection.disconnect();
          this.responseDump=res.toString();
          return this.responseDump;
		
	}
	

}
