/**
 * 
 */
package com.nanda.java.testlab.generics;

import java.util.List;

/**
 * @author Nandakumar 
 * 18-Apr-2017
 *
 */
public class GenericExtendsExample<T> {
    
    T t;
    
    
    
    /**
     * @return the t
     */
    public T getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(T t) {
        this.t = t;
    }

    public void display(GenericExtendsExample<? extends Fruit> fruit){
	
	System.out.println(fruit.getT().toString());
    }
    
    public static void main(String[] args) {
	
	GenericExtendsExample<Fruit> fruit = new GenericExtendsExample<Fruit>();
	// fruit.display(new Fruit("Fruit")); // not allowed
	
	GenericExtendsExample<Apple> apple = new GenericExtendsExample<Apple>();
	
	apple.setT(new Apple("Apple"));
	apple.display(apple);
	
	
	
	
    }

}

 class Fruit{
     
     String name;

    /**
     * @param name
     */
    public Fruit(String name) {
	this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Fruit [name=" + name + "]";
    }
    
    
     
     
    
}
 
 class Apple extends Fruit{

    /**
     * @param name
     */
    public Apple(String name) {
	super(name);
	// TODO Auto-generated constructor stub
    }
     
 }
 
 class Orange extends Fruit{

    /**
     * @param name
     */
    public Orange(String name) {
	super(name);
	// TODO Auto-generated constructor stub
    }
     
 }
