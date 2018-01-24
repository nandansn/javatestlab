package com.nanda.java.exceptions;

import java.io.FileNotFoundException;

public class MyExceptiontest {
	
	public static void main(String[] args) {
		
		try {
			try {
				throw new FileNotFoundException("File Not Found");
			}catch(FileNotFoundException fnfe) {
				System.out.println("FNPE Caught");
				throw new NullPointerException("Null Pointer Exception");
			}finally {
				System.out.println("Finally");
			}
			
		}catch(NullPointerException npe) {
			System.out.println("NPE Caught");
		}
	}

}


}