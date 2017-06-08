/**
 * 
 */
package com.nanda.java.fundamentals;

import java.lang.reflect.Method;

/**
 * @author Nandakumar 
 * 18-May-2017
 *
 */
public class GetClassExample {
    
    public static void main(String[] args) {
	
	Object o = new Integer(10).getClass();
	
	Method[] methods = o.getClass().getDeclaredMethods();
	
	for(Method m: methods){
	    
	    
	    
	    
	}
	
	
    }

}
