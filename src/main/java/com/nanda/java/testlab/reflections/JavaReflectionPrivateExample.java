/**
 * 
 */
package com.nanda.java.testlab.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.nanda.java.testlab.oops.Bank;
import com.nanda.java.testlab.oops.ICICIBank;

/**
 * @author Nandakumar 12-Apr-2017
 *
 */
public class JavaReflectionPrivateExample {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
	    IllegalArgumentException, InvocationTargetException, InstantiationException {

	// getting private method. unable to access private method using
	// reflection api

	Class<Bank> c = Bank.class;
	Method privateMethod = null;
	try {
	    privateMethod = c.getDeclaredMethod("getDetails");
	    privateMethod.invoke(c.newInstance());
	} catch (IllegalAccessException e) {
	    // TODO: handle exception
	    System.err.println(e.getMessage());
	    privateMethod.setAccessible(true);
	    privateMethod.invoke(c.newInstance());
	}

    }

}
