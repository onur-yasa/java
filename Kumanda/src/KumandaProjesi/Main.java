/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KumandaProjesi;

import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Kumanda programınza hosgeldiniz");
        Scanner scanner=new Scanner(System.in);
        Kumanda kanal=new Kumanda();
        String islemler="1-Çıkış için q ya basın\n"+
                        "2-Kanalları görüntülemek için 1 e basın\n"+
                        "3-Kanal eklemek için 2 ye basın\n"+
                        "4-Kanal silmek için 3 e basın\n"+
                        "5-Kanal sayısını öğrenmek için 4 e basın";
        while (true) {            
            System.out.println(islemler);
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Kanallar:");
                kanalGoruntule(kanal);
            }
              else if(islem.equals("2")){
                System.out.println("Eklenilecek kanalı giriniz:");
                String EklenecekKanal=scanner.nextLine();
                kanal.KanalEkle(EklenecekKanal);
                System.out.println(EklenecekKanal+" kanalı eklendi...");
            }
              else if(islem.equals("3")){
                System.out.println("Silinecek kanalı giriniz:");
                String silinecekKanal=scanner.nextLine();
                kanal.KanalSil(silinecekKanal);
                
            }
              else if(islem.equals("4")){
                System.out.println("Kanallar:");
                System.out.println("Kanal sayısı:"+kanal.kanalSayisi());
            }
              else{
                  System.out.println("Geçersiz işlem...");
              }
            
        }
    }
    public static void kanalGoruntule(Kumanda kumanda){
        if(kumanda.kanalSayisi()==0){
            System.out.println("Henüz kanal eklemediniz...");
        }
        else{
            
            for(String k:kumanda){
                System.out.println(k);
            }
        }
        
    }
}
