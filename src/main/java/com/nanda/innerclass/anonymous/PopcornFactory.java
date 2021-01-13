package com.nanda.innerclass.anonymous;

public class PopcornFactory {
	
	PopcornInterface popcornInterface;
	
	public PopcornFactory(PopcornInterface popcornInterface) {
		this.popcornInterface = popcornInterface;
	}
	
	
	
	
	public void getPopCorn() {
		
		popcornInterface.taste();
		
	}
	
	public static void main(String[] args) {
		
		int x = 10;
		
		new PopcornFactory(new PopcornInterface() {
			
			public void taste() {
				System.out.println("taste is salty");
				
			}
		}).getPopCorn();
	}
	
	

}
