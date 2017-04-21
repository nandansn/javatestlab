/**
 * 
 */
package com.nanda.java.testlab.streams;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Nandakumar 18-Apr-2017
 * 
 *         In case of ‘byte’ and ‘character’ streams every byte or piece of data
 *         that s being read or write requires an direct support from underlying
 *         OS because of not having an intermediate buffer included. This makes
 *         a extensive use of memory and resources. On the other hand Buffered
 *         streams works as a wrapper to hold unbuffered streams and make it
 *         possible to store bunch of data or bytes in buffers (memory). The
 *         underlying OS resource are needed only when the buffer is full or
 *         empty and not on every instance of read or write.
 *
 */
public class BufferedStreamsExample {
    
    public static void main(String[] args) throws IOException {
	
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("c:/java/nanda.txt")));
	
	while(bis.available() > 0){
	    System.out.print((char)bis.read());
	}
    }

}
