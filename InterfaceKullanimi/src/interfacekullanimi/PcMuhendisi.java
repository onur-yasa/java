/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacekullanimi;

/**
 *
 * @author Kubra
 */
public class PcMuhendisi implements IMuhendis{

  private  boolean askerlik_durumu=false;
   private boolean adli_sicil=false;

    public PcMuhendisi(boolean askerlik_durumu,boolean adli_sicil) {
        this.adli_sicil=adli_sicil;
        this.askerlik_durumu=askerlik_durumu;
    }
   
    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik_durumu){
            System.out.println("Askerliği yaptı");
        }
        else{
            System.out.println("Askerliği yapmadı");
        }
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli sicil kaydı var");
        }
        else{
            System.out.println("Adli scil kaydı yok");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("İŞ tecrübeleri:");
        for(String a:array){
            System.out.println(a);
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Mezuniyet ortalaması:"+derece;
    }
    
}
