/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 09-May-2017
 *
 */
public class ReferenceTest {

    public static void main(String[] args) {
	
	Person p = new Person();
	p.setId(10);
	change(p);
	System.out.println(p);
	
    }	
    
    public static void change(Person p){
	
	p.setId(20);
	
    }
    
}

class Person{
    
    int id;

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Person [id=" + id + "]";
    }
    
    
    
    
}
