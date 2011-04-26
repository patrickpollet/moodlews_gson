package net.patrickpollet.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;





public class GsonUtils {
	
	/**
	 * return one object from the Soap response
	 * 
	 * @param response
	 * @param theClass
	 * @return
	 */
	public static GsonObject getObject(String response,
			GsonObject theClass) {
		return theClass.fromJSON(response);
	}


	
	
	


	private static String[] PRIMITIVE_TYPES = { "boolean", "int", "long",
			"short", "byte", "float", "double" };
	
	private static String[] PRIMITIVE_WRAPPER_TYPES = { "Boolean", "Integer", "Long",
		"Short", "Byte", "Float", "Double" };

	private static String[] PRIMITIVE_FETCH_VALUES = {
			"Boolean response = (Boolean) envelope.getResponse();",
			"Integer response = (Integer) envelope.getResponse();",
			"Long response = (Long) envelope.getResponse();",
			"Short response = (Short) envelope.getResponse();",
			"Byte response = (Byte) envelope.getResponse();",
			"Float response = (Float) envelope.getResponse();",
			"Double response = (Double) envelope.getResponse();" };

	private static String[] PRIMITIVE_RETURN_VALUES = {
			"return response.booleanValue();", "return response.intValue();",
			"return response.longValue();", "return response.shortValue();",
			"return response.byteValue();", "return response.floatValue();",
			"return response.doubleValue();" };

	private static String[] PRIMITIVE_RETURN_FAULT_VALUES = { "return false;",
			"return 0;", "return 0;", "return 0;", "return 0;", "return 0;",
			"return 0;" };

	private static int findPrimitiveTypeIndex(String typeName) {
		for (int i = 0; i < PRIMITIVE_TYPES.length; i++)
			if (typeName.equals(PRIMITIVE_TYPES[i]))
				return i;
		return -1;
	}

	public static String getWrapperClassName (String typeName) {
		int i=findPrimitiveTypeIndex(typeName);
		if (i!=-1) return PRIMITIVE_WRAPPER_TYPES[i];
		else return null ; // unlikeley 
	}
	
	public static boolean isPrimitiveType(String typeName) {
		return findPrimitiveTypeIndex(typeName) != -1;
	}

	public static boolean isArrayType(String typeName) {
		return typeName.indexOf("[]") >= 0;

	}

	public static boolean isStringType(String typeName) {
		return typeName.endsWith("String");

	}
	
	public static boolean isWrapperType(String typeName) {
		String shortTypeName=getBaseType(typeName); //remove java.lang. prefix
		for (int i = 0; i < PRIMITIVE_WRAPPER_TYPES.length; i++)
			if (shortTypeName.equals(PRIMITIVE_WRAPPER_TYPES[i]))
				return true;
		return false;

	}
	

	public static String getPrimitiveTypeFetchValue(String typeName) {
		int i = findPrimitiveTypeIndex(typeName);
		if (i != -1)
			return PRIMITIVE_FETCH_VALUES[i];
		else
			return "";
	}

	public static String getPrimitiveTypeReturnValue(String typeName,
			boolean fault) {
		int i = findPrimitiveTypeIndex(typeName);
		if (i != -1)
			return fault ? PRIMITIVE_RETURN_FAULT_VALUES[i]
					: PRIMITIVE_RETURN_VALUES[i];
		else
			return "";
	}

	public static String getBaseType(String typeName) {
		String ret = typeName.substring(typeName.lastIndexOf('.') + 1);
		return ret.replace("[]", "");
	}

	public static List<GsonObject> getList(String response, Type type) {
		// TODO Auto-generated method stub
		Gson gson=new Gson();
		return gson.fromJson(response, type);
	}

	public static GsonObject[] getArray(String response, Type type) {
		// TODO Auto-generated method stub
		
		Gson gson=new Gson();
		return gson.fromJson(response, type);
	}

}
