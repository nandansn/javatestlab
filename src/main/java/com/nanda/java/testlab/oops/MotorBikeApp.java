/**
 * 
 */
package com.nanda.java.testlab.oops;

/**
 * @author Nandakumar 
 * 11-Jul-2017
 *
 */
public class MotorBikeApp {

    public static void main(String[] args) {
	
	Motor m = new Motor();
	
	m.start();
	
	m.stop();
	
	MotorBike mb = new MotorBike();
	mb.start();
	mb.moveFront();
	mb.stop();
	
	Motor mi = new MotorBike();
	
	mi.start();
	mi.stop();
	
	
	
	// mi.moveFront(); - compilation error. not allowed
	
	// MotorBike mbc = new Motor(); - compilation error. not allowed.
	
    }
}
