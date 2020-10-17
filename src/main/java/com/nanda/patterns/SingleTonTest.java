package com.nanda.patterns;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DbDriver dbDriver1 = DbDriver.getInstance();
		DbDriver dbDriver2 = DbDriver.getInstance();
		DbDriver dbDriver3 = DbDriver.getInstance();
		
		System.out.println(dbDriver1.hashCode());
		System.out.println(dbDriver2.hashCode());
		System.out.println(dbDriver3.hashCode());

	}

}
