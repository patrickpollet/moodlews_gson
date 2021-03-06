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

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.List;



/**
 * @author ppollet
 *
 */
public class GsonBindingStubBase{
	
	
	protected  String NAMESPACE;
	public String getNAMESPACE() {
		return NAMESPACE;
	}


	public void setNAMESPACE(String namespace) {
		NAMESPACE = namespace;
	}


	public String getURL() {
		return URL;
	}


	public void setURL(String url) {
		URL = url;
	}

	//protected  String TAG = "moodlews@ksoap2";
	protected  String URL;
	protected  boolean WS_DEBUG = true;
	
	public GsonBindingStubBase (String service_url, String nameSpace,boolean debug) {
		this.NAMESPACE=nameSpace;
		this.URL=service_url; 
		this.WS_DEBUG=debug;
	}
	
	
	public MyHttpTransportSE makeHttpTransport() {
		return  new MyHttpTransportSE(URL,WS_DEBUG);
	}
	
	public 	MyRestSerializationEnvelope makeEnvelope(String method_name,int client, String sesskey) throws UnsupportedEncodingException {
		return  new MyRestSerializationEnvelope(NAMESPACE, method_name, client,sesskey);
	}
	
	public 	MyRestSerializationEnvelope makeEnvelope(String method_name) throws UnsupportedEncodingException {
		return  new MyRestSerializationEnvelope(NAMESPACE, method_name, 0,"");
	}
	
	
	public GsonObject getObject (String response,GsonObject theClass) {
		return GsonUtils.getObject(response, theClass);
	}
	
	public List<GsonObject>  getList(String response,Type collectionType) {
		return GsonUtils.getList(response, collectionType);
	}
	
	public GsonObject[] getArray(String response,Type type) {
		return GsonUtils.getArray(response, type);
	}


	/**
	 * log detailed errors if WS_DEBUG is activated
	 * 
	 * @param httpTransport
	 * @param e
	 */
	
	protected void logError(MyHttpTransportSE httpTransport, Exception e) {
		// give a null pointer exception if debug is off in transport
		if (WS_DEBUG) {
			
			if (httpTransport.requestDump !=null) {		
				System.out.println( httpTransport.requestDump.toString());
				System.out.println(  "lng="
					+ (httpTransport.requestDump.toString().length()));
			}
			if (httpTransport.responseDump !=null) {
				System.out.println( httpTransport.responseDump.toString());
				System.out.println( "lng="
					+ (httpTransport.responseDump.toString().length()));
			}
			
		}
		e.printStackTrace();

	}

	/**
	 * log successfull operation if WS_DEBUG is activated
	 * 
	 * @param method_name
	 * @param ret
	 */
	protected void logInfo(String method_name, Object ret) {
		if (WS_DEBUG)
			System.out.println(  "reponse " + method_name + " : " + ret.toString());
	}
	
	
	
	
	
	
	


}
