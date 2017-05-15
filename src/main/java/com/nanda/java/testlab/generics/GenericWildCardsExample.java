/**
 * 
 */
package com.nanda.java.testlab.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Nandakumar 08-May-2017
 * 
 *         Wild Card -> <?>.
 * 
 *         methodM1(ArrayList<String> al) 
 *         - we can call this method by passing
 *         ArrayList of only string type.
 *         - within the method we can add only
 *         string type of objects to the list. if we try to add any other type,
 *         then compiler will throw an error.
 *                
 * 
 * 	  methodM1(ArrayList<?> al)
 * 		- we can call this method by passing ArrayList of any type.
 * 		- But with in the method we cant add anything to the list except null. because 
 * 		  we don't know the type exactly. null is allowed because it is valid value for
 * 		  any type.
 * 
 * 		- This type of methods are best suitable for read only operation
 * 
 * 	  methodM1(ArrayList<? extends x> l)
 * 		- x can be either class or interface.
 * 		- if x is a class then we can call this method by passing array list of either x type or its child classes.
 *             	- if x is an interface then we can call this method by passing array list of either x type or its implementation classes.
 *              -  but with in the method we cant add anything to the list except null. because we dont know the type of x exactly. this type of methods also best suitable for read only operation.
 *         
 *          methodM1(ArrayList<? super x> l)
 *          	- x can be either or class interface.
 *          	- if x is a class then we can call this method by passing array list of either x type or its super classes.
 *              - if x is an interface then we can call this by passing array list of either x type or super class of implementation class of x.
 *              - within the method we can add X type of objects and null to the list.
 *              - super is allowed at the method level.	
 *                  	
 *             
 * 			
 *
 */
public class GenericWildCardsExample {
    
    public static void main(String[] args) {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	al.add(10);
	Arithmetic2.display(al);
	
    }
}

class Arithmetic2{
    
    public static void display(ArrayList<?> numbers){
	
	for (int i = 0; i < numbers.size(); i++) {
	    System.out.println(numbers.get(i));
	}
	
	
    }
    
    public void add(ArrayList<? extends Number> al){
	
	//al.add(new Integer(10)); Invalid
    }
    
    public void addNumbers(ArrayList<? super MyNumbers> al){
	
	al.add(new MyNumbers());
    }
    
}

class MyNumbers extends Number{

    /* (non-Javadoc)
     * @see java.lang.Number#doubleValue()
     */
    @Override
    public double doubleValue() {
	// TODO Auto-generated method stub
	return 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Number#floatValue()
     */
    @Override
    public float floatValue() {
	// TODO Auto-generated method stub
	return 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Number#intValue()
     */
    @Override
    public int intValue() {
	// TODO Auto-generated method stub
	return 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Number#longValue()
     */
    @Override
    public long longValue() {
	// TODO Auto-generated method stub
	return 0;
    }
    
    
}
