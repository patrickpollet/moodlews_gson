package net.patrickpollet.gson; 

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import net.patrickpollet.moodlews_gson.core.LoginReturn;



/**
 * make all the setup for a proper envelope against a MoodleWS type Web Service
 * 
 * @author ppollet
 * 
 */
public class MyRestSerializationEnvelope {

	private StringBuilder request;
	
	private String nameSpace="json";
	
	private String encoding="UTF-8";

	/**
	 * old call for all operation EXECPT login
	 * @param nameSpace
	 * @param method_name
	 * @param lr
	 * @throws UnsupportedEncodingException 
	 */
	public MyRestSerializationEnvelope(String nameSpace, String method_name,
			LoginReturn lr) throws UnsupportedEncodingException {
			this(nameSpace,method_name,lr.getClient(),lr.getSessionkey());
	}
	
	/**
	 * call specific to login operation, obviously not yet a loginReturn 
	 * @param nameSpace
	 * @param method_name
	 * @throws UnsupportedEncodingException 
	 */
	public MyRestSerializationEnvelope(String nameSpace, String method_name) throws UnsupportedEncodingException {
		this(nameSpace,method_name,0,"");
	}
	
	/**
	 * standard call for all operations 
	 * @param nameSpace
	 * @param method_name
	 * @param client
	 * @param sesskey
	 * @throws UnsupportedEncodingException 
	 */
	public MyRestSerializationEnvelope(String nameSpace, String method_name,
			int client, String sesskey) throws UnsupportedEncodingException {
		
		this.nameSpace=nameSpace;
		this.request.append(URLEncoder.encode("wsfunction", this.encoding)).append("=").append(URLEncoder.encode(method_name,this.encoding));
		
		if (client !=0) {
			this.addProperty("client", client);
			this.addProperty("sesskey", sesskey);
		}
	
	}

	/**
	 * simplify coding of client
	 * 
	 * @param name
	 * @param value
	 */
	public void addProperty(String name, Object value) throws UnsupportedEncodingException {
		//this.request.addProperty(name, value);
	}
	
	public String toString() {
		this.request.trimToSize();
		return this.request.toString();
	}
	
	

}
