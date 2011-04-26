/**
 * 
 */
package net.patrickpollet.gson;

import java.util.List;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.transport.HttpTransportSE;

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
	
	public 	MySoapSerializationEnvelope makeEnvelope(String method_name,int client, String sesskey) {
		return  new MySoapSerializationEnvelope(NAMESPACE, method_name, client,sesskey);
	}
	
	public 	MySoapSerializationEnvelope makeEnvelope(String method_name) {
		return  new MySoapSerializationEnvelope(NAMESPACE, method_name, 0,"");
	}
	
	public Gsoneabilisable getObject (SoapObject response,Gsoneabilisable theClass) {
		return GsonUtils.getObject(response, theClass);
	}
	
	public List<Gsoneabilisable> getList(SoapObject response,Gsoneabilisable theClass) {
		return GsonUtils.getList(response, theClass);
	}
	
	public Gsoneabilisable[] getArray(SoapObject response,Gsoneabilisable theClass) {
		return GsonUtils.getArray(response, theClass);
	}



	/**
	 * log detailed errors if WS_DEBUG is activated
	 * 
	 * @param httpTransport
	 * @param e
	 */
	protected void logError(HttpTransportSE httpTransport, Exception e) {
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
