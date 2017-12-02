/**
 * 
 */
package com.nanda.hackerrank;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Nandakumar 19-May-2017
 *
 */
public class HashMapPhoneBook {

    public static void main(String[] argh) {
	Scanner in = new Scanner(System.in);
	TreeMap<String, String> phoneBook = new TreeMap<String, String>();

	int n = in.nextInt();
	in.nextLine();
	for (int i = 0; i < n; i++) {
	    String name = in.nextLine();
	    Integer phone = in.nextInt();

	    String nameHashCode = "";

	    for (int k = 0; k < name.length(); k++) {

		int num = name.charAt(k);
		nameHashCode = nameHashCode + num;
	    }

	    phoneBook.put(nameHashCode, name+"="+phone);
	    
	   
	    in.nextLine();
	}
	while (in.hasNext()) {
	    String s = in.nextLine();
	    String nameHashCode = "";

	    for (int k = 0; k < s.length(); k++) {

		int num = s.charAt(k);
		nameHashCode = nameHashCode + num;
	    }

	    String foundName = phoneBook.get(nameHashCode);

	    if (foundName == null) {
		System.out.println("Not Found");
	    } else {
		System.out.println(phoneBook.get(nameHashCode));
	    }

	}
    }
}
