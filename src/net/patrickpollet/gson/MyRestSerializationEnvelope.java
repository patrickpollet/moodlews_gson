package net.patrickpollet.gson; 

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;

import net.patrickpollet.moodlews_gson.core.LoginReturn;



/**
 * make all the setup for a proper envelope against a MoodleWS type Web Service
 * 
 * @author ppollet
 * 
 */
public class MyRestSerializationEnvelope {

	private StringBuilder request=new StringBuilder();
	
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
		this.addProperty("wsformatout", nameSpace);
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
		if (value !=null) {

			if (value.getClass().isArray()) {
				int length = Array.getLength(value);
				for (int i = 0; i < length; ++i) {
				      Object child = Array.get(value, i);
				      this.addProperty(name+"["+i+"]", child);
				}      
			}
			else {
				//todo object 
				this.request.append("&");
				this.request.append(URLEncoder.encode(name, this.encoding)).append("=").append(URLEncoder.encode(value.toString(),this.encoding));
			}
		}
	}	
	
	public String toString() {
		this.request.trimToSize();
		return this.request.toString();
	}
	
	

}
