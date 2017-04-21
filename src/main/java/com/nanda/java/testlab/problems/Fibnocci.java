/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 17-Apr-2017
 *
 */
public class Fibnocci {
    
    void fibnocci(int n)
    {
	while(n <= 0){
	    
	    
	}
	
    }
    
    public static void main(String[] args) {
	
	int f =0;
	int k =1;
	 System.out.println(f);
	for (int i = 0; i < 8; i++) {
	    
	    f = f + k;
	    System.out.println(f);
	    k = f - k;
	}
    }

}
