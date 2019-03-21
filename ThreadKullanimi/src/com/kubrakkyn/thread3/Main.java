/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kubrakkyn.thread3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class Main {
    public static void main(String[] args) {
       /* Thread printer1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1.thread");
                for(int i=1;i<10;i++){
                    try {
                        System.out.println("1.thread"+":"+i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        });
         Thread printer2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("2.thread");
                for(int i=1;i<10;i++){
                    try {
                        System.out.println("2.thread"+":"+i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        });
         printer1.start();
         printer2.start();*/
       new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("2.thread");
                for(int i=1;i<10;i++){
                    try {
                        System.out.println("2.thread"+":"+i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        }).start();
         System.out.println("Main thread");
               
                 
    }
 
}
