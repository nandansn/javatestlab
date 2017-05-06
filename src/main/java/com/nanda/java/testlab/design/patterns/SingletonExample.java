/**
 * 
 */
package com.nanda.java.testlab.design.patterns;

/**
 * @author Nandakumar 
 * 27-Apr-2017
 *
 */
public class SingletonExample {
    
    public static void main(String[] args) {
	
	for (int i = 0; i < 10; i++) {
	    System.out.println(SingleTonSatelite.getInstance().hashCode());
	    
	}
	
    }

}
