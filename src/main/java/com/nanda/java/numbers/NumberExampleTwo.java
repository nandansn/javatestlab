/**
 * 
 */
package com.nanda.java.numbers;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 11-May-2017
 *
 */
public class NumberExampleTwo {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        
        arr = sortArray(arr);
        
        for(long number: arr){
            System.out.println(number);
        }
        
        long sumOfSmallNumbers = 0;
        for(int i=0; i < 5-1; i++){
            sumOfSmallNumbers = sumOfSmallNumbers + arr[i];
        }
        
        long sumOfBigNumbers = 0;
        for(int i=4; i > 0; i--){
            sumOfBigNumbers = sumOfBigNumbers + arr[i];
        }
        
        System.out.println(sumOfSmallNumbers+" "+sumOfBigNumbers);
    }
    
    public static long[] sortArray(long[] array){
	int minValuePosition = 0;
        for(int i=0; i<array.length -1; i++){
            minValuePosition = i;
            for(int j=i+1; j<array.length; j++){
                if(array[minValuePosition] > array[j]){
                    minValuePosition = j;
                    
                }
            }
            
            long temp = array[minValuePosition];
            array[minValuePosition] = array[i];
            array[i] = temp;
            
        }
        return array;
    }

}
