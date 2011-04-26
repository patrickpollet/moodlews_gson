package net.patrickpollet.gson.wsdl;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import javax.wsdl.Binding;
import javax.wsdl.BindingOperation;
import javax.wsdl.Operation;
import javax.wsdl.OperationType;

import net.patrickpollet.gson.GsonUtils;
import net.patrickpollet.moodlews_gson.core.CohortRecord;

import org.apache.axis.wsdl.symbolTable.BindingEntry;
import org.apache.axis.wsdl.symbolTable.Parameter;
import org.apache.axis.wsdl.symbolTable.Parameters;
import org.apache.axis.wsdl.symbolTable.SymbolTable;
import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.toJava.JavaStubWriter;

import com.google.gson.reflect.TypeToken;

public class GsonStubWriter extends JavaStubWriter {

	/** Field bEntry */
	private BindingEntry bEntry;

	/** Field binding */
	private Binding binding;

	/** Field symbolTable */
	private SymbolTable symbolTable;

	public GsonStubWriter(Emitter emitter, BindingEntry bEntry,
			SymbolTable symbolTable) {
		super(emitter, bEntry, symbolTable);
		// these attributes are private in super class
		// so I store them also here...emitter
		this.bEntry = bEntry;
		this.binding = bEntry.getBinding();
		this.symbolTable = symbolTable;

		// TODO Auto-generated constructor stub
	}
	
	/**
     * Write the header comments.
     * 
     * @param pw 
     * @throws IOException 
     */
    protected void writeHeaderComments(PrintWriter pw) throws IOException {
       super.writeHeaderComments(pw);
        pw.println("/**");
        pw.println(" * Modified for Gsonlibrary by pp@patrickpollet.net using GsonStubWriter");
        pw.println(" */");
        pw.println();
    }    // writeHeaderComments
    
	
	  /**
     * Write the package declaration statement.
     * 
     * @param pw 
     * @throws IOException 
     */
    protected void writePackage(PrintWriter pw) throws IOException {
    	super.writePackage(pw);
    	//pw.println("//"+this.className);
    	pw.println("import java.lang.reflect.Type");
        pw.println("import java.util.Collection");
        		pw.println("import java.util.List");

        				pw.println("import com.google.gson.reflect.TypeToken");

  
  
        pw.println("import net.patrickpollet.gson.*;");
    	pw.println();
    	
    }
	/**
	 * Returns "extends org.apache.axis.client.Stub ".
	 * 
	 * @return
	 */
	protected String getExtendsText() {
		return "extends  GsonBindingStubBase";
	} // getExtendsText

	/**
	 * Returns "implements <SEI> ".
	 * 
	 * @return
	 */
	protected String getImplementsText() {
		return "";
	} // getImplementsText

	
	
	/**
	 * Write the body of the binding's stub file.
	 * 
	 * @param pw
	 * @throws IOException
	 */
	protected void writeFileBody(PrintWriter pw) throws IOException {
		
		writeConstructor(pw);

		List operations = binding.getBindingOperations();

		for (int i = 0; i < operations.size(); ++i) {
			BindingOperation operation = (BindingOperation) operations.get(i);
			Parameters parameters = bEntry.getParameters(operation
					.getOperation());

			// Get the soapAction from the <soap:operation>
			String soapAction = "";
			String opStyle = null;
			
			Operation ptOperation = operation.getOperation();
			OperationType type = ptOperation.getStyle();

			// These operation types are not supported. The signature
			// will be a string stating that fact.
			if ((OperationType.NOTIFICATION.equals(type))
					|| (OperationType.SOLICIT_RESPONSE.equals(type))) {
				pw.println(parameters.signature);
				pw.println();
			} else {
				writeOperation(pw, operation, parameters, soapAction, opStyle,
						type == OperationType.ONE_WAY, i);
			}
		}
	}
	
	
	public void writeConstructor(PrintWriter pw) throws IOException {
		 
		pw.println ("    public "+this.className+"(String service_url, String nameSpace, boolean debug) {");
		pw.println("         super(service_url,nameSpace,debug);");
		pw.println("     }");
		pw.println();
		
	}


