/**
 * 
 */
package com.nanda.programcreek;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 18-May-2017
 *
 *Bubble rotate: http://www.programcreek.com/2015/03/rotate-array-in-java/
 */
public class RotateArray {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int order = scan.nextInt();
	int numbers = scan.nextInt();
	int[] array = new int[numbers];
	
	for (int i = 0; i < array.length; i++) {
	    array[i] = scan.nextInt();
	}
	
	for(int i=0; i<order; i++){
	    
	    for(int j=array.length-1; j>0; j--){
		int temp = array[j];
		array[j] = array[j-1];
		array[j-1] = temp;
	    }
	}
	
	for (int i = 0; i < array.length; i++) {
	    
	    System.out.println(array[i]);
	}
	
    }

}
