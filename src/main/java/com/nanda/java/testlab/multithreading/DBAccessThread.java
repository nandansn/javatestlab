/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 17-Apr-2017
 *
 */
public class DBAccessThread implements Runnable {
    
    DBTable dbTable = new DBTable();

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {

	
	// TODO Auto-generated method stub
	for (int i = 0; i < 10; i++) {
	    dbTable.insertRecords(i);
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }

	}
    }

}
