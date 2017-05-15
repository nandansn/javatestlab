/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Nandakumar 14-May-2017
 *
 */
public class ParanthesisChecker {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int testCases = scan.nextInt();

	while (testCases > 0) {

	    String str = scan.next();

	    Stack<Character> stack = new Stack<Character>();
	    boolean balanceFlag = false;

	    for (int i = 0; i < str.length(); i++) {

		if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {

		    stack.push(str.charAt(i));
		} else {

		    if (stack.isEmpty()) {
			balanceFlag = false;
			break;
		    } else {

			if (str.charAt(i) == '}' && stack.peek() == '{' || str.charAt(i) == ']' && stack.peek() == '['
				|| str.charAt(i) == ')' && stack.peek() == '(') {
			    balanceFlag = true;

			} else {
			    balanceFlag = false;
			    break;
			}
			
			stack.pop();

		    }

		}

		
	    }
	    System.out.println(balanceFlag ? "Balanced" : "Not Balanced");
	    testCases--;
	}

    }

}
