/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Queue;
import java.util.Scanner;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class MovesOfRobot {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int testCases = scan.nextInt();
	
	while(testCases > 0){
	    
	    String movesOfRobot = scan.next();
	    
	    if(movesOfRobot.charAt(0) == movesOfRobot.charAt(movesOfRobot.length() -1)){
		
		System.out.println("Circular");
	    }else{
		
		System.out.println("Not Circular");
	    }
	    
	    testCases--;
	}
    }

}
