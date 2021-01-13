package com.nanda.innerclass.nestedstatiic;

public interface OuterInterface {
	
	public void outer();
	
	interface InnerInterface {
		
		public void inner();
	}

}


class OuterClass implements OuterInterface, OuterInterface.InnerInterface {

	public void outer() {
		System.out.println("outer implementation");
		
	}

	public void inner() {
		System.out.println("inner implementation");
		
	}
	
}

class Test {
	
	public static void main(String[] args) {
		
		new OuterClass().inner();
		new OuterClass().outer();
	}
}