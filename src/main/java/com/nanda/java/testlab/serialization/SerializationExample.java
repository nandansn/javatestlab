/**
 * 
 */
package com.nanda.java.testlab.serialization;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author Nandakumar 18-Apr-2017
 * 
 *         Serialization is a process of converting an object into a sequence of
 *         bytes which can be persisted to a disk or database or can be sent
 *         through streams. The reverse process of creating object from sequence
 *         of bytes is called deserialization.
 * 
 *         A class must implement Serializable interface present in java.io
 *         package in order to serialize its object successfully. Serializable
 *         is a marker interface that adds serializable behaviour to the class
 *         implementing it.
 * 
 *         Java provides Serializable API encapsulated under java.io package for
 *         serializing and deserializing objects which include,
 * 
 *         java.io.serializable java.io.Externalizable ObjectInputStream and
 *         ObjectOutputStream etc.
 *
 */
public class SerializationExample {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

	Employee emp = new Employee("Nanda", 1);
	Employee empOne = new Employee("Dinesh", 2);
	Employee empTwo = new Employee("Gnana", 3);
	Employee empThree = new Employee("Thiaghu", 4);

	File f = new File("c:/java/Employee.txt");
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));

	oos.writeObject(emp);
	oos.writeObject(empOne);
	oos.writeObject(empTwo);
	oos.writeObject(empThree);
	
	oos.flush();
	oos.close();

	// De-Serialization
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
	
	try{
        	while(true){
        	    Employee empFromFile = (Employee) ois.readObject();
        
        	    System.out.println(empFromFile.toString());
        	    System.out.println(empFromFile.companyName);
        	}
	}catch(EOFException eof){
	    System.out.println("End Of File.");
	    
	}finally {
	    ois.close();
	    
	}

    }

}
