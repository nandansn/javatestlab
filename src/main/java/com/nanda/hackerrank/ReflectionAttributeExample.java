/**
 * 
 */
package com.nanda.hackerrank;

import java.lang.reflect.Method;

/**
 * @author Nandakumar 
 * 05-Jun-2017
 *
 */
public class ReflectionAttributeExample {
    
    public static void main(String[] args) throws ClassNotFoundException {
	
	Class student = Class.forName("com.nanda.hackerrank.StudentOne");
	Method[] methods = student.getDeclaredMethods();
	
	for (Method method : methods) {
	    
	    System.out.println(method.getName());
	    
	}
	
    }

}

class StudentOne {
    
    int id;
    String name;
    int city;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the city
     */
    public int getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(int city) {
        this.city = city;
    }
    
    
}
