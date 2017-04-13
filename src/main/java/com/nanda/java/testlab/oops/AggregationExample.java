/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         Aggregation in Java
 * 
 *         If a class have an entity reference, it is known as Aggregation.
 *         Aggregation represents HAS-A relationship.
 * 
 *         Consider a situation, Employee object contains many informations such
 *         as id, name, emailId etc. It contains one more object named address,
 *         which contains its own informations such as city, state, country,
 *         zipcode etc. as given below.
 * 
 *         Why use Aggregation?
 * 
 *         For Code Reusability.
 * 
 * 
 *         When use Aggregation?
 * 
 *         Code reuse is also best achieved by aggregation when there is no is-a
 *         relationship. Inheritance should be used only if the relationship
 *         is-a is maintained throughout the lifetime of the objects involved;
 *         otherwise, aggregation is the best choice.
 *
 */
public class AggregationExample {
    
    public static void main(String args[]){
	
	Address address = new Address("Thangamani Street","Loganathapuram","Tamilnadu","India");
	Employee employee = new Employee("Nanda",121212,2500000,address);
	employee.display();
	employee.address.displayAddress();
	
    }

}
