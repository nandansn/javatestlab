/**
 * 
 */
package com.nanda.java.testlab.entity;

import java.util.Comparator;

/**
 * @author Nandakumar 
 * 15-Apr-2017
 *
 */
public class StudentComparatorExample implements Comparator<Student> {

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(Student arg0, Student arg1) {
	// TODO Auto-generated method stub
	return 0;
    }

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
   /* @Override
    public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	
	if(o2.id == o1.id){
	    return 0;
	}
	if(o2.id > o1.id){
	    return 1;
	}else{
	    return -1;
	}
	
	//return o2.id.compareTo(o1.id);
    }*/
    
  
}
