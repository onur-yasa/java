/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayblocking;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class ProducerConsumer {
    Random random=new Random();
    BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
    public void produce(){
        while (true) {            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            try {
                 Integer value=random.nextInt(100);
                queue.put(value);
                System.out.println("Produce Değer üretildi:"+value);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
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
            
            try {
                Integer value = queue.take();
                System.out.println("Consume tüketti:"+value);
                System.out.println("Size:"+queue.size());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        
        }
        
    }
}
