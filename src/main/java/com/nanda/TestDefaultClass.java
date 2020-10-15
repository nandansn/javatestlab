package com.nanda;

import com.learning.oops.PublicClass;

public class TestDefaultClass {
	
	static PublicClass publicClass;
	
	
	static {
		publicClass = new PublicClass();
		publicClass.testOne();
		PublicClass.testTwo();
	}
	
	public static void main(String[] args) {
		
	}

}
