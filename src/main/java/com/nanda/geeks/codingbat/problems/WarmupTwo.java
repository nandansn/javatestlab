/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

/**
 * @author Nandakumar 17-May-2017
 *
 */
public class WarmupTwo {

    public static void main(String[] args) {
	
	doubleX("axxbc");
    }

    static boolean  doubleX(String str) {

	if (str.indexOf('x') + 1 <= str.length() - 1) {

	    if (str.charAt(str.indexOf('x')) == str.charAt(str.indexOf('x') + 1))
		return true;
	    else
		return false;

	} else {
	    return false;
	}

    }

}
