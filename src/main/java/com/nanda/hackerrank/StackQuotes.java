/**
 * 
 */
package com.nanda.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Nandakumar 18-May-2017
 *
 */
public class StackQuotes {

    public static void main(String []argh)
    {
       Scanner scan = new Scanner(System.in);
       
       while (scan.hasNext()) {
          Stack<Character> quotes = new Stack<Character>();

 	String quote = scan.next();
 	
 	boolean flag = false;
 	
 	for (int i = 0; i < quote.length(); i++) {
 	    
 	   flag = false;
 	    
 	    if(quote.charAt(i) == '{' || quote.charAt(i) == '[' || quote.charAt(i) == '('){
 		
 		quotes.push(quote.charAt(i));
 		    
 		} else{
 		    
 		    if(quotes.isEmpty()){
 			
 			flag = false;
 			break;
 		    }else{
 			
 			if((quote.charAt(i) == '}' && quotes.pop() == '{') ||
 				(quote.charAt(i) == ']' && quotes.pop() == '[') ||
 				(quote.charAt(i) == ')' && quotes.pop() == '(')
 				){
 			    flag = true;
 			}else{
 			    flag = false;
 			    break;
 			}
 		    }
 	    }
 	}
 	
 	if(quotes.isEmpty() && flag){
 	    flag = true;
 	}else{
 	    flag = false;
 	}
 	
 	System.out.println(flag);
       }
       
    }

}
