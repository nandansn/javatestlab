/**
 * 
 */
package com.nanda.java.testlab.tweaks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author Nandakumar 06-May-2017
 * 
 *         newInstance method: used to create the object during runtime. Real
 *         time application in web container during run time it creates the
 *         servlet object.
 *         
 *         InstantiationException if there is no no-argument constructor then newInstance method will throw InstantiationException.
 *         ClassNotFoundException if there is no class in the class path/target folder then this excpetio will be thrown
 *         IllegalArgumentException when we try to use wrong method arguments while invoking 
 *         InvocationTargetException when the private method is not accessible 
 *		
 */
public class NewInstances {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
	    ClassNotFoundException, IllegalArgumentException, InvocationTargetException {

	Scanner scan = new Scanner(System.in);
	String className = scan.nextLine();

	Object o = Class.forName(className).newInstance();

	Method[] methods = o.getClass().getDeclaredMethods();

	for (Method method : methods)
	    System.out.println(method.invoke(o,"nanda"));

    }

}

class Test {
    
    
    Test(){
	
    }
    public Test(String arg){
	
    }

    public void display() {

	System.out.println("I am test class object");
    }
}
