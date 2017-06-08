/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Nandakumar 
 * 25-May-2017
 *
 */
public class QueueInterfaceExample {
    
    public static void main(String[] args) {
	
	Queue<String> mails = new PriorityQueue<String>();
	
	mails.add("nanda");
	mails.add("kumar");
	
	
	
	for (String string : mails) {
	    
	    System.out.println(string);
	}
	
	while(mails.size()>0){
	    System.out.println(mails.poll());
	}
    }

}
