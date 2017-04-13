/**
 * 
 */
package com.nanda.java.testlab.string;

import java.util.StringTokenizer;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         The java.util.StringTokenizer class allows you to break a string into
 *         tokens. It is simple way to break string.
 * 
 *         It doesn't provide the facility to differentiate numbers, quoted
 *         strings, identifiers etc. like StreamTokenizer class.
 *
 */
public class StringTokenizerExample {

    public static void main(String... args) {

	String names = "Nanda,Dinesh,,Gnana";

	StringTokenizer st = new StringTokenizer(names, ",");

	System.out.println(st.countTokens());

	/**
	 * StringTokenizer has a serious common-sense problem: It treats
	 * consecutive delimiters as one delimiter. This is not a common or
	 * traditional sense. For example, in csv 'a,,b' means 3 fields with 2nd
	 * field is empty. But in Stringtokenizer it defaultly see this as only
	 * 2 fields, the ',,' is regards as ','.
	 */

	while (st.hasMoreTokens()) {
	    System.out.println(st.nextToken());
	}

	for (String name : names.split(",")) {

	    System.out.println("Name:" + name);
	}
    }

}
