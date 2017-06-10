/**
 * 
 */
package com.nanda.java.datastructures.map;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * @author Nandakumar 
 * 09-Jun-2017
 *
 */
public class WeakHashMapExample {
    
public static void main(String[] args) {
	
	
	WeakHashMap m = new WeakHashMap();
	
	Tempweek t = new Tempweek();
	
	m.put(t, "nanda");
	System.out.println(m);
	
	t = null;
	
	System.out.println(m);
	
	System.gc();
	
	System.out.println(m);
	
	
    }

}

class Tempweek{

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Temp";
    }
    
    public void finalize(){
	
	System.out.println("gc clearing useless objects");
    }
    
    
}
