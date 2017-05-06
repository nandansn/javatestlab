/**
 * 
 */
package com.nanda.java.testlab.problems;

import java.util.Vector;

/**
 * @author Nandakumar 
 * 26-Apr-2017
 *
 */
public class VectorExample extends MyVector {
    
    MyVector m;
    
    
    public long display(int j){
	
	m.display();
	
	return 0;
    }
    
public static void main(String args[]){
    
    String s ="nanda";
    StringBuffer sb = new StringBuffer("nanda");
    
    if(s.equals(sb)){
	System.out.println("true");
    }
	
	System.out.println(VectorExample.class.getName());
    }

}

class MyVector{
    
    static MyVector m = new MyVector();
    static int i;
    
    static{
	
	m.display();
    }
    
    public int display(){
	int j=i;
	return 0;
	
    }
    
    
	
    
    public static void main(String args[]){
	String s ="nanda";
	    StringBuffer sb = new StringBuffer("nanda");
	    
	    if(s.equals(sb.substring(0))){
		System.out.println("true");
	    }
	System.out.println(MyVector.class.getName());
    }
}
