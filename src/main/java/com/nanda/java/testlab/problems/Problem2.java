/**
 * 
 */
package com.nanda.java.testlab.problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nandakumar 
 * 25-Apr-2017
 *
 */
public class Problem2 {
    
    public static int get_int_val() throws IOException {
        int number =0;
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            number = sc.nextInt();
        }else{
            sc.close();
        }
        
        
    System.out.println(number);
        
    return number;
    }
    
    public static void main(String[] args) throws IOException {
	
	System.out.println(get_int_val());
	System.out.println(get_int_val());
        
        
        /*String[] arrayList = new String[A.length()-2];
        
        for(int i=0; i<A.length(); i++){
            if((i+3) <= A.length()){
            arrayList[i] = A.substring(i, i+3);
            }
        }
        
        for(int i=0; i<arrayList.length; i++){
            for(int j=0; j<arrayList.length; j++){
        	if(arrayList[i].compareTo(arrayList[j]) < 1){
        	    String temp = arrayList[i];
        	    arrayList[i] = arrayList[j];
        	    arrayList[j] = temp;
        	}
            }
            
        }
        
        
	    
            System.out.println(arrayList[0]);
            System.out.println(arrayList[arrayList.length-1]);
	
        
        
       */ 
        
    }

}
