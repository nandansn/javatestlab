/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Scanner;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class SubSeqCharacters {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int testCases = scan.nextInt();
	
	while(testCases > 0){
	    
	    String charSeq = scan.next();
	    int acount=0;
	    int bcount=0;
	    int ccount=0;
	    for(int i=0; i<charSeq.length(); i++){
		
		if(charSeq.charAt(i)=='a'){
		    acount = 1 + 2 * acount;
		}
		if(charSeq.charAt(i)=='b'){
		    bcount = acount + 2 * bcount;
		}
		if(charSeq.charAt(i)=='c'){
		    ccount = bcount + 2 * ccount;
		}
	    }
	    
	    System.out.println(ccount);
	    testCases--;
	}
    }

}
