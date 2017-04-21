/**
 * 
 */
package com.nanda.java.testlab.streams;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * @author Nandakumar 18-Apr-2017
 * 
 *         Java performs I/O through Streams. A Stream is linked to a physical
 *         layer by java I/O system to make input and output operation in java.
 *         In general, a stream means continuous flow of data. Streams are clean
 *         way to deal with input/output without having every part of your code
 *         understand the physical.
 * 
 *         Java encapsulates Stream under java.io package. Java defines two
 *         types of streams. They are,
 * 
 *         Byte Stream : It provides a convenient means for handling input and
 *         output of byte.
 * 
 *         Character Stream : It provides a convenient means for handling input
 *         and output of characters. Character stream uses Unicode and therefore
 *         can be internationalized.
 * 
 *         A stream is a sequence of data.In Java a stream is composed of bytes.
 *         It's called a stream because it is like a stream of water that
 *         continues to flow.
 * 
 *         In java, 3 streams are created for us automatically. All these
 *         streams are attached with console.
 * 
 *         1) System.out: standard output stream
 * 
 *         2) System.in: standard input stream
 * 
 *         3) System.err: standard error stream
 *
 */
public class StreamsExample {
    
    public static void main(String[] args) {
	
	try {
	    System.out.println((char)System.in.read());
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
