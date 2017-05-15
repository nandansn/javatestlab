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
@Test(sequential=true)
public class MyQueueTest {
    
    MyQueue queue;
    
    @BeforeTest
    public void initQueue(){
	
	queue = new MyQueue();
	
    }
    
    @Test
    public void testEnqueue(){
	
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	queue.enqueue(4);
	queue.enqueue(5);
	queue.enqueue(6);
	
	
    }
    
    @Test(dependsOnMethods="testEnqueue")
    public void testFront(){
	
	assertEquals(queue.front(), 1);
	
	
    }
    
    @Test(dependsOnMethods="testFront")
    public void testDequeue(){
	
	assertEquals(queue.front(), 1);
	queue.deqeue();
	assertEquals(queue.front(), 2);
	queue.deqeue();
	assertEquals(queue.front(), 3);
	queue.deqeue();
	assertEquals(queue.front(), 4);
	queue.deqeue();
	assertEquals(queue.front(), 5);
	queue.deqeue();
	assertEquals(queue.front(), 6);
	queue.deqeue();
	
	assertEquals(queue.front(), -1);
	
	
    }

}
