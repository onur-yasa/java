/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlockolusumu;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class DeadLockOlusumu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DeadlockOrnek deadlockOrnek=new DeadlockOrnek();
     
      Thread thread1=new Thread(new Runnable() {
          @Override
          public void run() {
              deadlockOrnek.thread1Fonk();
          }
      });
       Thread thread2=new Thread(new Runnable() {
          @Override
          public void run() {
              deadlockOrnek.thread2Fonk();
          }
      });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(DeadLockOlusumu.class.getName()).log(Level.SEVERE, null, ex);
        }
        deadlockOrnek.threadOver();
    }
    
}
