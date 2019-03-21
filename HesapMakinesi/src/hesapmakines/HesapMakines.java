/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakines;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class HesapMakines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        int a,b;
        System.out.println("********************************");
        String islemler="1-Toplama İşlemi\n"+
                        "2-Çıkarma İşlemi\n"+
                        "3-Çarpma  İşlemi\n"+
                        "4-Bolme   İşlemi\n";
        System.out.println(islemler);
        System.out.println("*********************************");
        String islem=scanner.nextLine();
        switch(islem){
            case "1":
                System.out.println("1.sayi giriniz");
                a=scanner.nextInt();
                System.out.println("2.sayı girniz");
                b=scanner.nextInt();
                System.out.println("Toplamları:"+(a+b));
                break;
            case "2":
                System.out.println("1.sayi giriniz");
                a=scanner.nextInt();
                System.out.println("2.sayı girniz");
                b=scanner.nextInt();
                System.out.println("Farkları:"+(a-b));
                break; 
            case "3":
                System.out.println("1.sayi giriniz");
                a=scanner.nextInt();
                System.out.println("2.sayı girniz");
                b=scanner.nextInt();
                System.out.println("Carpımları:"+(a*b));
                break;
            case "4":
                System.out.println("1.sayi giriniz");
                a=scanner.nextInt();
                System.out.println("2.sayı girniz");
                b=scanner.nextInt();
                System.out.println("Bolumleri:"+((double)a/b));
                break;
            default:
                System.out.println("Geçersiz işlem....");
                break;
        }
             
                
                
    }
    
}
