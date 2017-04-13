package com.nanda.java.testlab.oops;

public class Student {
	
	String name;
	int id;
	
	public void initialzeFields(String nameParam, int idParam){
		
		name = nameParam;
		id = idParam;
	}
	
	public void displayStudentDetails(){
		
		System.out.println("Student Name:"+name);
		System.out.println("Student Roll No:"+id);
	}
	

}
