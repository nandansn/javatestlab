/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 17-Apr-2017
 *
 */
public class CreateUserThread implements Runnable{

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    public void run() {
	// TODO Auto-generated method stub
	System.out.println("Creaating User.....");
	try {
	    Thread.sleep(3000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	System.out.println("User Created");
	
    }

}
