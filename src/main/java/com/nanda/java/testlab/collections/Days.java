/**
 * 
 */
package com.nanda.java.testlab.collections;

/**
 * @author Nandakumar 
 * 15-Apr-2017
 *
 */
public enum Days {
    
    Monday(2),
    Tuesday(3),
    Wednessday(4),
    Thursday(5),
    Friday(6),
    Saturday(7),
    Sunday(1);
    
    int dayOftheWeek;
    
    private Days(int dayOfTheWeek){
	
	this.dayOftheWeek = dayOfTheWeek;
    }
    
    public int getDayOfTheWeek(){
	
	return this.dayOftheWeek;
    }

}
