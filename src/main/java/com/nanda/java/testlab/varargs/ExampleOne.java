/**
 * 
 */
package com.nanda.java.testlab.varargs;

/**
 * @author Nandakumar 
 * 22-May-2017
 *
 */
public class ExampleOne {
    
    public static void main(String[] args) {
	
	sum(10);
	sum(10,20);
	sum(10,20,30)
;	
	
    }
    
    public static void sum(int...number){
	
	int sum =0;
	
	for(int n: number){
	sum = sum + n;
	}
	
	System.out.println(sum);
    }

}
