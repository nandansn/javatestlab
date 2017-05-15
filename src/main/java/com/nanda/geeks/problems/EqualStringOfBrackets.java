/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 14-May-2017
 *
 */
public class EqualStringOfBrackets {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int numberOfTest = scan.nextInt();

	while (numberOfTest > 0) {

	    String stringOfBrackets = scan.next();

	    int index = 0;
	    int count = 0;
	    int lengthOfString = stringOfBrackets.length();
	    int openBrackets[] = new int[lengthOfString];
	    int closeBrackets[] = new int[lengthOfString];

	    for (int i = 0; i < stringOfBrackets.length(); i++) {

		if (stringOfBrackets.charAt(i) == '(') {

		    count++;

		}

		openBrackets[i] = count;

	    }
	    
	    count = 0;
	    for (int i = stringOfBrackets.length() -1 ; i >=0 ; i--) {

		if (stringOfBrackets.charAt(i) == ')') {

		    count++;

		}

		closeBrackets[i] = count;

	    }
	    
	    int splitIndex = lengthOfString -1;
	    for(int i=0; i< lengthOfString -1; i++){
		
		if(openBrackets[i] == closeBrackets[i+1]){
		    
		    splitIndex =i;
		    
		}
	    }
	    
	    System.out.println(splitIndex+1);
	    numberOfTest--;
	}
    }

}
