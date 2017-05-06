/**
 * 
 */
package com.nanda.java.testlab.ds.problems;

/**
 * @author Nandakumar 24-Apr-2017
 *
 */
public class AmazingString {

    public static Integer[] arrayOfRepalcements(String args[]) {

	Integer[] replace = new Integer[args.length];

	for (int k = 0; k < args.length; k++) {
	    char[] s = args[k].toCharArray();

	    int replaceCount = 0;

	    for (int i = 0; i < s.length; i++) {
		int j = i + 1;
		if (j < s.length) {
		    if (s[i] == s[j]) {
			s[j] = '@';
			replaceCount++;
		    }
		}
	    }

	    System.out.println(replaceCount);

	    replace[k] = replaceCount;

	}

	return replace;
    }

    static int[] getMinimumUniqueSum(String[] arr) {
	
	int[] result = new int[arr.length];
	
	for(int i=0; i<arr.length; i++){
	    
	    	    
	    String numberFormatted[] = arr[i].split(" ");
	    
	    int squreNumberCounts = 0;
	    
	    Integer[] numbers = new Integer[numberFormatted.length];
	    
	    for(int k=0; k<numbers.length; k++){
		numbers[k] = Integer.parseInt(numberFormatted[k]);
	    }
	    
	    int staringNumberInArray = numbers[0];
	    int lastNumberInArray = numbers[numbers.length-1];
	    
	    for(int s=1; s<=lastNumberInArray; s++){
		
		int square = s * s;
		
		for(int m=staringNumberInArray; m<=lastNumberInArray; m++){
		    if(square == m){
			
			squreNumberCounts =squreNumberCounts + 1;
		    }
		}
		
		result[i] = squreNumberCounts;
	    }
	    
	}
	
	return result;
	
	
	

    }

    public static void main(String[] args) {
	
	String[] str = new String[2];
	
	str[0] = "3 9";
	str[1] = "17 24";

	int[] result = getMinimumUniqueSum(str);
	
	for(Integer inte: result){
	    
	    System.out.println(inte);
	}
    }

}
