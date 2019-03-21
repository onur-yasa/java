/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi=scanner.nextInt();
        System.out.println("Basamak sayısı");
        int basamak=scanner.nextInt();
        int gecici_sayi=sayi;
        int toplam=0;
        do {            
            int basamakdegeri=gecici_sayi%10;
            gecici_sayi/=10;
            toplam+=Math.pow(basamakdegeri,basamak);
                    
        } while (gecici_sayi>0);
        if(toplam==sayi){
            System.out.println("Armstrong bir sayı");
            
        }
        else
            System.out.println("Armstrong degil");
    }
    
}
