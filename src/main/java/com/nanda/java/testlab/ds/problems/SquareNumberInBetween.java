/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 
 * 24-Apr-2017
 *
 */
public class SquareNumberInBetween {
    
    public static void main(String[] args) {
	
	int a =17; int b=24;
	int start = a;
	
	int sqcount =0;
	
	for(int i=2; i<=b; i++){
	    int k = i*i;
	while(a<=b){
	    
	    if((k)<=9){
	    if(k==a){
		
		sqcount =sqcount +1;
		System.out.println(a);
	    }
	    
	    }
	    else{
		break;
	    }
	    a = a+ 1;
	    
	    
	}
	
	a =start;
	
	}
	
	System.out.println(sqcount);
    }

}
