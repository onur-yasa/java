/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trywithresources;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class TryWithResources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(FileWriter writer=new  FileWriter("deneme.txt")){
            Scanner scanner=new Scanner(System.in);
            
            while(true){
                System.out.println("Giriniz");
                String deger=scanner.nextLine();
                if(deger.equals("-1")){
                    System.out.println("Dosya kontrol et");
                    break;
                }
                writer.write(deger+"\n");
            }
        } catch (IOException ex) {
            System.out.println("Hata oluştu");
        }
    }
    
}
