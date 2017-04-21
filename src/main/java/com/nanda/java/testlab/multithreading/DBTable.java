/**
 * 
 */
package com.nanda.java.testlab.multithreading;

/**
 * @author Nandakumar 
 * 17-Apr-2017
 *
 */
public class DBTable {
    
    private static int recordsInserted=0;
    private static int recordsUpdated=0;
    
    synchronized public void  insertRecords(int i){
	
	recordsInserted =i;
	
	
	
	System.out.println(recordsInserted);
	
    }
    
    
    synchronized public static void  updateRecords(int i){
	
	recordsUpdated =i;
	
	
	
	System.out.println(recordsUpdated);
	
    }
    
    

}
