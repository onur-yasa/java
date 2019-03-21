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
public class Hayvan {
    private String isim;
    private int hiz;
    private int yas;
    public Hayvan(String isim,int hiz,int yas){
        this.isim=isim;
        this.hiz=hiz;
        this.yas=yas;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the hiz
     */
    public int getHiz() {
        return hiz;
    }

    /**
     * @param hiz the hiz to set
     */
    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    /**
     * @return the yas
     */
    public int getYas() {
        return yas;
    }

    /**
     * @param yas the yas to set
     */
    public void setYas(int yas) {
        this.yas = yas;
    }
    public void yemekYe(){
        System.out.println("Yemek yiyor");
    }
    public void hizlan(int hiz){
        System.out.println("Hayvan hizi:"+hiz);
    }
}
