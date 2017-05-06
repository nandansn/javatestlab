/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nandakumar 01-May-2017
 *
 */
public class StreamOfNaturalNumbers {

    public static void main(String[] args) {

	int[] j = { 2, 3, 4 };

	List<String> streamOfNumbers = new ArrayList<String>();
	for (Integer i = 1; i < 51; i++) {
	    streamOfNumbers.add(i.toString());

	}

	for (int m : j) {

	    List<String> tempList = new ArrayList<String>();

	    int k = 1;
	    for (int s = 0; s < streamOfNumbers.size(); s++) {
		k = (s+1) * m;
		//System.out.println(k);
		if (k < streamOfNumbers.size()) {
		    tempList.add(streamOfNumbers.get(k - 1));
		}

	    }

	    for (String number : tempList) {
		streamOfNumbers.remove(number);
	    }
	}

	System.out.println(streamOfNumbers.size());
	for(String str:streamOfNumbers)
	System.out.println(str);

    }

}
