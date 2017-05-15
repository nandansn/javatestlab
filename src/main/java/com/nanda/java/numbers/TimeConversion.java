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
public class TimeConversion {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        StringBuilder sb = new StringBuilder(time);
        if(sb.substring(sb.length()-2, sb.length()).equalsIgnoreCase("PM")){
            if(sb.substring(0, 2).equalsIgnoreCase("12")){
        	sb.replace(sb.length()-2, sb.length(), "");
        	System.out.println(sb);
            }else{
        	if(Integer.parseInt(sb.substring(0, 2)) < 12){
        	    Integer hour = Integer.parseInt(sb.substring(0, 2)) + 12;
        	    sb.replace(0, 2, hour.toString());
        	    sb.replace(sb.length()-2, sb.length(), "");
        	    System.out.println(sb);
        	}
            }
            
        }else{
            if(sb.substring(0, 2).equalsIgnoreCase("12")){
        	sb.replace(0, 2, "00");
        	sb.replace(sb.length()-2, sb.length(), "");
        	System.out.println(sb);
            }else{
        	sb.replace(sb.length()-2, sb.length(), "");
        	System.out.println(sb);
            }
        }
        
        
    }

}
