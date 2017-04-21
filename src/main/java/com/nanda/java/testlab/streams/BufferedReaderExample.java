/**
 * 
 */
package com.nanda.java.testlab.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Nandakumar 
 * 18-Apr-2017
 *
 */
public class BufferedReaderExample {
    
    public static void main(String[] args) throws IOException {
	
	// Reading data from the console and writing to file.
	
	File f = new File("c:/java/buffered.txt");
	FileWriter fw = new FileWriter(f);
	
	BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	
	String text = br.readLine();
	
	while(!text.contains("Done")){
	    
	    
	    
	    fw.write(text);
	    text = br.readLine();
	    
	}
	
	br.close();
	fw.flush();
	fw.close();
	
	
	// Reading data from the file
	
	FileReader fr = new FileReader(f);
	
	BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
	
	String fileText = bfr.readLine();
	
	while(fileText != null){
	    
	    System.out.println(fileText);
	    fileText = bfr.readLine();
	    
	}
	
	
    }

}
