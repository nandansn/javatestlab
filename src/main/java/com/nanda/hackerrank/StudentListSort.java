/**
 * 
 */
package com.nanda.hackerrank;

import java.util.*;

/**
 * @author Nandakumar 19-May-2017
 *
 */
public class StudentListSort {
    
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int testCases = Integer.parseInt(in.nextLine());

	List<Student> studentList = new ArrayList<Student>();
	while (testCases > 0) {
	    int id = in.nextInt();
	    String fname = in.next();
	    double cgpa = in.nextDouble();

	    Student st = new Student(id, fname, cgpa);
	    studentList.add(st);

	    testCases--;
	}
	
	Collections.sort(studentList, new ListChecker());

	for (Student st : studentList) {
	    System.out.println(st.getFname());
	}
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
	super();
	this.id = id;
	this.fname = fname;
	this.cgpa = cgpa;
    }

    public int getId() {
	return id;
    }

    public String getFname() {
	return fname;
    }

    public double getCgpa() {
	return cgpa;
    }
}

class ListChecker implements Comparator<Student>{

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(Student o1, Student o2) {
	
	if(o1.getCgpa() == o2.getCgpa()){
	    
	    if(o1.getFname().equalsIgnoreCase(o2.getFname())){
		
		if(o1.getId() > o2.getId()){
		    return -1;
		}else{
		    return 1;
		}
		
	    }else{
		return o1.getFname().compareToIgnoreCase(o2.getFname());
	    }
	}
	
	if(o1.getCgpa() > o2.getCgpa()){
	    
	    return -1;
	} else {
	    
	    return 1;
	}
    }

    
}