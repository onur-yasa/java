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
public class MakineMuhendisi implements IMuhendis,ICalis{

    private boolean askerlikdurumu=false;
    private boolean adlisicil=false;

    public MakineMuhendisi(boolean askerlikdurumu,boolean  adlisicil) {
        this.adlisicil=adlisicil;
        this.askerlikdurumu=askerlikdurumu;
    }
    
    @Override
    public void askerlik_durumu_sorgula() {
         if(askerlikdurumu){
            System.out.println("Askerliği yaptı");
        }
        else{
            System.out.println("Askerliği yapmadı");
        }
    }

    @Override
    public void adli_sicil_sorgula() {
         if(adlisicil){
            System.out.println("Adli sicil kaydı var");
        }
        else{
            System.out.println("Adli scil kaydı yok");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        if(array.length==0){
            System.out.println("İş tecrubesi yok");
        }
        else{
            System.out.println("İş tecubesleri:");
            for(String a:array){
                System.out.println(a);
            }
        }
        
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "MEzuniyet:"+derece;
    }
    public void referans(String[] referanslar){
        if(referanslar.length==0){
            System.out.println("Referans yok");
        }
        else{
            System.out.println("Referanslar:");
            for(String a:referanslar){
                System.out.println(a);
            }
        }
    }

    @Override
    public void calisma() {
        System.out.println("Makine muh.alısma");
    }
    
}
