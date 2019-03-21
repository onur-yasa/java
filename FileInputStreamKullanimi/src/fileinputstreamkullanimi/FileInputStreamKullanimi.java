/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputstreamkullanimi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class FileInputStreamKullanimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("deneme.txt");
            //System.out.println("Okunan karakterler:");
           // System.out.println((char)fis.read());
           // fis.skip(3);
           // System.out.println((char)fis.read());
           int deger;
           String s="";
           while((deger=fis.read())!=-1){
               s+=(char)deger;
               deger++;
           }
            System.out.println("Okunan deper"+s);
        } catch (FileNotFoundException ex) {
            System.out.println("dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Okuma hatası");
        }
        
        finally{
            try {
                if(fis!=null){
                fis.close();    
                }
                
            } catch (IOException ex) {
                System.out.println("Dosya kapatma hatası");
            }
         }
    }
    
}
