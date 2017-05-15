/**
 * 
 */
package com.nanda.java.fundamentals;

/**
 * @author Nandakumar 
 * 13-May-2017
 *
 */
public class ArrayCreationExample {
    
    public static void main(String[] args) {
	
	int a[] = new int[3];
	
	System.out.println(a.getClass().getName());
	
	boolean b[] = new boolean[2];
	System.out.println(b.getClass().getName());
	
	float f[] = new float[3];
	
	System.out.println(f.getClass().getName());
	
	String s[] = new String[2];
	
	System.out.println(s.getClass().getName());
	
	String str ="nanda";
	
	System.out.println(str.getClass().getName());
	
	int ab[] = new int['a']; //corresponding int value for a is assigned.
	
	int ac[] = new int['\u0061']; 
	
	int av[] = new int['\r'];
	
	System.out.println(ab.length);
	
	System.out.println(ac.length);
	System.out.println(av.length);
	
    }

}
