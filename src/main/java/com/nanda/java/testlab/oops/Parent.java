/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 *
 */
public class Parent {

    public Parent getInstance() {

	return new Parent();

    }

    Parent() {

	System.out.println("Parent Created");
    }
    
    Parent(String name){
	
	System.out.println("Parent name:"+name);
	
    }

}
