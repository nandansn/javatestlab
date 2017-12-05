package com.java.thirty.days;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numberOfStrings = scan.nextInt();

		String[] strs = new String[numberOfStrings];

		for (int i = 0; i < numberOfStrings; i++) {

			strs[i] = scan.next();

		}
		for (int i = 0; i < strs.length; i++) {

			char[] chars = strs[i].toCharArray();

			StringBuilder evenString = new StringBuilder();

			for (int j = 0; j < chars.length; j = j + 2) {

				evenString.append(chars[j]);
			}

			evenString.append(" ");

			for (int j = 1; j < chars.length; j = j + 2) {

				evenString.append(chars[j]);
			}

			System.out.println(evenString);
		}

	}

}
