/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsayi;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class MaxSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int sayi1,sayi2,sayi3,max;
        System.out.print("1.sayiyi giriniz:");
        sayi1=scanner.nextInt();
        System.out.print("2.sayi giriniz:");
        sayi2=scanner.nextInt();
        System.out.print("3.sayi giriniz:");
        sayi3=scanner.nextInt();
        max=sayi1;
        if(sayi1<sayi2)
         max=sayi2;
        if(sayi3>max)
            max=sayi3;
        System.out.println("En buyuk sayi:"+max);
        
            
    }
    
}
