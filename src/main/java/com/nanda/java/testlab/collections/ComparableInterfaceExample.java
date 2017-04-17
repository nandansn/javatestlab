/**
 * 
 */
package com.nanda.java.testlab.collections;

/**
 * @author Nandakumar 15-Apr-2017
 * 
 *         Comparable<T> present in java.lang package. It contains only one
 *         method called compareTo
 * 
 *         compareTo method returns -1 if object1 has to come before object2.
 * 
 *         compareTo method returns 1 if object1 has to come after object2.
 * 
 *         compareTo method returns 0 if object1 is equal to object2.
 * 
 *         If we are depending on default natural sorting order JVM will
 *         internally call compareaTo method while inserting the object.
 *         object1.compareTo(object2); here object1 is the current element
 *         object2 is already inserted element.
 * 
 *         Comparable provides single sorting sequence. In other words, we can
 *         sort the collection on the basis of single element such as id or name
 *         or price etc.
 * 
 *         Comparable affects the original class i.e. actual class is modified.
 * 
 *         Comparable provides compareTo() method to sort elements.
 * 
 *         Comparable is found in java.lang package.
 * 
 *         We can sort the list elements of Comparable type by
 *         Collections.sort(List) method.
 * 
 *
 */
public class ComparableInterfaceExample implements Comparable<ComparableInterfaceExample> {

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(ComparableInterfaceExample o) {
	// TODO Auto-generated method stub
	return 0;
    }

}
