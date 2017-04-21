/**
 * 
 */
package com.nanda.java.testlab.generics;

/**
 * @author Nandakumar 
 * 18-Apr-2017
 *
 */
public class GenericsClassExample<T> {
    
    public void display(T t){
	
	System.out.println(t.toString());
    }
    
    public static void main(String[] args) {
	
	GenericsClassExample<Employee> emploeeGen = new GenericsClassExample<Employee>();
	emploeeGen.display(new Employee("Nanda"));
    }
}

class Employee{
    
    String name;

    /**
     * @param name
     */
    public Employee(String name) {
	this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Employee [name=" + name + "]";
    }
    
    
    
    
}
