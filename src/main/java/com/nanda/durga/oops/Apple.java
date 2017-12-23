package com.nanda.durga.oops;

public class Apple {
	
	public static void main(String[] args) {
		
		new AbstractMobile() {
			
			@Override
			public void name() {
				// TODO Auto-generated method stub
				System.out.println("main");
			}
			
		}.name();
		
		new Apple();
		
	}

}
