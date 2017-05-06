/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 30-Apr-2017
 *
 */
public class MyRunnableDemo {
    
    	public static void main(String[] args) {
    	    
    	    MyRunnableOne my = new MyRunnableOne();
    	    
    	    Thread t = new Thread(my);
    	    
    	    
	    
    	    
	}

}

class MyRunnableOne implements Runnable{

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    public void run() {
	// TODO Auto-generated method stub
	
	System.out.println(this.getClass().getSimpleName());
	
    }
    
    
}

