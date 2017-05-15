/**
 * 
 */
package com.nanda.java.fundamentals;

/**
 * @author Nandakumar 
 * 13-May-2017
 *
 */
public class TwoDArrayCreation {
    
    public static void main(String[] args) {
	
	int[][] twodArray = new int[2][];
	
	twodArray[0] = new int[2];
	twodArray[1] = new int[3];
	
	System.out.println(twodArray);
	System.out.println(twodArray[0]);
	System.out.println(twodArray[0][0]);
	
	
	int[][][] threedArray = new int[2][1][];
	
	System.out.println(threedArray);
	System.out.println(threedArray[0]);
	System.out.println(threedArray[0][0]);
	System.out.println(threedArray[0][0][0]);
	
    }

}
