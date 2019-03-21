/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramazanpidesi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Kubra
 */
public class RamazanPidesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Ramazan pidesi uygulaması");
        Queue<String> pideKuyrugu=new LinkedList<String>();
        Random random=new Random();
        pideKuyrugu.offer("Kubra");
        pideKuyrugu.offer("Merve");
        pideKuyrugu.offer("Apo");
        pideKuyrugu.offer("Emre");
        pideKuyrugu.offer("Sinem");
        pideKuyrugu.offer("Sedef");
        pideKuyrugu.offer("Zeynep");
        pideKuyrugu.offer("Meryem");
        pideKuyrugu.offer("Yusuf");
        pideKuyrugu.offer("Ayse");
        int pideSayisi=random.nextInt(10)+1;
        System.out.println(pideSayisi+" tane pide yapıldı...");
        Thread.sleep(3000);
        while(pideSayisi!=0){
            System.out.println(pideKuyrugu.poll()+" pide aldı");
            pideSayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı...");
        
        
    }
    
}
