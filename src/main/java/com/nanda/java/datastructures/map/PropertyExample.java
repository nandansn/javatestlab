/**
 * 
 */
package com.nanda.java.datastructures.map;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author Nandakumar 
 * 12-Jun-2017
 *
 */
public class PropertyExample {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
	
	Properties p = new Properties();
	p.setProperty("username", "nanda");
	p.setProperty("password", "nanda123");
	
	
	
	p.storeToXML(new FileOutputStream(new File("resources/nanda.xml")), "username/pwd");
	
	p.loadFromXML(new FileInputStream(new File("resources/nanda.xml")));
	
	Enumeration<String> enumeration = (Enumeration<String>) p.propertyNames();
	
	while(enumeration.hasMoreElements()){
	    
	    String name = enumeration.nextElement();
	    System.out.println(name +"->" + p.getProperty(name));
	}
	
    }

}
