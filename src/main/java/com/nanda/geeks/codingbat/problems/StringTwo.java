/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 15-May-2017
 *
 */
public class StringTwo {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	String str = scan.next();

	System.out.println(countCode(str));
    }

    public static String doubleChar(String str) {

	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < str.length(); i++) {

	    sb = sb.append(str.charAt(i)).append(str.charAt(i));

	}

	return sb.toString();
    }

    public static int countHi(String str) {

	int count = 0;
	int i = -1;
	while (i < str.length()) {

	    int index = str.indexOf("Hi", i + 1);

	    if (index >= 0) {
		count++;
		i = index;
	    } else {
		i++;
	    }

	}

	return count;

    }

    public static boolean catDog(String str) {

	int catCount = 0;
	int dogCount = 0;

	int i = -1;

	while (i < str.length()) {

	    int index = str.indexOf("cat", i + 1);

	    if (index >= 0) {

		i = index;
		catCount++;
	    } else {
		i++;
	    }
	}

	i = -1;
	while (i < str.length()) {

	    int index = str.indexOf("dog", i + 1);

	    if (index >= 0) {

		i = index;
		dogCount++;
	    } else {
		i++;
	    }
	}

	return catCount == dogCount ? true : false;
    }

    public static int countCode(String str) {

	int count = 0;



	char subString[] = new char[str.length()];

	int i = 0;

	while (i < (str.length())) {

	    subString[i] = str.charAt(i);

	    i++;

	}

	int k = 0;

	while (k < subString.length && subString.length > (k+3)) {

	    if (subString[k] == 'c' && subString[k + 1] == 'o' && subString[k + 3] == 'e') {

		count++;

		k = k + 4;
	    }else{
		k++;
	    }
	    

	}

	return count;
    }

}
