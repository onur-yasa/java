/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyadanokuyaraknothesaplama;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class DosyadanOkuyarakNotHesaplama {

    /**
     * @param args the command line arguments
     */
    public static String hesapla(String isim,int vize1,int vize2,int finalNotu){
        
        String cikti="";
        double toplam=(vize1*3/10.0)+(vize2*3/10.0)+(finalNotu*4/10.0);
        if(toplam>=90){
            cikti=isim+" AA aldı";
        }
        else if(toplam>=85){
            cikti=isim+" BA aldı";
        }
         else if(toplam>=75){
            cikti=isim+" BB aldı";
        }
        
         else if(toplam>=65){
            cikti=isim+" CB aldı";
        }
         else if(toplam>=55){
            cikti=isim+" CC aldı";
        }
         else if(toplam>=45){
            cikti=isim+" DD aldı";
        }
         else if(toplam>=35){
             cikti=isim+" FF aldı";
         }
        
        
        return cikti;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try(Scanner scanner=new Scanner(new FileReader("dosya.txt"));
                FileWriter writer=new FileWriter("harfnotlari.txt")){
            while(scanner.hasNextLine()){
                String ogrenci=scanner.nextLine();
                String[] ogrdizi=ogrenci.split(",");
                String isim=ogrdizi[0];
                int vize1=Integer.valueOf(ogrdizi[1]);
                int vize2=Integer.valueOf(ogrdizi[2]);
                int finalNotu=Integer.valueOf(ogrdizi[3]);
                String sonuc=hesapla(isim, vize1, vize2, finalNotu);
                writer.write(sonuc+"\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Hata oluştu");
        } catch (IOException ex) {
            System.out.println("Yazma hatası");
        }
        
    }
    
}
