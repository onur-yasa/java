/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderbufferreaderkullanimi;

import java.io.BufferedWriter;
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
public class FileReaderBufferReaderKullanimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //okuma
        /*try(Scanner scanner=new Scanner(new FileReader("deneme.txt"))){
           
            while(scanner.hasNextLine()){
            String ogrenci_bilgileri=scanner.nextLine();
            String[] ogrenci=ogrenci_bilgileri.split(",");
            
                if(ogrenci[1].equals("Gıda Mühendisliği")){
                System.out.println("Öğrenci bilgileri:"+ogrenci_bilgileri);    
                }
                
            }
            
           
        } catch (FileNotFoundException ex) {
            System.out.println("hata");
        } catch (IOException ex) {
            System.out.println("Okuma hatası");
        }*/
          try(BufferedWriter writer=new BufferedWriter(new FileWriter("deneme.txt",true))){
          writer.write("Meryem Güler,Makine Mühendisliği\n");
              
          } catch (IOException ex) {
              System.out.println("Hata");
        }
          
    }
}
    
    
   
   
