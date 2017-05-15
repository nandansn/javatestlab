/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class MyList {
    
    private int array[];
    private int arrayPointer;
    /**
     * @param array
     * @param arrayPointer
     */
    public MyList() {
	this.array = new int[10];
	this.arrayPointer = -1;
    }
    
    public boolean isEmpty(){
	
	if(this.arrayPointer < 0){
	    return true;
	}else{
	    return false;
	}
    }
    
    public int size(){
	
	return arrayPointer + 1;
    }
    
    public void add(int number){
	
	this.arrayPointer  = this.arrayPointer + 1;
	this.array[this.arrayPointer] = number; 
	
    }
    
    public void add(int number, int position){
	
	this.arrayPointer = this.arrayPointer + 1;
	
	for(int i=this.arrayPointer; i>position; i--){
	    
	    array[i] = array[i-1];
	}
	
	array[position] = number;
	
	
    }
    
    public void remove(int number, int position){
	
	for(int i=position; i<this.arrayPointer + 1; i++){
	    
	    this.array[i] = this.array[i + 1];
	}
	
	this.arrayPointer = this.arrayPointer -1;
	
    }
    
    public void remove(){
	
	this.arrayPointer = this.arrayPointer - 1;
        
    }
    
    public int get(int position){
	
	return this.array[position];
    }
}
