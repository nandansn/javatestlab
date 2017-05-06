/**
 * 
 */
package com.nanda.java.testlab.problems;

/**
 * @author Nandakumar 
 * 23-Apr-2017
 *
 */
public class  AbstractExamples extends AbstractTest {
    
    public static void main(String[] args) {
	
	AbstractExamples.display2();
	
	new AbstractExamples().display();
	new AbstractExamples().testme();
	
    }

    /* (non-Javadoc)
     * @see com.nanda.java.testlab.problems.AbstractTest#testme()
     */
    @Override
    void testme() {
	// TODO Auto-generated method stub
	
	System.out.println("hello");
	
    }
    

}

abstract class AbstractTest{
    
    abstract void testme();
    
    void display(){
	
	System.out.println("Abstract Class");
    }
    
    static void display2(){
	System.out.println("Am static method");
    }
}
