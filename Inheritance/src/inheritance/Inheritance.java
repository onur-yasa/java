/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hosgeldiniz..");
        String islemler="1-Yazılımcı işlemleri\n"+
                        "2-Yönetici işlemleri\n"+
                        "3-Çıkış için q";
        System.out.println("***********************");
        System.out.println("İşlemler..");
        System.out.println(islemler);
        System.out.println("************************");
              
        while (true) {            
            
            System.out.println("İşlem seçiniz");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Yazılımcı işlemlerine hoşgeldiniz..");
                String yIslem="1-Format at\n"+
                              "2-Bilgileri goster\n"+
                              "3-Çıkış için q bas";
                System.out.println("İşlemler.");
                System.out.println(yIslem);
                while (true) {      
                    System.out.println("İşlem seç");
                    String Yislem=scanner.nextLine();
                    Yazilimci devp=new Yazilimci("C,Python", "Kubra", 5000, "IT");
                    if(Yislem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinde cıkılıyor");
                        break;
                    }
                    else if(Yislem.equals("1")){
                        
                        System.out.println("İşletim sis.girinin");
                        String isltSis=scanner.nextLine();
                        devp.format(isltSis);
                    }
                    else if(Yislem.equals("2")){
                        devp.bilgileriGoster();
                    }
                    else{
                        System.out.println("Yanlış seçim.");
                        break;
                    }
                    
                }
            }
            else if(islem.equals("2")){
                System.out.println("Yönetii işlenlerine hosgeldin");
                String YonIslemler="1-Zam yap\n"+
                                "2-Bilgileri goster\n"+
                                "3-Çıkış";
                System.out.println("İşlemler..");
                System.out.println(YonIslemler);
                while (true) {        
                    System.out.println("İşlem seç");
                    String yislem=scanner.nextLine();
                    Yonetici y1=new Yonetici("MErve", 5000, "Food", 40);
                    if(yislem.equals("q")){
                        System.out.println("Yönetici işlemlerinden cıkılıyor");
                        break;
                    }
                    else if(yislem.equals("1")){
                        System.out.println("Zam miktai giriniz");
                        int zamMiktari=scanner.nextInt();
                        scanner.nextLine();
                        y1.zamYap(zamMiktari);
                        
                    }
                    else if(yislem.equals("2")){
                        System.out.println("Bilgiler..");
                        y1.bilgileriGoster();
                    }
                    else{
                        System.out.println("Yanlıs secim");
                        break;
                        
                    }
                    
                }
                
            }
            else{
                System.out.println("Yanlıs secim");
                break;
            }
            
        }
    } 
    
}
