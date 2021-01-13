package com.nanda.innerclass.anonymous;

public class PopCorn {
	
	public void taste() {
		System.out.println("default popcorn taste");
	}

}

class Test {
	
	public static void main(String[] args) {
		
		// new PopCorn() is child class object 
		
		PopCorn p = new PopCorn( ) {
			public void taste() {
				
				System.out.println("popcorn taste salty");
			}
		};
		
		p.taste();
	}
}
