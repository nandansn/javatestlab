/**
 * 
 */
package com.nanda.java.testlab.reflections;

import java.lang.reflect.Method;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         Using Java Reflection you can inspect the methods of classes and
 *         invoke them at runtime. This can be used to detect what getters and
 *         setters a given class has. You cannot ask for getters and setters
 *         explicitly, so you will have to scan through all the methods of a
 *         class and check if each method is a getter or setter.
 * 
 *         First let's establish the rules that characterizes getters and
 *         setters:
 * 
 *         Getter A getter method have its name start with "get", take 0
 *         parameters, and returns a value.
 * 
 *         Setter A setter method have its name start with "set", and takes 1
 *         parameter. Setters may or may not return a value. Some setters return
 *         void, some the value set, others the object the setter were called on
 *         for use in method chaining. Therefore you should make no assumptions
 *         about the return type of a setter.
 */
public class ReflectionGetterSetterExample {
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	
	Class<Employee> c = Employee.class;
	Employee emp = c.newInstance();
	
	
	
	for(Method m: c.getMethods()){
	    m.getName().startsWith("get");
	}
	
	for(Method m: c.getMethods()){
	    m.getName().startsWith("set");
	  }
    }

}
