package com.nanda.magnitude;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.nanda.java.testlab.collections.TreeSetSortingUsingComparatorExample;

public class TestCyclicDependencyScanner {
	
	public static void main(String[] args) {
		
		List<Pair<String, String>> listOfInputPairs = new LinkedList<Pair<String,String>>();
		
		Pair<String, String> inputRow_1 = new Pair("B", "A");
		Pair<String, String> inputRow_2 = new Pair("C", "A");
		
		Pair<String, String> inputRow_3 = new Pair("D", "B");
		
		Pair<String, String> inputRow_4 = new Pair("D", "A");
		
		
		listOfInputPairs.add(inputRow_1);
		listOfInputPairs.add(inputRow_2);
		listOfInputPairs.add(inputRow_3);
		listOfInputPairs.add(inputRow_4);
		
		
		
		CyclicDependencyScanner.findCyclicDependency(listOfInputPairs);
		
	}
	
	

}
