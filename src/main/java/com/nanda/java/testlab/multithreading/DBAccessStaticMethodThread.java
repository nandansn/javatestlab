/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 17-Apr-2017
 *
 */
public class DBAccessStaticMethodThread implements Runnable{
    
    

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {

	
	// TODO Auto-generated method stub
	for (int i = 0; i < 10; i++) {
	    DBTable.updateRecords(i);
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }

	}
    }

}
