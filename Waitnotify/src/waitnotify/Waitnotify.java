/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitnotify;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class Waitnotify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WaitVeNotifyClass wn=new WaitVeNotifyClass();
        Thread waitThread=new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread1Metod();
            }
        });
        Thread notifyThread=new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread2Metod();
            }
        });
        waitThread.start();
        notifyThread.start();
        try {
            waitThread.join();
            notifyThread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Waitnotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
