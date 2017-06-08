/**
 * 
 */
package com.nanda.java.testlab.array;

/**
 * @author Nandakumar 
 * 21-May-2017
 *
 */
public class ArraysRuleOne {
    
    public static void main(String[] args) {
	
	int[] a ={10,20,30,40,50};
	int[] b ={11,21};
	
	System.out.println(a.length);
	System.out.println(b.length);
	
	a = b;
	b = a;
	
	System.out.println(a.length);
	System.out.println(b.length);
	
    }

}
