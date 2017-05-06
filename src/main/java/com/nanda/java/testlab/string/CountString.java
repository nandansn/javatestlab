/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nanda.java.testlab.string;

import java.util.StringTokenizer;

/**
 *
 * @author nanmathi
 */
public class CountString {
    
    public static void main(String[] args){
        
        String str = "nanda friday sunday";
        
        StringTokenizer tokens = new StringTokenizer(str," ");
        int countYZ=0;
        while(tokens.hasMoreTokens()){
            
           String token =  tokens.nextToken();
           if(token.charAt(token.length() - 1) == 'Y' || token.charAt(token.length() - 1) == 'Z'){
               countYZ = countYZ +1;
           }
            
        }
        System.out.print(countYZ);
        
    }
    
}
