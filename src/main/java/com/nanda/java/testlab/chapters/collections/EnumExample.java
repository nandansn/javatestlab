/**
 * 
 */
package com.nanda.java.testlab.chapters.collections;

import com.nanda.java.testlab.collections.Days;

/**
 * @author Nandakumar 
 * 15-Apr-2017
 *
 */
public class EnumExample {
    
    public static void main(String[] args) {
	
	for(Days day: Days.values())
	    System.out.println(day+" is "+day.getDayOfTheWeek()+" day of the week");
    }

}
