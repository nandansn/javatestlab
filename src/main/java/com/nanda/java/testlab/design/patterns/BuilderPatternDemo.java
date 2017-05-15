/**
 * 
 */
package com.nanda.java.testlab.design.patterns;

/**
 * @author Nandakumar 
 * 06-May-2017
 *
 */
public class BuilderPatternDemo {
    
    public static void main(String[] args) {
	
	PersonBuilder pb = new PersonBuilder();
	
	Person p = pb.setName("Nanda").setAge(37).setCity("Erode").createPerson();
	
	System.out.println(p);
    }

}
