/**
 * 
 */
package com.nanda.java.testlab.identifiers;

/**
 * @author Nandakumar 
 * 09-May-2017
 * 
 * Name in java is called identifiers. It can be class name, method name, variable name or label name
 *
 * In the below class 5 identifiers
 * 	- IdentifierFirstExample
 * 	- main
 * 	- args
 * 	- x
 * 	- String (is a class name)
 * 
 * Rules for defining java identifiers:
 * 	Allowed characters : a to z/A to Z/0 to 9/$/_ other than these characters not allowed
 * 	Identifiers should not start with numbers like 123total invalid.
 * 	Java identifiers are case sensitive. we can differentiate the identifiers with case.
 * 	No length limitation for identifier.
 * 	we can't use reserved words as identifiers
 * 	we can use pre-defined class, method and interface names as identifiers. Even though 
 *      it is valid but it is not a good programming practice.
 * 
 */
public class IdentifierFirstExample {
    
    public static void main(String[] args) {
	
	int x =10;
	
	int number = 10;
	
	int Number = 10;
	
	int NUMBER = 10;
	
	int String = 20;
	
	System.out.println(String);
	
	int Runnable = 30;
	
	
	
	System.out.println(Runnable);
	
	int main = 11;
	
	System.out.println(main);
    }

}
