/**
 * 
 */
package com.nanda.geeks.codingbat.problems;

/**
 * @author Nandakumar 09-Jun-2017
 *
 */
public class RecurssiveThree {

    public static void main(String[] args) {

	System.out.println(new RecurssiveThree().count11("11ggg11"));

    }
    
    public int count11(String str) {
	
	int count =0;
	
	if(str.length() < 2){
	    return count;
	}
	
	if(str.substring(0,2).equals("11")){
	    ++count;
	    count = count + count11(str.substring(2));
	}else{
	    count = count + count11(str.substring(1));
	}
	    
	
	
	return count;
	  
    }


    public String endX(String str) {
	
	String xString="";
	String nonXstring="";
	
	if(str.length() < 1){
	    nonXstring = nonXstring.concat(xString);
	    return nonXstring;
	}
	
	if(str.substring(0, 1).equals("x")){
	    xString = xString.concat(str.substring(0, 1));
	}else{
	    nonXstring = nonXstring.concat(str.substring(0,1));
	}
	
	nonXstring = nonXstring + endX(str.substring(1));
		
	nonXstring = nonXstring.concat(xString);	
	  return nonXstring;
    }

    public String pairStar(String str) {

	if (str.length() < 2) {
	    return str;
	}

	if (str.substring(0, 1).equals(str.substring(1, 2))) {
	    str = str.substring(0, 1).concat("*").concat(str.substring(1));
	}
	str = str.substring(0, 1) + pairStar(str.substring(1));

	return str;

    }

    public String allStar(String str) {

	if (str.length() == 1) {
	    return str;
	}

	str = str.substring(0, 1).concat("*") + allStar(str.substring(1));

	return str;

    }

}
