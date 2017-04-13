package com.nanda.java.testlab.chapters.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

	public static void main(String args[]) {

		List<String> names = Arrays.asList("nanda", "dinesh", "gnana");

		for (Iterator<String> iterator = names.iterator(); iterator.hasNext();) {
			String name = iterator.next();
			System.out.println(name);

		}

		for (String name : names) {

			System.out.println(name);

		}

	}

}
