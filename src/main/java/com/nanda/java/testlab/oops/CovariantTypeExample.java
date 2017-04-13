/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 11-Apr-2017
 * 
 *         The covariant return type specifies that the return type may vary in
 *         the same direction as the subclass.
 * 
 *         Before Java5, it was not possible to override any method by changing
 *         the return type. But now, since Java5, it is possible to override
 *         method by changing the return type if subclass overrides any method
 *         whose return type is Non-Primitive but it changes its return type to
 *         subclass type
 *
 */
public class CovariantTypeExample {

    public static void main(String args[]) {

	Child c = new Child("Nivrithi").getInstance();
    }

}