	/**
	 * Write the stub code for the given operation.
	 * 
	 * @param pw
	 * @param operation
	 * @param parms
	 * @param soapAction
	 * @param opStyle
	 * @param oneway
	 * @param opIndex
	 */
	protected void writeOperation(PrintWriter pw, BindingOperation operation,
			Parameters parms, String soapAction, String opStyle,
			boolean oneway, int opIndex) {
		
		
		String operationName=operation.getName();
       System.out.println(operation.getName());
			
		if (operation.getName().equals("exception_handler"))
			return;
		
		
		
		writeComment(pw, operation.getDocumentationElement(), true);
	

		if (parms.signature == null) {
			return;
		}
		//get rid of that junk useless in KSoap2
		String signature= parms.signature.replace("throws java.rmi.RemoteException", "");
		pw.println(signature + " {");
		
		
		pw.println("    final String METH_NAME = \""+operationName+"\";");
		
		pw.println("    MyHttpTransportSE httpTransport = this.makeHttpTransport();");
		
		
	    pw.println("     try {");
		pw.println("	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);");
		
		this.emitParameters (operation,parms,pw);
		
		
		
		

 
	   pw.println("       String response=httpTransport.call(METH_NAME, envelope);");
	   
	//   pw.println("     "+this.generateFetchValue(operation, parms));

		
	   pw.println ("	  this.logInfo(METH_NAME, response);");
	   pw.println ("      "+this.generateReturnValue(operation, parms, false));
	
        pw.println("    } catch (Exception e) {");
		pw.println("             this.logError(httpTransport, e);");
		pw.println ("           "+this.generateReturnValue(operation, parms, true));
			//return 0;
		pw.println ("        }");

       
		
		pw.println("   }");
		
	}
	
	private void emitParameters(BindingOperation operation, Parameters parms,
			PrintWriter pw) {
		//System.out.println (parms);
		for (int i = 0; i < parms.list.size(); ++i) {
			Parameter p = (Parameter) parms.list.get(i);
			//System.out.println(p);
			if (p.getMode() == Parameter.IN) {
				String javifiedName = p.getName(); //Utils.xmlNameToJava(p.getName());
				String typeName=p.getType().getName();
				System.out.println (javifiedName+":"+typeName);
				if (GsonUtils.isPrimitiveType(typeName)|| GsonUtils.isStringType(typeName))
					pw.println("      envelope.addProperty(\""+javifiedName+"\","+javifiedName+");");	
				else if (GsonUtils.isArrayType(typeName)) {
					String baseType=GsonUtils.getBaseType(typeName);
					pw.println("     //TODO generate an arraytype  for input array ");
					/**
					pw.printf("      SoapObject _%s= new SoapObject(this.NAMESPACE,\"%sArray\");\n",javifiedName,baseType);
					pw.printf( "     if (%s !=null)      \n" ,javifiedName);  // rev 1.8.4 some arrays of ids may be empty=null in java
					pw.printf("         for ( Object o : %s) \n",javifiedName);
					pw.printf("            _%s.addProperty(\"item\",o);\n",javifiedName);
					***/
					pw.println("     envelope.addProperty(\""+javifiedName+"\",_"+javifiedName+");");
				}
				
				else {
					pw.println("      envelope.addProperty(\""+javifiedName+"\","+javifiedName+");");// sending an object is not yet implemented
				}
			}
		}

	}

	
	protected String generateReturnValue(BindingOperation operation,
			Parameters parms,boolean fault) {
		Parameter ret = parms.returnParam;
		if (ret != null) {
			String typeName=ret.getType().getName();
			if (GsonUtils.isPrimitiveType(typeName))
				return GsonUtils.getPrimitiveTypeReturnValue(typeName,fault);
			else if (GsonUtils.isStringType(typeName)) {
				if (fault) return "return null;";
				else return "return response.toString();";
			}
			else if (GsonUtils.isArrayType(typeName)) {
				if (fault) return "return null;";
				else {
					String baseType=GsonUtils.getBaseType(typeName);

					if (GsonUtils.isPrimitiveType(baseType)) {  // array of primitive type
						
						String wrapperClass=GsonUtils.getWrapperClassName(baseType);
						//return "       return null;"; 
						return "       return GsonUtils.get"+wrapperClass+"Array(response);";
					}
					else if (GsonUtils.isStringType(baseType)) {  // array of String
						 return "      return GsonUtils.getStringArray(response);";
						
					}	

					else {

						return 
						"Type  collectionType = new TypeToken<Collection<"+baseType+">>(){}.getType();\n"+
						 "        Collection ret=this.getList(response, collectionType);\n"+
					     "        return ("+baseType+"[]) ret.toArray( new "+baseType+"[0]);";
						
					}
				}
			}

			else { //object that MUST be Soapeabilisable
				//return (ExamenRecordV2)GsonUtils.getObject(response, new ExamenRecordV2());
				String baseType=GsonUtils.getBaseType(typeName);
				if (fault) return "return null;";
				else	return "return ("+ baseType+")GsonUtils.getObject(response,new "+baseType+"());";
			}
		}
		return "// a WS method that's returns nothing. Why not ?";



	}

}
