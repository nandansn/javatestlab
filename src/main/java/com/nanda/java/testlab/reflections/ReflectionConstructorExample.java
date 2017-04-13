/**
 * 
 */
package com.nanda.java.testlab.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.nanda.java.testlab.oops.ICICIBank;

/**
 * @author Nandakumar 
 * 12-Apr-2017
 *
 */
public class ReflectionConstructorExample {
    
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
	Class c = ICICIBank.class;
	Constructor constructor = c.getConstructor();
	Object obj = constructor.newInstance();
	
	ICICIBank bankObj = (ICICIBank) obj;
	bankObj.deposit();
    }

}
