/**
 * 
 */
package net.patrickpollet.gson.wsdl;

import java.util.Collections;
import java.util.Vector;

import org.apache.axis.wsdl.gen.Generator;
import org.apache.axis.wsdl.symbolTable.SymbolTable;
import org.apache.axis.wsdl.symbolTable.TypeEntry;
import org.apache.axis.wsdl.toJava.Emitter;
import org.apache.axis.wsdl.toJava.JavaBeanFaultWriter;
import org.apache.axis.wsdl.toJava.JavaEnumTypeWriter;
import org.apache.axis.wsdl.toJava.JavaHolderWriter;
import org.apache.axis.wsdl.toJava.JavaTypeWriter;
import org.apache.axis.wsdl.toJava.JavaWriter;

/**
 * @author ppollet
 *
 */
public class GsonTypeWriter extends JavaTypeWriter{

	/**
	 * 
	 */
	public GsonTypeWriter(Emitter emitter, TypeEntry type,
            SymbolTable symbolTable) {
		super(emitter,type,symbolTable);
	}
	
	 /**
     * getBeanWriter
     * 
     * @param emitter    
     * @param type       
     * @param base       
     * @return 
     */
	@Override
    protected JavaWriter getBeanWriter(Emitter emitter, TypeEntry type, TypeEntry base) {   // CONTAINED_ELEM_AND_ATTR
        
		
		JavaWriter tmp=super.getBeanWriter(emitter,type,base);
		if (tmp instanceof JavaBeanFaultWriter)
			return tmp;
		Vector elements = type.getContainedElements();
        Vector attributes = type.getContainedAttributes();
        
        return new GsonBeanWriter(emitter, type, elements, base, attributes,
                getBeanHelperWriter(emitter, type, elements, base,
                                    attributes, false));
    }
	
	 /**
     * getHelperWriter
     * 
     * @param emitter    
     * @param type       
     * @param elements   
     * @param base       
     * @param attributes 
     * @return 
     */
    protected JavaWriter getBeanHelperWriter(
            Emitter emitter, TypeEntry type, Vector elements, TypeEntry base,
            Vector attributes, boolean forException) {
        return new GsonBeanHelperWriter(
                emitter, type, elements, base, attributes,
                forException  ?  JavaBeanFaultWriter.RESERVED_PROPERTY_NAMES
                              :  Collections.EMPTY_SET);
    }
    
    
    /**
     * getEnumWriter
     * 
     * @param emitter 
     * @param type    
     * @param v       
     * @return 
     */
    protected JavaWriter getEnumTypeWriter(Emitter emitter, TypeEntry type,
                                           Vector v) {
       // return null ; // not yet supported  new JavaEnumTypeWriter(emitter, type, v);
    	return new GsonEnumTypeWriter(emitter, type, v);
    }
    
    /**
     * getHolderWriter
     * 
     * @param emitter 
     * @param type    
     * @return 
     */
    protected Generator getHolderWriter(Emitter emitter, TypeEntry type) {
       // return null; // not yet supported new JavaHolderWriter(emitter, type);
        return new GsonHolderWriter(emitter, type);
    }
	

}
