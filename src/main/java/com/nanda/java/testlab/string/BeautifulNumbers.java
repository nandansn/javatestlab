/**
 * 
 */
package com.nanda.java.testlab.string;

import java.util.Scanner;

/**
 * @author Nandakumar 11-May-2017
 *
 */
public class BeautifulNumbers {

    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	int q = in.nextInt();
	for (int a0 = 0; a0 < q; a0++) {
	    String s = in.next();
	    
	    int index = 0;
	    int initNumber = Integer.parseInt(s.substring(index,1));
	    int printInitNumber = initNumber;
	    
	    while(index < s.length()){
		
		
		if(initNumber == 0){
		    System.out.println("No");
		    break;
		}else{
		    Integer number = initNumber +1;
		    index = s.indexOf(number.toString());
		    if(index==s.length() || index == s.length() - number.toString().length()){
			System.out.println("Yes "+printInitNumber);
			break;
		    }
		    initNumber = number;
		}
	    }
	    
	    
	}
    }

}
