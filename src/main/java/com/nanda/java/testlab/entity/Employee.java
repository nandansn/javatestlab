/**
 * 
 */
package com.nanda.java.testlab.entity;

/**
 * @author Nandakumar 13-Apr-2017
 *
 */
public class Employee {

    String name;
    int id;

    /**
     * @param name
     * @param id
     */
    public Employee(String name, int id) {
	this.name = name;
	this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", getName()=" + getName() + ", getId()=" + getId() + "]";
    }

    @Override
    public int hashCode() {

	int hashCode = 0;

	int hashConstant = 31;

	hashCode = hashConstant * 1 + this.name == null ? 0 : this.name.hashCode();

	return hashCode;

    }

    @Override
    public boolean equals(Object obj) {

	if (obj == null || this.id == 0) {
	    return false;
	}

	if (obj instanceof Employee) {

	    Employee otherEmpObject = (Employee) obj;
	    
	    if(otherEmpObject == this){
		return false;
	    }
	    
	    if(otherEmpObject.id == 0){
		return false;
	    }

	    if (this.id == otherEmpObject.id) {
		return true;
	    } else {
		return false;
	    }

	} else {

	    return false;
	}

    }

}
