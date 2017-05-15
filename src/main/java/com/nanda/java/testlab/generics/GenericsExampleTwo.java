/**
 * 
 */
package com.nanda.java.testlab.generics;

/**
 * @author Nandakumar 
 * 07-May-2017
 *
 */
public class GenericsExampleTwo {
    
    public static void main(String[] args) {
	
	Accounts<String>  str = new Accounts<String>("Nanda");
	str.show();
	
	Accounts<Checking> account = new Accounts<Checking>(new Checking(1000));
	account.show();
    }
}

class Checking{
    
    int amount;
    
    /**
     * 
     */
    public Checking(int amount) {
	// TODO Auto-generated constructor stub
	this.amount = amount;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Checking [amount=" + amount + "]";
    }
    
    
}

class Accounts<T>{
    
    T t;
    
    Accounts(T t){
	this.t = t;
    }
    
    public void show(){
	
	System.out.println(this.t);
    }
}
