/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kubrakkyn.thread2;

/**
 *
 * @author Kubra
 */
public class Main {
    public static void main(String[] args) {
       Thread printer1=new Thread(new Printer("Printer1"));
       Thread printer2=new Thread(new Printer("Printer2"));
        
       printer1.start();
       printer2.start();
       System.out.println("Main thread");
       
    }
}
