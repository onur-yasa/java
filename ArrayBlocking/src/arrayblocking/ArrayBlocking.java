/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayblocking;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class ArrayBlocking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProducerConsumer pc=new ProducerConsumer();
        Thread producer=new Thread(new Runnable() {
            @Override
            public void run() {
                pc.produce();
            }
        });
         Thread consumer=new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consume();
            }
        });
         producer.start();
         consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ArrayBlocking.class.getName()).log(Level.SEVERE, null, ex);
        }
         
                
    }
    
}
