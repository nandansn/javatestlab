/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

/**
 * @author Nandakumar 
 * 13-May-2017
 *
 */
public class MyQueue {
    
    private int[] array;
    private int front;
    private int last;
    
    private static int size = 5;

    /**
     * @param array
     * @param front
     * @param last
     */
    public MyQueue() {
	this.array = new int[size];
	this.front = 0;
	this.last = -1;
    }
    
    
    public void enqueue(int number){
	
	if(this.last == size-1){
	    System.out.println("queue is full...");
	    System.out.println("we are upgrading the queue size...please wait...");
	    upgradeSize();
	}
	
	this.last = this.last + 1;
	
	array[this.last] = number;
    }
    
    public void upgradeSize(){
	
	int[] tempArray = new int[size];
	int tempArraySize = size;
	for(int i=0; i<size; i++){
	    tempArray[i] = array[i];
	}
	size = size + 5;
	
	array = new int[size];
	for(int i=0; i<tempArraySize; i++){
	    array[i] = tempArray[i];
	}
	
	
	
    }
    
    public void deqeue(){
	
	if(this.front > this.last){
	    System.out.println("queue empty");
	}else{
	    this.front = this.front + 1;
	}
	
	
    }
    
    
    public int front(){
	if(this.front > this.last){
	    System.out.println("queue empty");
	    return -1;
	}else{
	    return array[this.front];
	}
	
	
    }
    
    
    
    

}
