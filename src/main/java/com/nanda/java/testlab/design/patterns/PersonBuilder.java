/**
 * 
 */
package com.nanda.java.testlab.design.patterns;

/**
 * @author Nandakumar 06-May-2017
 *
 */
public class PersonBuilder {

    private String name;
    private int age;
    private String city;

    public PersonBuilder(){
	
	
    }
    
    	
    
    /**
     * @param name the name to set
     */
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }



    /**
     * @param age the age to set
     */
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }



    /**
     * @param city the city to set
     */
    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }



    public Person createPerson(){
	
	return new Person(name,  age,  city);
    }
    

}
