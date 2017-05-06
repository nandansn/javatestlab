/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Nandakumar 01-May-2017
 *
 */
public class UserLogins {

    public static void main(String[] args) {

	String[] userLogins = { "u1", "u4", "u2", "u1", "u3", "u1", "u2", "u3" };

	Map<String, Integer> userLoginCountMap = new HashMap<String, Integer>();

	for (int i = 0; i < userLogins.length; i++) {

	    String user = userLogins[i];

	    if (userLoginCountMap.size() >= 1) {

		Integer count = userLoginCountMap.get(user);
		if (count != null) {
		    count = count + 1;
		    userLoginCountMap.put(user, count);
		}else{
		    count = 1;
		    userLoginCountMap.put(user, count);
		}
	    } else {
		Integer count = 1;
		userLoginCountMap.put(user, count);
	    }

	}

	Set<Entry<String, Integer>> mapEntry = userLoginCountMap.entrySet();

	Iterator<Entry<String, Integer>> mapIterator = mapEntry.iterator();

	while (mapIterator.hasNext()) {

	    Entry<String, Integer> entry = mapIterator.next();
	    System.out.println(entry.getKey() + " value:" + entry.getValue());
	}

    }

}
