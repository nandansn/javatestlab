/**
 * 
 */
package com.nanda.java.testlab.innerclass;

/**
 * @author Nandakumar 17-Apr-2017
 * 
 *         Java inner class or nested class is a class i.e. declared inside the
 *         class or interface.
 * 
 *         We use inner classes to logically group classes and interfaces in one
 *         place so that it can be more readable and maintainable.
 * 
 *         Additionally, it can access all the members of outer class including
 *         private data members and methods.
 * 
 *         A class that have no name is known as anonymous inner class in java.
 *         It should be used if you have to override method of class or
 *         interface. Java Anonymous inner class can be created by two ways:
 * 
 *         Class (may be abstract or concrete). Interface
 * 
 *         Java Local inner class
 * 
 *         A class i.e. created inside a method is called local inner class in
 *         java. If you want to invoke the methods of local inner class, you
 *         must instantiate this class inside the method.
 * 
 *         1) Local inner class cannot be invoked from outside the method. 2)
 *         Local inner class cannot access non-final local variable till JDK
 *         1.7. Since JDK 1.8, it is possible to access the non-final local
 *         variable in local inner class.
 *
 */
public class InnerClassExample {
    
    String name;
    
    
    
    /**
     * @param name
     */
    public InnerClassExample(String name) {
	this.name = name;
    }
    
    

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "InnerClassExample [name=" + name + "]";
    }



    class InnerClass {
	
	int a;
	String name;
	/**
	 * @param a
	 * @param name
	 */
	public InnerClass(int a, String name) {
	    this.a = a;
	    this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	    return "InnerClass [a=" + a + ", name=" + name + "]";
	}
	
	
    }
    
    public static void main(String[] args) {
	
	InnerClassExample one = new InnerClassExample("Outer");
	System.out.println(one.toString());
	
	InnerClassExample.InnerClass oneInner = one.new InnerClass(10, "Inner");
	System.out.println(oneInner.toString());
	
	
	
	
    }

}
