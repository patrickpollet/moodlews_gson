package net.patrickpollet.moodlews_gson;

import java.util.Arrays;

//use the new WSDL 
import net.patrickpollet.moodlews_gson.core.*;

// definitions of Moodle server, login, password ...


public class Test3 {
	// WE now use the simplified WSDL that is now generated from the server's
	// php classes !!!
	// instead of the one created by hand ...
	// major difference is that integer type are now mapped to java int and not
	// Integer
	// and in the case of returned arrays there is no need to extract first a
	// property xxxReturn
	// the array is right now available
	// here we test WS returning dummy arrays of Java primitive types (no login required)
	
	

	
	
	//DO NOT CHANGE we are talking to Ws using the NEW simplified WSDL
	private static final String MOODLE_SERVICE=Constantes.MOODLE_URL+"wspp/service_pp2.php";
	private static final String MOODLE_NAMESPACE=Constantes.MOODLE_URL+"wspp/wsdl2/";



	public static void main(String args[]) throws Exception {
		new Test3();
	}

	public Test3() throws Exception {

		Mdl_restserverBindingStub moodle = new Mdl_restserverBindingStub(MOODLE_SERVICE,MOODLE_NAMESPACE, Constantes.WS_DEBUG);
		
			String[] ret=moodle.get_string_array();
			System.out.println(Arrays.toString(ret));
			
			int[] ret1=moodle.get_int_array(10);
			System.out.println(Arrays.toString(ret1));
			
			float[] ret2=moodle.get_float_array(10);
			System.out.println(Arrays.toString(ret2));
			
		// cannot be tested sinc PHp written MoodleWs dose not known the double type 
	    //	double[] ret4=moodle.get_double_array(10.0);
		//	System.out.println(Arrays.toString(ret3));
			
			
			boolean[] ret3=moodle.get_boolean_array();
			System.out.println(Arrays.toString(ret3));


			System.out.println ("bye");
		
	}

}