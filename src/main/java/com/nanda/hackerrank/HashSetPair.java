/**
 * 
 */
package com.nanda.hackerrank;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Nandakumar 
 * 19-May-2017
 *
 */
public class HashSetPair {
    
    public class kumar{
	
	HashSetPair hash = new HashSetPair();
	
	HashSetPair.kumar k = new kumar();
	HashSetPair.nanda n = new nanda();
	
    }
    
   
    
    
    static class nanda{
	
	int n;
	String name;
	
    }
    
   
    
    public static void main(String[] args) {
	
	 HashSetPair.nanda my = new nanda();
	 HashSetPair kh = new HashSetPair();
	 
	
	 
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet<String> uniquePair = new HashSet<String>();
        
        for (int i = 0; i < t; i++) {
            
            uniquePair.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(uniquePair.size());
           
        }
    }
    

}
