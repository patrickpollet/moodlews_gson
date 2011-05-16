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
import java.lang.reflect.Array;
import java.lang.reflect.Field;
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
				      this.addProperty(name+'['+i+']', child);
				}      
			}
			else if (value instanceof GsonObject) { // my objects
				Field[] fields=value.getClass().getDeclaredFields();
				for (Field field :fields){
					try {
						field.setAccessible(true); //MUST DO 
						Object fieldValue=field.get(value);
						String fieldName=field.getName();
						if (fieldValue !=null) { 
							this.addProperty(name+'['+fieldName+']', fieldValue);
						}
						
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
			else { // Java type or primitive 
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
