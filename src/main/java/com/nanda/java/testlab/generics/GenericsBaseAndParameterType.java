/**
 * 
 */
package com.nanda.java.testlab.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Nandakumar 07-May-2017
 * 
 * parameter type can be class, interface but not the primitive data type.
 *
 */
public class GenericsBaseAndParameterType {

    public static void main(String[] args) {

	ArrayList<String> al = new ArrayList<String>();

	List<String> l = new ArrayList<String>();

	Collection<String> c = new ArrayList<String>();

	// Collection<Object> c2 = new ArrayList<String>(); Not allowed.
	// polymorphism/overriding applicable only for base type not for the
	// parameter type.
    }

}
