/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kubrakkyn.thread1;

/**
 *
 * @author Kubra
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Main thread");
        Printer printer1=new Printer("Printer1");
        
        Printer printer2=new Printer("Printer2");
        printer1.start();
        printer2.start();
                
    }
}
