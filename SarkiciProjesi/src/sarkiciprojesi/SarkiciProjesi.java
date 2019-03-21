/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarkiciprojesi;

import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class SarkiciProjesi {

    /**
     * @param args the command line arguments
     * 
     */
    private  static Sarkici sarkicilar=new Sarkici();
    public static  Scanner scanner=new Scanner(System.in);
    public static void Baslangic(){
        System.out.println("\t 0-İşlemleri görüntüle");
        System.out.println("\t 1-Şarkıcıları görüntüle");
        System.out.println("\t 2-Şarkıcı ekle");
        System.out.println("\t 3-Şarkıcı sil");
        System.out.println("\t 4-Şarkıcı güncelle");
        System.out.println("\t 5-Şarkıcı ara");
        System.out.println("\t Programdan çık");
    }
    public static void SarkiciBilgi(){
        sarkicilar.Bilgiler();
    }
    public static void sarkiciEkle(){
        String isim=scanner.nextLine();
        sarkicilar.SarkiciEkle(isim);
    }
    public static void sarkiciSil(){
        System.out.println("İd deger giriniz(1,2,3) şeklinde");
        int id=scanner.nextInt();
        sarkicilar.SarkiciCikar(id-1);
    }
    public static void sarkiciGuncelle(){
        System.out.println("Sırası ile isim ve index giriniz");
        String isim=scanner.nextLine();
        int index=scanner.nextInt();
        scanner.nextLine();
        sarkicilar.guncelle(isim, index-1);
    }
    public static void sarkiciAra(){
        System.out.println("Sarkıcı ismi giriniz");
        String sarkici=scanner.nextLine();
        sarkicilar.ara(sarkici);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Şarkıcı programına hosgeldiniz");
        boolean dongu=false;
        int secim;
        while (!dongu) {  
            System.out.println("İşlem seçiniz");
            secim=scanner.nextInt();
            scanner.nextLine();
            switch(secim){
                case 0:
                    Baslangic();
                    break;
                case 1:
                    SarkiciBilgi();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciSil();
                    break;
                case 4:
                    sarkiciGuncelle();
                    break;
                case 5:
                    sarkiciAra();
                    break;
                case 6:
                    dongu=true;
                    System.out.println("Progrmdan cıkılıyor");
                    break;
  
            }
            
        }
        
    }
    
}
