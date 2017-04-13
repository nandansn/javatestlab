/**
 * 
 */
package com.nanda.java.testlab.exceptions;

import java.io.IOException;

/**
 * @author Nandakumar 
 * 12-Apr-2017
 *
 */
public class ChildWithException extends ParentWithException{

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.exceptions.ParentWithException#add()
     */
    @Override
    public void add()  {
	// TODO Auto-generated method stub
	super.add();
    }

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.exceptions.ParentWithException#file()
     */
    @Override
    public void file() throws IOException  {
	// TODO Auto-generated method stub
	super.file();
    }
    
    

}
