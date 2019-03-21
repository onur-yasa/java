/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmproje;

/**
 *
 * @author Kübra
 */
public class Hesap {
    private String kullanici_adi;
    private String parola;
    private double bakiye;

    public Hesap(String kullanici_adi, String parola, double bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int tutar){
        bakiye+=tutar;
        System.out.println("Yeni bakiye= "+bakiye);
    }
    public void paraCek(int tutar){
        if(bakiye-tutar<0){
            System.out.println("Yeterli tutar bulunmmamaktadır ");
        }
        else{
            bakiye-=tutar;
            System.out.println("Yeni bakiyeniz:"+bakiye);
                   
        }
    }
}
