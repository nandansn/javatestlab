/**
 * 
 */
package com.nanda.java.testlab;

/**
 * @author Nandakumar 
 * 21-May-2017
 *
 */
public class StaticVariables {
    
    int a;
    static int b;
    
    {
	//static int c; not allowed
    }
    
    static{
	 // static int d; not allowed
    }
    
    public void nanda(){
	// static int f; not allowed
	
    }
    
    public static void kumar(){
	
	// static int g; not allowed
    }
    
    static {
	b=1;
	System.out.println(b);
    }
    
    public static void main(String[] args) {
	
	b= 10;
	
	System.out.println(b);
	System.out.println(StaticVariables.b);
    }
    
    static {
	b=2;
	System.out.println(b);
    }
    
    
    

}
