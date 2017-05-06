/**
 * 
 */
package com.nanda.java.testlab.design.patterns;

/**
 * @author Nandakumar 
 * 27-Apr-2017
 *
 */
public class SingleTonSatelite {
    
    
    
    private SingleTonSatelite(){
	
    }
    
    private static class InstanceHelper{
	
	 static final SingleTonSatelite  sateliteInstance = new SingleTonSatelite();
    }
    
    
    public static SingleTonSatelite getInstance(){
	
	return InstanceHelper.sateliteInstance;
    }
    

}
