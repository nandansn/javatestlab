package com.nanda.innerclass.normal;

public class Outer {
	String name = "outer";
	
	
	class Inner {
		
		String name = "inner";
		
		
		public void innerM1() {
			String name = "inner local";
			
			System.out.println(name); //refers local variable.
			System.out.println(this.name); //refers inner class name variable
			System.out.println(Inner.this.name);
			
			System.out.println(Outer.this.name); // refers outer class name variable
		}
		
		class InnerMost {
			
			public void innerMost() {
				System.out.println("inner most");
			}
		}
			
	}
	
	
	public Inner getMeInner() {
		
		Inner inner = new Inner();
		
		return inner;
	}
	
	
}

class Test {
	
	public static void main(String[] args) {
		
		new Outer().getMeInner().new InnerMost().innerMost();
	}
	
}
