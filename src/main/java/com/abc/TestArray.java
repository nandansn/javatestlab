/**
 * 
 */
package com.abc;

/**
 * @author Nandakumar 
 * 03-May-2017
 *
 */
public class TestArray {
    
    public static void main(String[] args) {
	 int myArray[] ={1,2,3,4,5};
	 
	 for (int i = 0; i < myArray.length; i++) {
	    System.out.println(myArray[i]);
	}
    }

}

class ChangeIt{
    
    static  void doIt(int[] z){
	
	int temp =z[z.length - 1];
	
	z[0] = temp;
    }
}
