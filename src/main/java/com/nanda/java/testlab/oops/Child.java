/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 *
 */
public class Child extends Parent {

    public Child getInstance() {

	return new Child();
    }

    Child() {

	System.out.println("Child created");
    }
    
    Child(String name){
	
	System.out.println("Child name:"+name);
	
    }

}
