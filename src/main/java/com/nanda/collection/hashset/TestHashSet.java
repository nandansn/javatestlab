package com.nanda.collection.hashset;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("resources/names.txt"));

		Set<String> hashSet = new HashSet<String>();

		while (scan.hasNextLine()) {

			hashSet.add(scan.next());
		}

		for (String string : hashSet) {

			System.out.println(string);
		}

		scan = new Scanner(new File("resources/namesubset.txt"));

		List<String> names = new ArrayList();

		while (scan.hasNextLine()) {

			String name = scan.next();

			names.add(name);

			if (hashSet.contains(name))
				System.out.println("true");
			else {
				System.out.println("false");
			}

		}
		
		System.out.println(hashSet.containsAll(names));

	}

}
