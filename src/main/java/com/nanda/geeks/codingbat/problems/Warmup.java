/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

/**
 * @author Nandakumar 
 * 16-May-2017
 *
 */
public class Warmup {
    
    public String startOz(String str) {
	  
	  if(str.length() ==1 ){
	    if(str.charAt(0) =='o')
	    return str.charAt(0) +"";
	  }
	  
	  if(str.length() >= 2){
	    
	    if(str.charAt(0) == 'o' && str.charAt(1) =='z'){
	      return str.charAt(0) + str.charAt(1) +"";
	    }
	    
	     if(str.charAt(1) =='z'){
	      return str.charAt(1) +"";
	    }
	     if(str.charAt(0) =='o'){
	      return str.charAt(0) +"";
	    }
	  }
	  
	  return str;
	}


}
