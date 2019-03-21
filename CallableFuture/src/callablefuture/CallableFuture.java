/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callablefuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class CallableFuture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService ex=Executors.newFixedThreadPool(1);
        Random random=new Random();
        
        Future<?> future= ex.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Thread çalısıyor");
                int sure=random.nextInt(1000)+2000;
                if(sure>2500){
                    throw new IOException("Thread fazla uyudu");
                }
                Thread.sleep(sure);
                System.out.println("Thread çıkıyor");
                return sure;
                        
            }
        });
        ex.shutdown();
        try {
            System.out.println("Sure:"+ future.get());
        } catch (InterruptedException ex1) {
            Logger.getLogger(CallableFuture.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (ExecutionException ex1) {
            Logger.getLogger(CallableFuture.class.getName()).log(Level.SEVERE, null, ex1);
        }
        
    }
    
}
