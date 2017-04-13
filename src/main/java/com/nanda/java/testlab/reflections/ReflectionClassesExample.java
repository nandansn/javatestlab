/**
 * 
 */
package com.nanda.java.testlab.reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.nanda.java.testlab.oops.Bank;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         Java Reflection makes it possible to inspect classes, interfaces,
 *         fields and methods at runtime, without knowing the names of the
 *         classes, methods etc. at compile time. It is also possible to
 *         instantiate new objects, invoke methods and get/set field values
 *         using reflection.
 *
 */
public class ReflectionClassesExample {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

	Class c = Bank.class;
	// Getting class name
	System.out.println(c.getSimpleName());
	
	// Getting access modifiers
	System.out.println(Modifier.isPublic(c.getModifiers()));
	
	// Getting package info
	System.out.println(c.getPackage());
	
	// getting fields
	for(Field f: c.getFields())
	    System.out.println(f.getName() + " " +f.getType()+" "+f.get(new Bank()));
	
	// getting annotations
	for(Annotation an: c.getAnnotations())
	    System.out.println(an.getClass());
	
	

    }

}
