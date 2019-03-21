/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kubrakkyn.thread2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class Printer implements Runnable{

    private String name;
    public Printer(String name){
        this.name=name;
    }
    @Override
    public void run() {
        try {
            System.out.println(name+" çalışıyor");
            for(int i=1;i<=10;i++){
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
