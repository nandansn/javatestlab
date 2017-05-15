/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

/**
 * @author Nandakumar 
 * 13-May-2017
 *
 */
public class MyStackTest {
    
    MyStack myStack;
    
    @BeforeTest
    public void initStack(){
	myStack = new MyStack();
	
    }
    
    @Test(enabled=false)
    public void testPush(){
	
	myStack.push(10);
	myStack.push(11);
	myStack.push(12);
	
	
	
    }
    
    @Test(enabled=false)
    public void testTop(){
	
	
	assertEquals(myStack.top(), 12);
	
    }
    
    @Test(enabled=false)
    public void testPop(){
	
	
	myStack.pop();
	myStack.pop();
	myStack.pop();
	
	
	
    }
    
    @Test(enabled=true)
    public void testStackOverFlow(){
	
	myStack.push(10);
	myStack.push(11);
	myStack.push(12);
	myStack.push(13);
	myStack.push(14);
	myStack.push(15);
	
	System.out.println(myStack.top());
	
	myStack.pop();
	myStack.pop();
	myStack.pop();
	myStack.pop();
	myStack.pop();
	myStack.pop();
	myStack.pop();
	
	myStack.top();
	
	
    }

}
