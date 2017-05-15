/**
 * 
 */
package com.nanda.java.testlab.generics;

/**
 * @author Nandakumar 
 * 18-Apr-2017
 * 
 * Until 1.4 version in non-generics of ArrayList is declared as follows,
 * 	Class ArrayList{
 * 		We can add any type of object. This is not type safe.
 * 		add(Object o){
 * 
 * 	}
 * 	
 *	We can object of type Object so we need type casting here.
 * 	Object get(int i){
 * 	}
 * In 1.5 generics introduced to resolve this issue. Parameterized classes are generics classes or template classes. 
 * 
 * 	Class ArrayList<T>{
 * 		add(T t){
 * 		}
 * 	T get(int i){
 * 
 * 	}
 * 
 * when we declare ArrayList<String> al = new ArrayList<String>();
 * 
 * compiler transforms above array list code like this,
 * 	
 *  	class ArrayList<String>{
 *  	add(String t){
 *  	}
 *  
 *  	String get(int i)
	
 *  	}
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
