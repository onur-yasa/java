/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interrupthread;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class InterrupThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> liste=new LinkedList<>();
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalısıyor");
                for(int i=0;i<1000000;i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Kesintiye ugradı");
                        return;
                    }
                    liste.add(i);
                }
                System.out.println("Kesintiye ugramadı");
            }
        });
        /*Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
              /*  System.out.println("Thread çalısıyor");
                for(int i=1;i<=10;i++){
                    System.out.println("Threa yazıyor.."+i);
                    try {
                        Thread.sleep(1000);
                        System.out.println("Uykumun "+i+". saniyesindeyim");
                    } catch (InterruptedException ex) {
                        System.out.println("Uykum bölündü");
                    }
                }
        }
        });*/
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(InterrupThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.interrupt();
    }
    
}
