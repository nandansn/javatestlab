/**
 * 
 */
package com.nanda.java.datastructures.map;

import java.util.HashMap;

/**
 * @author Nandakumar 
 * 09-Jun-2017
 *
 */
public class HashMapGCExample {
    
    public static void main(String[] args) {
	
	
	HashMap m = new HashMap();
	
	Temp t = new Temp();
	
	m.put(t, "nanda");
	System.out.println(m);
	
	t = null;
	
	System.gc();
	
	
    }

}

class Temp{

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
