/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kubrakkyn.lock;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class ListWorker {
    Random random=new Random();
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    //2 tane lock
    private Object lock1=new Object();
    private Object lock2=new Object();
    
    
    
    
    public void  list1DegerEkle(){
        synchronized(lock1){
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
       list1.add(random.nextInt(100));
     }
    }   
    
       public void list2DegerEkle(){
       synchronized(lock2){
         try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
         list2.add(random.nextInt(100));
       }
      
             
    }
     public void degerAta(){
         for(int i=0;i<1000;i++){
          list1DegerEkle();
         list2DegerEkle(); 
         }
        
         
        
     }  
     public void calistir(){
         
         Thread thread1=new Thread(new Runnable() {
             @Override
             public void run() {
                 degerAta();
             }
         });
         Thread thread2=new Thread(new Runnable() {
             @Override
             public void run() {
                 degerAta();
             }
         });
         long baslangic=System.currentTimeMillis();
         thread1.start();
         thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        long bitis=System.currentTimeMillis();
         System.out.println("List1 size:"+list1.size()+"List 2 size:"+list2.size());
         System.out.println("Toplam süre"+(bitis-baslangic));
      
         
     }
}
