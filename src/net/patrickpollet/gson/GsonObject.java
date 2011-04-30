package net.patrickpollet.gson;

import java.lang.reflect.Field;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonObject {
	
	public GsonObject fromJSON (String jString) {		
		GsonBuilder gsonb=new GsonBuilder();
		Gson gson=gsonb.create();
		return gson.fromJson(jString,this.getClass());
	}
	
	public String toJSON () {
		GsonBuilder gsonb=new GsonBuilder();
		Gson gson=gsonb.create();
		return gson.toJson(this);
	}
	
	
	/**
	 * mostly used as a debugging method to dump data returned by the WS
	 */
	public String toString() {
		
		StringBuilder sb=new StringBuilder("{");
		Field[] fields=this.getClass().getDeclaredFields();
		boolean first=true;
		for (Field field :fields){
			try {
				field.setAccessible(true); //MUST DO 
				Object value=field.get(this);
				if (!first)
					sb.append(',');
				if (value !=null) 
					sb.append(field.getName()).append(" = ").append(value.toString());
				else 
					sb.append(field.getName()).append(" = null");
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			first=false;
		}
		
		//getFieldValue
		sb.append("}");
		return sb.toString();
	}
	
	

}