package com.nanda.java.testlab.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList();
		names.add("nanda");
		names.add("kumar");
		
		System.out.println(names.get(-1));
	}

}
