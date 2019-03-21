/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlockolusumu;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Kubra
 */
public class DeadlockOrnek {

        Hesap hesap1=new Hesap();
        Hesap hesap2=new Hesap();
        private Random random=new Random();
        private Lock lock1=new ReentrantLock();
        private Lock lock2=new ReentrantLock();
        public void LockKontrol(Lock lock1,Lock lock2){
            boolean a_elde=false;
            boolean b_elde=false;
            while (true) {                
                a_elde=lock1.tryLock();
                b_elde=lock2.tryLock();
                if(a_elde == true && b_elde == true){
                  return;
                }
               if(a_elde){
                lock1.unlock();
               }
              if(b_elde){
                lock2.unlock();
              }        
            }
          
        }
        public void thread1Fonk(){
         LockKontrol(lock1,lock2);
            for(int i=0;i<500;i++){
                Hesap.paraTransferi(hesap1, hesap2, random.nextInt(100));
            }
            lock1.unlock();
            lock2.unlock();
        }
        public void thread2Fonk(){
            
            LockKontrol(lock2,lock1);
              for(int i=0;i<500;i++){
                Hesap.paraTransferi(hesap2, hesap1, random.nextInt(100));
            }
            lock2.unlock();
            lock1.unlock();
        }
        public void threadOver(){
            System.out.println("hesap1 bakiye:"+hesap1.getBakiye()+" Hesap 2 bakiye:"+hesap2.getBakiye());
        }
        
    
}
