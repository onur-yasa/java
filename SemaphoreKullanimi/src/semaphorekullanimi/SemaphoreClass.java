/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorekullanimi;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class SemaphoreClass {
    private Semaphore sem=new Semaphore(3);
    public void threadFonk(int id){
        try {
            sem.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread baslıyor.."+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread çıkıyor.."+id);
        sem.release();
    }
}
