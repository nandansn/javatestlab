/**
 * 
 */
package com.nanda.java.testlab.string;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 11-May-2017
 *
 */
public class CamelCase {
    
    public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int countWords = 1;
        
        for(int i=0; i<s.length(); i++){
            
            int ascii = s.charAt(i);
            
            if(ascii > 64 && ascii < 91 ){
        	countWords++;
            }
        }
        
        System.out.println(countWords);
    }

}
