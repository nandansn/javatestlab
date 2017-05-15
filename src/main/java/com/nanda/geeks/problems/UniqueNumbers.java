/**
 * 
 */
package com.nanda.geeks.problems;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Nandakumar 
 * 13-May-2017
 *
 */
public class UniqueNumbers {
    
    public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	    int t= s.nextInt();
	    while(t-->0){
	        int n= s.nextInt();
	        int m= s.nextInt();
	        for(int i=n;i<=m;i++){
	            int x = i;
	            int cnt[]= new int[10];
	            boolean fl=true;
	            while(x!=0){
	                int r = x%10;
	                x = x/10;
	                if(cnt[r]!=0){
	                    fl=false;
	                    break;
	                }
	                cnt[r]=1;
	            }
	            if(fl){
	                System.out.print(i+" ");
	            }
	        }
	        System.out.println();
	    }
    }

}
