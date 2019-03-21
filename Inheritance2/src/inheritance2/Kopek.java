/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author Kübra
 */
public class Kopek extends Hayvan{
    private int disSayisi;
    public Kopek(String isim,int hiz,int yas,int disSayisi){
        super(isim, hiz, yas);
        this.disSayisi=disSayisi;
    }
    public void hizlan(int hiz){
       // System.out.println("Kopek hızı"+hiz);
       super.hizlan(hiz);
    }
}
