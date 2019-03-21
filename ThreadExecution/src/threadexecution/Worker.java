/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadexecution;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class Worker  implements Runnable{

    private String name;
    private int id;
    public Worker(String name,int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public void run() {
        try {
            System.out.println("Worker:"+name+" task id:"+id+" işe başladı");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Worker:"+name+" task id:"+id+" işe bitti");
    }
    
}
