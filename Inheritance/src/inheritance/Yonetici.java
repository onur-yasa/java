/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Kübra
 */
public class Yonetici extends Calisan {
    private int sorumluSayisi;
    public Yonetici(String isim,int maas,String departman,int sorumluSayisi){
        super(isim, maas, departman);
        this.sorumluSayisi=sorumluSayisi;
    }
   public void bilgileriGoster(){
       /*System.out.println("İsim:"+getIsim());
       System.out.println("Maas:"+getMaas());
       System.out.println("Departman:"+getDepartman());*/
       //yukardaki kullanımda dogrudur super kullanımı da dogrudur
       super.bilgileriGoster();
       System.out.println("Sorumlu sayi:"+sorumluSayisi);
               
   }
   public void zamYap(int zam){
       System.out.println(getIsim()+" "+zam+" zam yapıldı");
   }
    
}
