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
