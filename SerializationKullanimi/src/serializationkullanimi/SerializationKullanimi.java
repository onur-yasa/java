/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationkullanimi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kubra
 */
public class SerializationKullanimi {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ///yazma
        
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("denemeler.bin"))){
            Ogrenci ogr1=new Ogrenci("Kübra Akkoyun","Bilgisayar Müh.",23);
            Ogrenci ogr2=new Ogrenci("Merve Akkoyun","Gıda Müh.",25);
            Ogrenci ogr3=new Ogrenci("Emre Akkoyun","Uçak Müh.",20);
            Ogrenci ogr4=new Ogrenci("Abdullah Akkoyun","Gemi veUçak Müh.",25);
            Ogrenci ogr5=new Ogrenci("Aysegul Akkoyun","Ev hanımı",42);
            Ogrenci ogr6=new Ogrenci("Can Akkoyun","Gıda İşletmecisi.",54);
            Ogrenci[] ogrArr={ogr1,ogr2,ogr3,ogr4,ogr5,ogr6};
            ArrayList<Ogrenci> ogrArrList=new ArrayList<Ogrenci>(Arrays.asList(ogrArr));
            
            os.writeObject(ogrArr);
            os.writeObject(ogrArrList);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("IOException hatası");
                    
        }
    }
    
}
