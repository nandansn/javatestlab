package com.nanda.testlabs.oops.overloading;

public class CaseOne {

	public void m1(int num1) {
		System.out.println("int:" + num1);

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CaseOne one = new CaseOne();
		one.m1(10);
		one.m1('A');
	}

}

class CaseTwo{
	
	public void m1(Integer num) {
		
		System.out.println("Integer:"+num);
		
	}
	
	public static void main(String[] args) {
		
		CaseTwo two = new CaseTwo();
		two.m1(10);
		//two.m1('B');
		two.m1(new Integer('B'));
		
	}
}

class CaseThree{
	
	public void m1(String s) {
		
		System.out.println(String.class.getName());
	}
	
	public void m1(StringBuffer sb) {
		
		System.out.println(StringBuffer.class.getName());
	}
	
	public void m1(Object obj) {
		
		System.out.println(Object.class.getName());
	}
	
	public static void main(String[] args) {
		
		
		CaseThree three = new CaseThree();
		three.m1("Nanda");
		three.m1(new StringBuffer());
		three.m1(three.m4());
		//three.m1(null);
		
		
	}
	
	public Object m4() {
		
		return null;
	}
	
}

class CaseFour{
	
	public void m1(int num1, float num2) {
		
	}
	
	public void m1(float num1, int num2) {
		
	}
	
	public static void main(String[] args) {
		
		new CaseFour().m1(10, 10.5f);
		//new CaseFour().m1(10.0f, 10.0f);
	}
}

class CaseFive{
	
	public void m1(int x) {
		
		System.out.println("int x");
		
	}
	
	public void m1(int ...x) {
		
		System.out.println("int ...x");
	}
	
	public static void main(String[] args) {
		
		
		new CaseFive().m1();
		new CaseFive().m1(10,20);
		new CaseFive().m1(10);
	}
}


class Mobile{
	
}

class IPhone extends Mobile{
	
}

class TestPhone{
	
	public void m1(Mobile m) {
		
		System.out.println("Mobile");
	}
	
	public void m1(IPhone i) {
		
		System.out.println("IPhone");
	}
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		new TestPhone().m1(mobile);
		
		IPhone iphone = new IPhone();
		new TestPhone().m1(iphone);
		
		Mobile mobPhone = new IPhone();
		new TestPhone().m1(mobPhone);
	}
	
}