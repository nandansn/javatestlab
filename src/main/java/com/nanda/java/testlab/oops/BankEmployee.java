/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         use implements after extends
 * 
 *         The object cloning is a way to create exact copy of an object. For
 *         this purpose, clone() method of Object class is used to clone an
 *         object.
 * 
 *         The java.lang.Cloneable interface must be implemented by the class
 *         whose object clone we want to create. If we don't implement Cloneable
 *         interface, clone() method generates CloneNotSupportedException.
 * 
 *         The clone() method is defined in the Object class.
 *
 */
public class BankEmployee extends Person implements Cloneable {

    float salary;
    String bankName;

    BankEmployee() {

    }

    BankEmployee(String name, float salary) {

	super(name);
	this.salary = salary;
    }

    public void display() {

	System.out.println(this.bankName);
	super.displayName();
	System.out.println("Salary:" + salary);
    }

    {
	System.out.println("Initializing bank name");
	bankName = "SBI";
    }

    public Object clone() throws CloneNotSupportedException {
	return super.clone();

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "BankEmployee [salary=" + salary + ", bankName=" + bankName + ", name=" + name + "]";
    }

}
