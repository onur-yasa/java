/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationkullanimi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Kubra
 */
public class SerializationOkuma {
    public static void main(String[] args) {
        
        try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("denemeler.bin"))){
            /*Ogrenci ogr1=(Ogrenci)input.readObject();
            Ogrenci ogr2=(Ogrenci)input.readObject();
            System.out.println("Öğrenciler:");
            System.out.println(ogr1);
            System.out.println("**********************************");
            System.out.println(ogr2);*/
            Ogrenci[] ogrArr=(Ogrenci[])input.readObject();
            ArrayList<Ogrenci> ogrList=(ArrayList<Ogrenci>)input.readObject();
            for(Ogrenci o:ogrArr){
                System.out.println(o);
                System.out.println("****************");
                        
            }
            System.out.println("--------------------------------------");
            for(Ogrenci o: ogrList){
                System.out.println(o);
                System.out.println("****************");
            }
            System.out.println(Ogrenci.getDeneme());
                    
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadu");
        } catch (IOException ex) {
            System.out.println("IOException hatası");
        } catch (ClassNotFoundException ex) {
            System.out.println("Hata");
        }
    }
}
