/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nandakumar 
 * 13-May-2017
 *
 */
public class LastAndFirstDigit {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int testCases = scan.nextInt();
	
	while(testCases >0){
	    
	    int firstDigit = scan.nextInt();
	    int lastDigit = scan.nextInt();
	    
	    StringBuilder sb = new StringBuilder();
	    int countNumbers =0;
	    
	    for(int i=firstDigit; i<=lastDigit; i++){
		
		List<Integer> list = new ArrayList<Integer>();
		int temp = i;
		
		while(temp >=1){
		    
		    int r = temp%10;
		    list.add(r);
		    
		    temp = temp/10;
		    
		}
		
		
		if(list.get(0) == list.get(list.size()-1)){
		    sb = sb.append(i).append(" ");
		    countNumbers++;
		}
		
	    }
	    
	    System.out.println(countNumbers);
	    testCases--;
	}
    }

}
