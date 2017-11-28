package com.nanda.java.testlab.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("nanda");
		
		List<Integer>arr = new ArrayList<Integer>();
		
		
		
		
	}
	
	public static void methodOne(ArrayList<? extends Number> al) {
		
		al.get(0);
	}
	
	public static void methodTwo(ArrayList<? super Integer> al) {
		
		al.add(new Integer("10"));
		
	}

	
	
}
