/**
 * 
 */
package com.nanda.geeks.problems;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class EquillibriumIndex {
    
    
    public static void main(String[] args) {
	
	System.out.println(findEquilibrium(new int[]{-65,-52,10,15,21,91,-69,-8,-40,-41,94,-18,-52,9,-56,42,2,40,47,-27,-17,90,-11,-56,-91,-43,4,-89,12,-12,72,92,97,-88,-37,63,-35
},37));
    }
    
    static int findEquilibrium(int A[], int n)
    {
	
	int index =-1;
	int totalsum =0;
	//find the total sum of the array
	for (int i = 0; i < n; i++) {
	    
	    totalsum = totalsum + A[i];
	}
	int runningSum =0;
	for (int i = 0; i < n; i++) {
	    
	    int number = A[i];
	    
	    if(((totalsum -runningSum) - number) == runningSum ){
		index =i;
	    }
	    runningSum+=number;
	    
	}
	return index;
    }
}
