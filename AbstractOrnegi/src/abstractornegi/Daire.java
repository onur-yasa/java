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
public class Daire extends Sekil{

    private double yaricap;
    public Daire(String isim,double yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" in alanı:"+Math.PI*yaricap*yaricap);
    }
    
}
