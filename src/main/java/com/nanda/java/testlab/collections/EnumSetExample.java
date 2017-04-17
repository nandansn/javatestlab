/**
 * 
 */
package com.nanda.java.testlab.collections;

import java.util.EnumSet;



/**
 * @author Nandakumar 
 * 15-Apr-2017
 * 
 * We need cursors to access the objects from the collection.
 * 
 * There are three types of cursors,
 * 	Enumeration
 * 	Iterator
 * 	ListIterator
 * 
 * Enum is special class that defines constants. variables of that type must be equal to one of the constant values that have been pre-defined.
 *	When to use ENUM:
 *		for fixed set of constants.
 * enum has the static method called values.
 * enum constants are implicitly static.
 * enum class should be package private or the constructor should be private
 *
 */
public class EnumSetExample {
    
    public static void main(String[] args) {
	
	java.util.Set<Days> setOfDays =EnumSet.allOf(Days.class);
	
	for(Days day:setOfDays)
	    System.out.println(day.dayOftheWeek);
    }

}
