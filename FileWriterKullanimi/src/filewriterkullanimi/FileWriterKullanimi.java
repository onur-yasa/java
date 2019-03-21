/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewriterkullanimi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class FileWriterKullanimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileWriter fw=null;
        try {
            fw=new FileWriter("deneme.txt");
            fw.write("Kubra\n");
            fw.write("Akkoyun\n");
        } catch (IOException ex) {
            System.out.println("Hata");
        }
        finally{
            try {
                if(fw!=null){
                fw.close();
                }
            } catch (IOException ex) {
                System.out.println("Kapatma hatası");
            }
        }
        
    }
    
}
