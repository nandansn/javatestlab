/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 17-Apr-2017
 *
 */
public class MyThread extends Thread{
    
    String threadName;
    int readRecordCount;
    
    
    
    /**
     * @param threadName
     */
    public MyThread(String threadName) {
	this.threadName = threadName;
	
    }
    
    


    /**
     * @param threadName
     * @param readRecordCount
     */
    public MyThread(String threadName, int readRecordCount) {
	this.threadName = threadName;
	this.readRecordCount = readRecordCount;
    }




    public void run(){
	
	for(int i=0; i<readRecordCount; i++){
	    
	    System.out.println("Thread:"+threadName+" Count:"+i);
	}
    }

}
