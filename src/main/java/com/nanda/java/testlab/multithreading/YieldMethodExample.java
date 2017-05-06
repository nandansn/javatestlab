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
public class YieldMethodExample {
    
    public static void main(String[] args) {
        
        YieldThread yt = new YieldThread();
        
        Thread thread = new Thread(yt);
        thread.start();
        
        for(int i=0; i<20; i++){
            System.out.println("Main Thread");
            Thread.yield();
        }
        
        
    }
    
}

class YieldThread implements Runnable{
    
    public void run(){
        
        for(int i=0; i<20; i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
