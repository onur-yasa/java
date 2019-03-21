/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitnotify;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class WaitVeNotifyClass {
    private Object lock=new Object();

    public void thread1Metod(){
        synchronized(lock){
            System.out.println("Thread 1 çalısşıyor");
            System.out.println("Thread1 uynadırlmayı bekliyor");
            try {
                lock.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitVeNotifyClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thread 1 uyandı");
        }
    }
     public void thread2Metod(){
           try {
                 Thread.sleep(2000);
             } catch (InterruptedException ex) {
                 Logger.getLogger(WaitVeNotifyClass.class.getName()).log(Level.SEVERE, null, ex);
             }
         synchronized(lock){
           
         System.out.println("Thread 2 çalışıyor");   
         System.out.println("Devam etmek için tusa bas");
         Scanner scanner=new Scanner(System.in);
         scanner.nextLine();
         lock.notify();
             System.out.println("Thread 2 işi bitti.Thread 1 i uyandrıyor.2 sn sonra uyanacak");
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(WaitVeNotifyClass.class.getName()).log(Level.SEVERE, null, ex);
               }
             
         }
        
    }
}
