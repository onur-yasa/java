/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorekullanimi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class SemaphoreKullanimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SemaphoreClass sem=new SemaphoreClass();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                sem.threadFonk(1);
            }
        });
          Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                sem.threadFonk(2);
            }
        });
            Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                sem.threadFonk(3);
            }
        });
              Thread thread4=new Thread(new Runnable() {
            @Override
            public void run() {
                sem.threadFonk(4);
            }
        });
          Thread thread5=new Thread(new Runnable() {
            @Override
            public void run() {
                sem.threadFonk(5);
            }
        });      
         thread1.start();
         thread2.start();
         thread3.start();
         thread4.start();
         thread5.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreKullanimi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
