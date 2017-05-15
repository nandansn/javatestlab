/**
 * 
 */
package com.nanda.java.data.structures.implementatons;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

/**
 * @author Nandakumar 
 * 14-May-2017
 *
 */
public class MyListTest {
    
    MyList ml;
    
    /*@BeforeTest
    public void initList(){
	
	 ml = new MyList();
    }
    
    @Test
    public void testIsEmpty(){
	
	assertEquals(ml.isEmpty(),true);
    }
    
    @Test
    public void testSize(){
	
	assertEquals(ml.size(), 0);
    }
    
    @Test
    public void testAdd(){
	
	MyList list = new MyList();
	list.add(10);
	assertEquals(list.isEmpty(),false);
	assertEquals(list.size(), 1);
    }
    
    @Test
    public void testRemove(){
	
	MyList list = new MyList();
	list.add(10);
	assertEquals(list.isEmpty(),false);
	assertEquals(list.size(), 1);
	list.remove();
	assertEquals(list.isEmpty(),true);
	assertEquals(list.size(), 0);
    }*/
    
    @Test
    public void testInsert(){
	
	MyList list = new MyList();
	list.add(9);
	list.add(11);
	list.add(12);
	assertEquals(list.isEmpty(),false);
	assertEquals(list.size(), 3);
	list.add(10, 1);
	assertEquals(list.isEmpty(),false);
	assertEquals(list.size(), 4);
	assertEquals(list.get(1), 10);
	
	list.remove(11, 2);
	assertEquals(list.isEmpty(),false);
	assertEquals(list.size(), 3);
	assertEquals(list.get(2), 12);
    }

}
