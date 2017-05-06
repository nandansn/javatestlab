/**
 * 
 */
package com.abc;

/**
 * @author Nandakumar 
 * 03-May-2017
 *
 */
public class CloneableExample {
    
    public static void main(String[] args) throws CloneNotSupportedException {
	
	A a= new A(10);
	
	A b = a.cloneMe();
	b.a = 20;
	b.b.c = 45;
	
	System.out.println(b.a);
	System.out.println(a.a);
	
	
	System.out.println(a.b.c);
	System.out.println(b.b.c);
    }
    
}

class A implements Cloneable{
    
    int a;
    B b;
    
    A(int a){
	
	this.a = a;
	this.b = new B(25);
    }
    
    public A cloneMe() throws CloneNotSupportedException{
	
	return (A) super.clone();
    }
    
    
}

class B{
    
    int c;
    
    B(int c){
	this.c = c;
    }
}
