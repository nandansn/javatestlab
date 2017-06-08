/**
 * 
 */
package com.nanda.hackerrank;

import java.util.*;

/**
 * @author Nandakumar 19-May-2017
 *
 */
public class UniqueNumbers {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	List<Integer> numbers = new ArrayList<Integer>();
	int n = in.nextInt();
	int m = in.nextInt();

	for (int i = 0; i < n; i++) {
	    int num = in.nextInt();

	    numbers.add(num);

	}

	List<Integer> maxUniques = new ArrayList<Integer>();
	
	

	for (int i = 0; i < numbers.size()-(m-1); i++) {
	    
	    List<Integer> subArray = new ArrayList<Integer>();

	    for (int j = i; j < (i + m); j++) {
		
		subArray.add(numbers.get(j));
	    }
	    
	    maxUniques.add(displayUniqueNumbers(subArray));
	}

	Collections.sort(maxUniques);
	
	

	System.out.println(maxUniques.get(maxUniques.size()-1));
    }

    public static Integer displayUniqueNumbers(List<Integer> numbers) {

	TreeSet<Integer> set = new TreeSet<Integer>();

	for (Integer integer : numbers) {
	    set.add(integer);
	}

	return set.size();

    }

}
