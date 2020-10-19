package com.learning.oops;

public class OverloadingOneTest {
	
	public void m1(int i, float f) {
		
	}
	
	public void m1(float f, int i) {
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingOneTest t = new OverloadingOneTest();
		t.m1(10, 12.5f);
		t.m1(12.5f, 10);
		t.m1(10,10);
	}

}
