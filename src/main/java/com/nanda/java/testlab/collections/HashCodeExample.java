/**
 * 
 */
package com.nanda.java.testlab.collections;

import com.nanda.java.testlab.entity.Book;
import com.nanda.java.testlab.entity.Employee;

/**
 * @author Nandakumar 
 * 13-Apr-2017
 *
 */
public class HashCodeExample {
    
    public static void main(String[] args) {
	
	String name ="Nanda";
	String lastName ="Nanda";
	
	String nameObj = new String("Nanda");
	
	System.out.println("Name:" +name.hashCode());
	
	System.out.println("Last Name:" +lastName.hashCode());
	
	System.out.println("Name Object:" +nameObj.hashCode());
	
	System.out.println(name == nameObj);
	
	System.out.println(name.equals(nameObj));
	
	
	/////////////////////////////////// Hash Code Example Custom Class ///////////////////////////////////////////
	
	Employee emp = new Employee("Nanda",0);
	
	Employee emp2 = new Employee("Nanda",0);
	
	Employee emp3 = new Employee("Nanda",0);
	
	System.out.println("Employee Object Hash Code:"+emp.hashCode());
	
	System.out.println("Employee Name Hash Code:"+emp.getName().hashCode());
	
	System.out.println("Employee Name Hash Code:"+emp2.getName().hashCode());
	
	System.out.println("Check objects are equal ? "+emp.equals(new Book("")));
	
    }

}
