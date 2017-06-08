/**
 * 
 */
package com.nanda.java.testlab.variables;

/**
 * @author Nandakumar 
 * 21-May-2017
 *
 */
public class LocalVariable {
    
    int[] x = new int[3];
    
    public static void main(String[] args) {
	
	int[] y = new int[3];
	
	LocalVariable lv = new LocalVariable();
	
	System.out.println(lv.x);
	System.out.println(y);
	
	System.out.println(lv.x[0]);
	System.out.println(y[0]);
	
	int x;
	boolean b;
	
	if(b = false){
	    x = 10;
	}else{
	    x = 11;
	}
	System.out.println(x);
    }

}
