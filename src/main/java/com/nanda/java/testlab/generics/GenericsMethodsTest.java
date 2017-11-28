package com.nanda.java.testlab.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsMethodsTest {
	
	
	
	public static void main(String[] args) {
		display("nanda");
		display(10);
		
		ArrayList<? super String> list = new ArrayList<String>();
		list.add("nanda");
		
		addList(list);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String object = (String) iterator.next();
			
			System.out.println(object.toString());
		}
		
		ArrayList<MyNumber> num = new ArrayList<MyNumber>();
		num.add(new MyNumber());
		myNum(num);
	}
	
	public static <T> void display(T obj) {
		
		System.out.println(obj.toString());
	}
	
	public static <T extends Number> void displayNumbers(T numbers){
		
		System.out.println("Number:"+numbers.toString());
		
	}
	
	public static void addList(ArrayList l) {
		
		l.add("nanda");
		l.add(10);
		l.add(10.7);
	}
	
	public static void myNum(ArrayList<? super MyInt> num) {
		
		num.add(new MyInt());
		
		
	}
	
	public void nanada(int i) {
		
	}
	
	public int nanada(int i) {
		
		
		return 0;
	}
	
	
	public void m1(ArrayList<String> al) {
		
	}
	
	public void m1(List<Integer> al) {
		
	}

}
