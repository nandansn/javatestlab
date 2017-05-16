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
	String str1 = scan.next();
	//String str2 = scan.next();

	System.out.println(bobThere(str1));
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

	while (k < subString.length && subString.length > (k + 3)) {

	    if (subString[k] == 'c' && subString[k + 1] == 'o' && subString[k + 3] == 'e') {

		count++;

		k = k + 4;
	    } else {
		k++;
	    }

	}

	return count;
    }

    public static boolean endOther(String a, String b) {

	boolean stringCheck = false;

	a = a.toLowerCase();
	b = b.toLowerCase();

	int lengthOfA = a.length();
	int lengthOfB = b.length();

	if (lengthOfA == lengthOfB) {

	    if (a.equals(b)) {
		stringCheck = true;
		return stringCheck;
	    }
	}

	if (lengthOfA < lengthOfB) {
	    int indexOfAinB = b.lastIndexOf(a);

	    if (indexOfAinB < 0) {
		return false;
	    } else {
		if ((b.length() - indexOfAinB) == a.length()) {
		    return true;
		} else {
		    return false;
		}
	    }

	} else {

	    int indexOfBinA = a.lastIndexOf(b);

	    if (indexOfBinA < 0) {
		return false;
	    } else {
		if ((a.length() - indexOfBinA) == b.length()) {
		    return true;
		} else {
		    return false;
		}
	    }
	}

    }

    public static boolean xyzThere(String str) {

	boolean xyzThere = false;

	if (str.indexOf("xyz") < 0) {
	    return false;
	}

	if (str.indexOf("xyz") == 0) {
	    return true;
	} else {
	    int i = 0;
	    while (i < str.length()) {
		if (str.charAt(str.indexOf("xyz",i) - 1) == '.' && str.indexOf("xyz",i)+3 == str.length()) {
		    return false;
		} 
		
		i = str.indexOf("xyz",str.indexOf("xyz",i) +1);
		
		if(i == -1){
		    break;
		}
	    }
	    
	    return true;

	}

    }
    
    public static boolean bobThere(String str) {
	  
	int bobThereStringArrayLength = str.length()/3;
	
	String[] bobThereStringArray = new String[bobThereStringArrayLength];
	
	
	int arrayIndex=0;
	int subStringIndex = 0;
	
	while(arrayIndex < bobThereStringArrayLength){
	     
	    bobThereStringArray[arrayIndex] = str.substring(subStringIndex, subStringIndex+3);
	    
	    subStringIndex = subStringIndex + 3;
	    arrayIndex++;
	}
	
	for(int i=0; i<bobThereStringArrayLength; i++)
	{
	    if(bobThereStringArray[i].charAt(0) =='b' && bobThereStringArray[i].charAt(2) =='b'){
		return true;
	    }
	}
	
	return false;
    }


}
