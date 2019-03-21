/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acilservis;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Kubra
 */
public class AcilServis {

    /**
     * @param args the command line arguments
     */
    /*Apandisit->En yuksek öncelik
      Yanık->
      Baş Ağrısı->En düşük
    
    */
    
    public static void main(String[] args) {
        // TODO code application logic 
        Queue<Hasta> hastalar=new PriorityQueue<Hasta>();
        hastalar.offer(new Hasta("Murat Bey", "Yanık"));
        hastalar.offer(new Hasta("Okan Bey", "Baş Ağrısı"));
        hastalar.offer(new Hasta("Elif Hanım", "Apandisit"));
        hastalar.offer(new Hasta("Oğuz Bey", "Yanık"));
        hastalar.offer(new Hasta("Kubra Hanım", "Yanık"));
        hastalar.offer(new Hasta("Gizem Hanım", "Apandisit"));
        //
        int sira=1;
        while(!hastalar.isEmpty()){
            System.out.println(sira+". sırada "+hastalar.poll());
            System.out.println("********************** ");
            sira++;
        }
        
    }
    
}
