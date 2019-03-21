/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakamlartoplami;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class RakamlarToplami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi girniz");
        int sayi=scanner.nextInt();
        int toplam=0;
        do {            
           toplam+=sayi%10;
           sayi=sayi/10;
           
        } while (sayi>0);
        System.out.println("Toplam"+toplam);
    }
    
}
