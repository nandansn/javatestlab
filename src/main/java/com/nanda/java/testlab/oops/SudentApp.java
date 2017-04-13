package com.nanda.java.testlab.oops;

public class SudentApp {
	
	
	// Main method should be static. otherwise will get runtime error.
	// We cant override main method.
	// we can overload main method
	// we can use varargs in the main method.
	
	
	
	
	public static void main(String ...args){
		
		System.out.println("This is student app");
		
		Student student1 = new Student();
		// below two values will be allocated in heap memory
		student1.name="Nivrithi"; 
		student1.id =13;
		
		System.out.println("Student Name: "+student1.name + " Student Id:"+student1.id);
		
		Student student2 = new Student();
		student2.initialzeFields("Nanda", 14);
		
		System.out.println("Student Name: "+student2.name + " Student Id:"+student2.id);
		
		// student1 and student2 will be allocated in stack memory.
		
		
		Student student3 = new Student();
		student3.initialzeFields("Sanmathi", 23);
		student3.displayStudentDetails();
		
		// this will result StackOverflowError. due to recursion. 
		//main("nanda");
		
		// Anonymous simply means nameless. An object which has no reference is known as anonymous object. It can be used at the time of object creation only.
		
		new Student().displayStudentDetails();
		
		// We can create multiple objects by one type only as we do in case of primitives.
		
		Student s1 = new Student(), s2 = new Student();
		
		
	}
	
	/*public static void main(String args){
		
		System.out.println("This is student app main2");
		
	}*/

}
