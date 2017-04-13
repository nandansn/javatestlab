/**
 * 
 */
package com.nanda.java.testlab.access.modifiers;

import com.nanda.java.testlab.oops.ProtectedClass;
import com.nanda.java.testlab.oops.PublicClass;

/**
 * @author Nandakumar 
 * 11-Apr-2017
 *
 */
public class TestAccessModifiers extends ProtectedClass {
    
    public static void main(String args[]){
	
	PublicClass pc = new PublicClass();
	pc.publicMethod();
	
	
	
    }

}
