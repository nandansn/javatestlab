/**
 * 
 */
package com.nanda.java.testlab.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * @author Nandakumar 
 * 18-Apr-2017
 * 
 * Define user defined annotations
 * 
 * Utilize user defined annotations in Java Applications
 * 
 * Access data from user defined annotations
 */
public class CustomAnnotationsExample {
    
    public static void main(String[] args) {
	
	Student student = new Student("Maths", 200);
	student.display();
	
	Class c = student.getClass();
	
	
	
	Annotation annotations = c.getAnnotation(Course.class);
	Course course = (Course)annotations;
	
	
	System.out.println(course.courseName);
	System.out.println(course.fees);
	    
	
    }

}
   



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Course{
    
    String courseName ="English";
    int fees =100;
}

class Student{
    
    String courseName;
    int fees;
    /**
     * @param courseName
     * @param fees
     */
    public Student(String courseName, int fees) {
	this.courseName = courseName;
	this.fees = fees;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Student [courseName=" + courseName + ", fees=" + fees + "]";
    }
    
    public void display(){
	
	System.out.println(this.toString());
    }
    
    
}
