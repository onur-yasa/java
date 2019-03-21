/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idmanprogramilog;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class IdmanProgramiLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Programına Hoşgeldiniz...");
        
        String idmanlar = "Geçerli Hareketler...\n"
                          + "Burpee\n"
                          +"Pushup(Şınav)\n"
                          +"Situp(Mekik)\n"
                          +"Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun...");
        
        System.out.print("Burpee Sayısı : ") ;
        int burpee = scanner.nextInt();
        System.out.print("Pushup Sayısı : ") ;
        int pushup = scanner.nextInt();
        System.out.print("Situp Sayısı : ") ;
        int situp = scanner.nextInt();
        System.out.print("Squat Sayısı : ") ;
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
    
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız Başlıyor.....");
        try(FileWriter writer=new FileWriter("deneme.txt")){
            writer.write("Burpee Sayısı:"+idman.getBurpee_sayisi()+"\n");
            writer.write("Pushup Sayısı:"+idman.getPushup_sayisi()+"\n");
            writer.write("Situp Sayısı:"+idman.getSitup_sayisi()+"\n");
            writer.write("Squat Sayısı:"+idman.getSquat_sayisi()+"\n");
          while (idman.idmanBittiMi() == false){
            
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
            writer.write("Hareket türü:"+tur+" Sayısı:"+sayi+"\n");
          }
          
          System.out.println("Tebrikler.İdman bitti");
        } catch (IOException ex) {
            System.out.println("Hata oluştu");
        }
                  
    }
    
}
