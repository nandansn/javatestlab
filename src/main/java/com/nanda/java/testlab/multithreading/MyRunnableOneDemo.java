/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nanda.java.testlab.multithreading;

/**
 *
 * @author nanmathi
 */
public class MyRunnableOneDemo {
    
   
    
    public static void main(String[] args) {
        
         Runnable r = new MyRunnableOne();
         Thread th = new Thread(r);
         th.start();
         
         //r.run();
    }
    
    
    
}
