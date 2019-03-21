/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idman;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class Idman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Idman progrmına hosgeldin");
        String islemler="Pushup\n"+
                        "Burpy\n"+
                        "Squad\n"+
                        "Situp";
        System.out.println("***************************");
        System.out.println("İşlemler:"+islemler);
        System.out.println("***************************");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pushup Sayisi:");
        int pushup=scanner.nextInt();
        System.out.println("Burpy sayısı:");
        int burpy=scanner.nextInt();
        System.out.println("Squad sayısı:");
        int squad=scanner.nextInt();
        System.out.println("Situp sayısı:");
        int situp=scanner.nextInt();
        scanner.nextLine();
        
        IdmanYap idman=new IdmanYap(squad, burpy, pushup, situp);
        while(!idman.HareketKaldımı()){
            System.out.println("Haraekt turuu:");
            String hareket=scanner.nextLine();
            System.out.println("Hareket sayısı:");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(hareket, sayi);
            
        }
        System.out.println("Idman tamamlandı");
        
    }
    
}
