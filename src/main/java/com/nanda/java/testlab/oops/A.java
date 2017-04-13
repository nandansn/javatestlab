/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 
 * 11-Apr-2017
 * 
 * 
 *
 */

/**
 * Default class wont be available outside the package.
 * 
 * @author Nandakumar 
 * 11-Apr-2017
 * 
 */
class A {
    
    // method accessible within the package
    protected void protectedDisplayInPackage(){
	
	
    }
    
    // method accessible within the package only. Because the class is default.
    public void notAvailableOutsideThepackage(){
	
    }
    
    private void availableOnlyInClass(){
	
	
    }
    
    
    void defaultMethod(){
	
    }

}
