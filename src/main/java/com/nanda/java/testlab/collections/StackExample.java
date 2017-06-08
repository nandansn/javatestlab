/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.Stack;

/**
 * @author Nandakumar 
 * 27-May-2017
 *
 */
public class StackExample {
    
    public static void main(String[] args) {
	
	Stack<String> stack = new Stack<String>();
	stack.push("Nanda");
	stack.push("sanmathi");
	stack.push("nivrithi");
	stack.push("valar");
	
	System.out.println(stack.capacity());
	
	System.out.println(stack.search("valar"));
	System.out.println(stack.search("sanmathi"));
	System.out.println(stack.search("sanmathI"));
	
	
    }

}
