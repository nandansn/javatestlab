/**
 * 
 */
package com.nanda.java.testlab.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 25-Apr-2017
 *
 */
public class Solution {
    
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length() + B.length());
        
        if(B.compareTo(A) >=0 || B.equals(A)){
            System.out.println("No");
            
        }else {
            System.out.println("Yes");
        }
        
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1,A.length()) +" "+ B.substring(0, 1).toUpperCase() + B.substring(1,A.length()));
        
        
        
    }

}
