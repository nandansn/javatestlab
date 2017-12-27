package com.nanda.testlabs.oops.overriding;

class PV {
	int x =10;
}

class CV extends PV{
	
	int x =11;
}

public class VarialeTest {

	public static void main(String[] args) {
		
		PV p = new PV();
		System.out.println(p.x);
		
		CV c = new CV();
		System.out.println(c.x);
		
		PV pc = new CV();
		System.out.println(pc.x);
	}
}
