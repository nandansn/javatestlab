/**
 * 
 */
package com.nanda.java.testlab.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author Nandakumar 18-May-2017
 *
 */
public class MyTestNG {

    public static void main(String[] args)
	    throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
	    InvocationTargetException, SecurityException, IOException, NandaException {

	Scanner scan = new Scanner(System.in);
	String className = scan.next();

	Class testClass = Class.forName(className);

	Object testObject = testClass.newInstance();

	Method[] methods = testObject.getClass().getMethods();

	File f = new File("");
	FileReader fr = new FileReader(f);
	
	MyTest myTest = new MyTest();
	myTest.testMe();

	for (Method method : methods) {

	}

    }
}
