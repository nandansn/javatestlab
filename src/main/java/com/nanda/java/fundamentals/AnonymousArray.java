/**
 * 
 */
package com.nanda.java.fundamentals;

/**
 * @author Nandakumar 
 * 13-May-2017
 *
 */
public class AnonymousArray {
    
    public static void main(String[] args) {
	
	display(new int[]{10,30,5,67});
    }
    
    static void display(int[] array){
	
	for (int i : array) {
	    System.out.println(i);
	}
	
    }
    

}
