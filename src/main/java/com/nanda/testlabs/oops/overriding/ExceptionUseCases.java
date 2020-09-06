package com.nanda.testlabs.oops.overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class P1{
	
	public void m1() throws Exception {
		
		System.out.println("P1");

	}
}

class C1 extends P1{
	
	public void m1() {
		System.out.println("C1");
		
	}
}



class P2{
	
	public void m1()  {
		
		System.out.println("P1");

	}
}

class C2 extends P2{
	
	/*public void m1() throws Exception {
		System.out.println("C1");
		
	}*/
}


class P3{
	
	public void m1()  throws Exception {
		
		System.out.println("P1");

	}
}

class C3 extends P3{
	
	public void m1() throws IOException {
		System.out.println("C1");
		
	}
}


class P4{
	
	public void m1()  throws IOException {
		
		System.out.println("P1");

	}
}

class C4 extends P4{
	
	/*public void m1() throws Exception {
		System.out.println("C1");
		
	}*/
}


class P5{
	
	public void m1()  throws IOException {
		
		System.out.println("P1");

	}
}

class C5 extends P5{
	
	public void m1() throws FileNotFoundException,EOFException {
		System.out.println("C1");
		
	}
}

class P6{
	
	public void m1()  throws IOException {
		
		System.out.println("P1");

	}
}

class C6 extends P6{
	
	/*public void m1() throws InterruptedException{
		System.out.println("C1");
		
	}*/
}

class P7{
	
	public void m1()  throws IOException {
		
		System.out.println("P1");

	}
}

class C7 extends P7{
	
	public void m1() throws ArithmeticException{
		System.out.println("C1");
		
	}
}


public class ExceptionUseCases {

		public static void main(String[] args) throws Exception {
			
			P1 p1 = new P1();
			p1.m1();
			
			C1 c1 = new C1();
			c1.m1();
			
			P1 p2 = new C1();
			p2.m1();
		}
}
