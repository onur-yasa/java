/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumernotifywait;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class ProducerConsumer {
    
    private Object lock=new Object();
    Random random=new Random();
    Queue<Integer> queue=new LinkedList<>();
    public void produce(){
     
        while(true){
             try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
              synchronized(lock){
                if(queue.size()==10){
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Integer value=random.nextInt(100);
                queue.offer(value);
                System.out.println("Değer üretildi:"+value);
                lock.notify();//guvenlık için uyuan biri varsa uyandır
                       
            }
        }
    }
    public void consume(){
         while (true) {   
             
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized(lock){
                       
                if(queue.size()==0){
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                Integer value=queue.poll();
                System.out.println("Değer alındı"+value);
                System.out.println("Size:"+queue.size());
                lock.notify();
            }
        }
        
    }
    
}
