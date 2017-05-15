/**
 * 
 */
package com.nanda.java.numbers;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Nandakumar 
 * 10-May-2017
 *
 */
public class NumberExample {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder hash = new StringBuilder();
        for(int i=0; i<n; i++){
            int f = (n+1);
            
            
            hash = hash.append("#");
            System.out.println(String.format("%"+f+"s", hash));
        }
    }

}
