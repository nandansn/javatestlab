/**
 * 
 */
package com.nanda.java.testlab.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Nandakumar 18-Apr-2017
 * 
 *         There are mainly 3 advantages of generics. They are as follows:
 * 
 *         1) Type-safety : We can hold only a single type of objects in
 *         generics. It doesn’t allow to store other objects.
 * 
 *         2) Type casting is not required: There is no need to typecast the
 *         object.
 * 
 *         3) Compile-Time Checking: It is checked at compile time so problem
 *         will not occur at runtime. The good programming strategy says it is
 *         far better to handle the problem at compile time than runtime.
 * 
 *         The type parameters naming conventions are important to learn
 *         generics thoroughly. The commonly type parameters are as follows:
 * 
 *         T - Type E - Element K - Key N - Number V - Value
 * 
 *         Wildcard in Java Generics
 * 
 *         The ? (question mark) symbol represents wildcard element. It means
 *         any type. If we write <? extends Number>, it means any child class of
 *         Number e.g. Integer, Float, double etc. Now we can call the method of
 *         Number class through any child class object. Comparator<? super
 *         String> denotes all instantiations of the Comparator interface for
 *         type argument types that are supertypes of String.
 * 
 *         Use the <? extends T> wildcard if you need to retrieve object of type
 *         T from a collection. Use the <? super T> wildcard if you need to put
 *         objects of type T in a collection. If you need to satisfy both
 *         things, well, don’t use any wildcard. As simple as it is. In short,
 *         remember the term PECS. Producer extends Consumer super. Really easy
 *         to remember.
 * 
 *         What is not allowed to do with Generics?
 * 
 *         a) You can’t have static field of type. private static T member;
 *         //This is not allowed b) You can not create an instance of T. new
 *         T(); // not allowed. c) Generics are not compatible with primitives
 *         in declarations. List<int> ids= new ArrayList<>(); //not allowed. d)
 *         You can’t create Generic exception class // public class
 *         GenericException<T> extends Exception // not allowed.
 * 
 *         Main Purpose of generics resolve type-casting problems provide
 *         type-safety
 * 
 *         type-safety and type-casting both are applicable at compile time.
 *         hence generics concept also applicable only at compile time but not
 *         at run time. at the time of compilation as a last step, generics
 *         syntax will be removed and hence for the jvm generics syntax wont be
 *         available.
 * 
 *
 */
public class GenericsExample {

    public static void main(String[] args) {

	List<String> names = new ArrayList<String>();
	names.add("Nanda");
	names.add("Kumar");
	// names.add(1); // Not allowed complite time error

	// for each iteration
	for (String string : names) {
	    System.out.println(string);
	}

	Map<Integer, String> employees = new HashMap<Integer, String>();
	employees.put(1, "Nanda");
	employees.put(2, "Kumar");
	employees.put(3, "Dinesh");
	employees.put(4, "Gnana");

	Set<Map.Entry<Integer, String>> employeesEntry = employees.entrySet();

	for (Entry<Integer, String> entry : employeesEntry) {

	    System.out.println(entry.getKey());
	    System.out.println(entry.getValue());

	}

	// At compile time <String> will be removed so there wont be any runtime
	// exception. generics concept applicable only at the compile time.
	List list = new ArrayList<String>();

	list.add(10);
	list.add(10.5);
	list.add("Nanda");

	for (int i = 0; i < list.size(); i++) {

	    System.out.println(list.get(i));
	}

	// following declarations are equal. for these arraylist objects we can
	// add only string type of objects.
	List<String> listone = new ArrayList<String>();
	List<String> listTwo = new ArrayList();

    }
    
    /**
     * At compile time,
     * 		compile code normally.
     * 		remove generic syntax.
     *          compile resultant code.
     * 
     * @param al
     */
    public static void methodOne(ArrayList<String> al) {

    }

    /*public static void methodOne(ArrayList<Integer> al) {

    }*/

}
