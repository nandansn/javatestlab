/**
 * 
 */
package com.nanda.java.numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Nandakumar 
 * 11-May-2017
 *
 */
public class CakeCandlesUsingList {
    
    public static void main(String[] args) throws FileNotFoundException {
	
	Scanner in = new Scanner(new File("c:\\nan.txt"));
        List<Integer> candles = new LinkedList<Integer>();
        for(int height_i=0; height_i < 100000; height_i++){
            candles.add(Integer.parseInt(in.next()));
        }
        
       Collections.sort(candles);
       
      System.out.println( Collections.frequency(candles, candles.get(100000 -1 )));
       
    }

}
