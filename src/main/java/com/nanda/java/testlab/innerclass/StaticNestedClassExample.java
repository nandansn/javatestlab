/**
 * 
 */
package com.nanda.java.testlab.innerclass;

/**
 * @author Nandakumar 17-Apr-2017
 * 
 *         Java static nested class
 * 
 *         A static class i.e. created inside a class is called static nested
 *         class in java. It cannot access non-static data members and methods.
 *         It can be accessed by outer class name.
 * 
 *         It can access static data members of outer class including private.
 *         Static nested class cannot access non-static (instance) data member
 *         or method.
 *
 */
public class StaticNestedClassExample {
    
     static String staticName ="StaticNestedClassExample";
    
    public static void outerClassMethod(){
	
	System.out.println("Outer Class Method");
    }
    
    static class StaticNested{
	
	String staticName;
	
	public void display(){
	    System.out.println(StaticNestedClassExample.staticName);
	    outerClassMethod();
	}
	
	
	public static void main(String[] args) {
	    
	    StaticNestedClassExample.StaticNested staticNested = new StaticNested();
	    staticNested.display();
	    
	}
    }

}
