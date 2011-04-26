package net.patrickpollet.gson;

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
	
	

}
