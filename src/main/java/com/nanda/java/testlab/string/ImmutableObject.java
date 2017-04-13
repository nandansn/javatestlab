/**
 * 
 */
package com.nanda.java.testlab.string;

/**
 * @author Nandakumar 12-Apr-2017
 * 
 *         class is immutable because:
 * 
 *         The instance variable of the class is final i.e. we cannot change the
 *         value of it after creating an object. The class is final so we cannot
 *         create the subclass. There is no setter methods i.e. we have no
 *         option to change the value of the instance variable.
 *
 */
final public class ImmutableObject {

    final String name;

    ImmutableObject(String name) {

	this.name = name;

    }

    public String getName() {

	return this.name;
    }

}
