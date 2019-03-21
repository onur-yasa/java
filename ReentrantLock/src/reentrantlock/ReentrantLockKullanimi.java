/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reentrantlock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class ReentrantLockKullanimi {
    
    private int say=0;
    private  Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void artir(){
        for(int i=0;i<1000;i++){
            say++;
        }
    }
    public void thread1Fonk(){
        lock.lock();
        System.out.println("Thread1 çalısıyor");
        System.out.println("Thread 1 uyanmayı bekliyor");
        try {
            condition.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockKullanimi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Threa1 uyandı");
        artir();
        lock.unlock();
                
    }
    public void thread2Fonk(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockKullanimi.class.getName()).log(Level.SEVERE, null, ex);
        }
        lock.lock();
        System.out.println("Thread2 çaısıyır");
        System.out.println("Devam etmek için tusa bas");
        Scanner scanner=new Scanner(System.in);
        scanner.nextInt();
        condition.signal();
        System.out.println("Thread 2 bitti.Thread 1  uyandırılacak");
        artir();
        lock.unlock();
                
    }
    public void sonuc(){
        System.out.println("Say:"+say);
    }
}
