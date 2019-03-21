/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexecution;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class ThreadExecution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Thread t1=new Thread(new Worker("1", 1));
        Thread t2=new Thread(new Worker("2", 2));
        Thread t3=new Thread(new Worker("3", 3));
        Thread t4=new Thread(new Worker("4", 4));
        Thread t5=new Thread(new Worker("5", 5));
        System.out.println("İşler teslim edildi");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadExecution.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadExecution.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         t5.start();
            try {
              t5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadExecution.class.getName()).log(Level.SEVERE, null, ex);
        
        }
            System.out.println("İşler tamamlandı");*/
        //bir suru thread olsa yukardaki şekilde uzayacatkı kod onun için şunu yapıyoruz
        //thread havuzu oluşturup en fazla kac tane thread aynı anda çalışır onu yazıyoruz
        ExecutorService executor=Executors.newFixedThreadPool(2);
        for(int i=1;i<=5;i++){
            executor.submit(new Worker(String.valueOf(i), i));
            
        }
        System.out.println("İşleer teslim edildi");
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadExecution.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("İşlemler bitti");
                
                
    }

}
