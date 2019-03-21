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
public class InterfaceKullanimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* IMuhendis pcm=new PcMuhendisi(true, false);
        pcm.askerlik_durumu_sorgula();
        pcm.adli_sicil_sorgula();
        System.out.println(pcm.mezuniyetOrtalamasi(3.45));
        String[] tecrube={"Vestel","Turkcell","Vektora"};
        pcm.isTecrubesi(tecrube); */
       MakineMuhendisi mkn=new MakineMuhendisi(true, true);
       mkn.adli_sicil_sorgula();
       mkn.askerlik_durumu_sorgula();
       mkn.calisma();
       String[] tecrube={};
       mkn.isTecrubesi(tecrube);
        System.out.println(mkn.mezuniyetOrtalamasi(3.41));
        String[] referans={"merve","emre","apo"};
        mkn.referans(referans);
              
    }
    
}
