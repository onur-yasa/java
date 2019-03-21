/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoutputstreamkullanimi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class FileOutputStreamKullanimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("deneme.txt",true);
        } catch (FileNotFoundException ex) {
            System.out.println("file not found exception hatası");
        }
        try {
            String name="Kubra Akkoyun";
            byte[] name_arr=name.getBytes();
            fos.write(name_arr);
        } catch (IOException ex) {
            System.out.println("dosya yazılırken hata oluştu");
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatma hatası");
            }
         }
    }
    
}
