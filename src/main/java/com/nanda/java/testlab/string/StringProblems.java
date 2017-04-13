/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 
 * 12-Apr-2017
 *
 */
public class StringProblems {
    
    public static void main(String ...args){
	
	String a="meow";
	String ab = a+"deal";
	String abc = "meowdeal";
	
	System.out.println(ab.equals(abc));
	System.out.println(ab==abc);
	
	String arr[] = {"meow"};
	
	System.out.println(a==arr[0]);
	
	
	String s = "Wild ";
	String i ="Irish ";
	String r ="Rose ";
	
	System.out.println(s.trim()+i+r.trim());
	
	StringBuilder sb1 = new StringBuilder("nanda");
	StringBuilder sb2 = new StringBuilder("nanda");
	
	System.out.println(sb1.equals(sb2));
	System.out.println(sb1.toString().equals(sb2.toString()));
	System.out.println(sb1==sb2);
	
	StringBuffer sbuff1 = new StringBuffer("Nanda");
	StringBuffer sbuff2 = new StringBuffer("Nanda");
	
	System.out.println(sbuff1.equals(sbuff1));
	System.out.println(sbuff1.toString().equals(sbuff2.toString()));
	System.out.println(sbuff1==sbuff2);
	
    }

}
