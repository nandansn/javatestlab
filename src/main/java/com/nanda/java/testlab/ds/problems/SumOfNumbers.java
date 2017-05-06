/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 
 * 24-Apr-2017
 *
 */
public class SumOfNumbers {
    
    public static int sum(Integer[] numbers){
	
	int sum=0;
	for(int n:numbers)
	    sum = sum +n;
	
	return sum;
    }
    
    public static void main(String[] args) {
	
	Integer[] numbers = new Integer[5];
	
	numbers[0] =1;
	numbers[1] =2;
	numbers[2] =3;
	numbers[3] =4;
	numbers[4] =5;
	
	
	
	
	
	System.out.println(sum(numbers));
    }

}
