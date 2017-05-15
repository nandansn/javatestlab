/**
 * 
 */
package com.nanda.java.testlab.design.patterns;

/**
 * @author Nandakumar 
 * 06-May-2017
 *
 */
public class Person {
    
    private String name;
    private int age;
    private String city;
    
    
    
    
    /**
     * @param name
     * @param age
     * @param city
     */
    public Person(String name, int age, String city) {
	this.name = name;
	this.age = age;
	this.city = city;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
    }
    
    
    

}
