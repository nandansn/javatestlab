/**
 * 
 */
package com.nanda.java.testlab.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Nandakumar 
 * 18-Apr-2017
 *
 */
public class FileInputStreamExample {
    
    public static void main(String[] args) throws IOException {
	
	
	OutputStream os = new FileOutputStream("C:/java/nanda.txt");
	
	String name="nanda\nkumar";
	for(char c:name.toCharArray()){
	    os.write((int)c);
	}
	
	
	File f = new File("C:/java/nanda.txt");
	InputStream is = new FileInputStream(f);
	
	while(is.available() > 0){
	   
	    System.out.print((char)is.read());
	    
	}
	
	
    }

}
