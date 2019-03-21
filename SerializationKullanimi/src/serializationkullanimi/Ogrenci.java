/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationkullanimi;

import java.io.Serializable;

/**
 *
 * @author Kubra
 */
public class Ogrenci implements Serializable{
    
    private String isim;
    private transient String bolum;
    private int yas;
    private static int deneme=0;

    public static int getDeneme() {
        return deneme;
    }

    public static void setDeneme(int deneme) {
        Ogrenci.deneme = deneme;
    }
//    private  static final long serialVersionUID=2000; 
    public Ogrenci() {
    }

    public Ogrenci(String isim, String bolum, int yas) {
        this.isim = isim;
        this.bolum = bolum;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Öğrencini Adı:"+isim+"\nÖğrencinin Bölümü:"+bolum+
                "\nOgrencinin yaşı:"+yas;
    }
    
}
