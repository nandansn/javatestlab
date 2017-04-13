/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 
 * 11-Apr-2017
 *
 */
public class Nokia implements Mobile{

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.oops.Phone#dial()
     */
    @Override
    public void dial() {
	// TODO Auto-generated method stub
	
	System.out.println("Dialing the number...");
	
    }

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.oops.Phone#drop()
     */
    @Override
    public void drop() {
	// TODO Auto-generated method stub
	
	System.out.println("Dropped the call...");
	
    }

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.oops.Mobile#sendSMS()
     */
    @Override
    public void sendSMS() {
	// TODO Auto-generated method stub
	System.out.println("Sending message..");
    }

}
