/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractornegi;

/**
 *
 * @author Kubra
 */
public class Kare  extends Sekil{

    private int uzunluk;
            
    public Kare(String isim,int uzunluk) {
        super(isim);
        this.uzunluk=uzunluk;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" in alanı:"+uzunluk*uzunluk);
    }
    
}
