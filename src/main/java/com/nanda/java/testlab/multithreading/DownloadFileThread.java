/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 17-Apr-2017
 *
 */
public class DownloadFileThread implements Runnable{

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    public void run() {
	// TODO Auto-generated method stub
	
	System.out.println("Downloading file....");
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	System.out.println("File Downloaded...");
	
	
    }
    
    
}
