/**
 * 
 */
package com.nanda.java.testlab.oops;

import com.nanda.java.testlab.oops.A;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 * 
 *         There are two types of modifiers in java: access modifiers and
 *         non-access modifiers.
 * 
 *         The access modifiers in java specifies accessibility (scope) of a
 *         data member, method, constructor or class.
 * 
 *         There are 4 types of java access modifiers:
 * 
 *         private default protected public
 *
 */
public class AccessModifierExample {
    
    
   
    public static void main(String args[]){
	
	A a = new A();
	a.notAvailableOutsideThepackage();
	a.protectedDisplayInPackage();
	a.defaultMethod();
    }

}
