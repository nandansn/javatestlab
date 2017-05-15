/**
 * 
 */
package com.nanda.java.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Nandakumar 
 * 11-May-2017
 * 
 * Need to represent group of string objects according to a pattern then we can go regular expressions.
 * 
 * Lexical Analysis -> Syntax Analysis -> Semantic analysis -> Inter code generator -> code optimization -> target code generator.
 * 
 * Lexical Analyis : Implemented using tokenization concepts.
 * 	- Scanning
 * 	- Tokenization
 * 
 * Application Area:
 * 	validation frameworks
 * 	pattern matching applications
 * 	while designing compilers, translators, interpreters.
 * 	while designing digital circuits
 * 	while developing communication protocols like TCP/IP, UDP
 * 
 * 
 *
 */
public class ExampleOne {
    
    public static void main(String[] args) {
	
	String str ="ababbbab";
	// create a pattern object. with the string or pattern you are going to search.
	// Factory methods. If you are calling a method using the class and that method returns the object of same class is called factory method or factory pattern.
	
	 Pattern p = Pattern.compile("ab"); // equivalent java object of regular expression.
	 
	 // create a matcher object with the target string. to match the given pattern in the target string.
	 Matcher m = p.matcher(str);
	 
	 int count = 0;
	 
	 while(m.find()){ // m.find() used to find the next match.
	     System.out.println(m.start()+"..."+m.end()+"..."+m.group()); // end method is implemented in such a way that it returns end index + 1.
	     // m.start() return type is int.  m.group() return type string tells the mathced string. 
	     count++;
	 }
	 System.out.println(count);
	 
    }

}
