/**
 * 
 */
package com.nanda.interview.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Nandakumar 
 * 20-May-2017
 *
 */
public class FindingDuplicatesInArrayList {
    
    public static void main(String[] args) {
	
	List<String> names = new ArrayList<String>();
	
	names.add("nanda");
	names.add("kumar");
	names.add("sekar");
	names.add("nanda");
	
	Set<String> dupes = new HashSet<String>();
	
	for (String string : names) {
	    
	    if(!dupes.add(string)){
		System.out.println("Duplicate:"+string);
	    }
	}
    }

}
