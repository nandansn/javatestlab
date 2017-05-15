/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

/**
 * @author Nandakumar 13-May-2017
 *
 */
public class MyStack {

    private int top;
    private int[] array;
    private static int size = 5;

    /**
     * @param top
     * @param array
     */
    public MyStack() {
	this.top = -1;
	this.array = new int[size];
    }

    public void push(int number) {
	if(top == size-1){
	    System.out.println("Stack is full...");
	    System.out.println("We are upgrading the size ...please wait...");
	    upgradeStackSize();
	}
	this.top = this.top + 1;
	this.array[top] = number;
    }

    public int top() {
	if (this.top < 0) {

	    System.out.println("Stack is empty");
	    return -1;
	}
	return this.array[this.top];
    }

    public void pop() {
	if (top > -1) {
	    this.top = top - 1;
	}else{
	    System.out.println("Stack is empty");
	}
    }
    
    private void upgradeStackSize(){
	
	int[] tempArray = new int[size];
	int tempArraySize = size;
	for(int i=0; i<size; i++){
	    tempArray[i] = this.array[i];
	}
	size = size +5;
	this.array = new int[size];
	
	for(int i=0; i<tempArraySize; i++){
	    this.array[i] = tempArray[i];
	}
    }

}
