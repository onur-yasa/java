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
public class Yazilimci  extends Calisan{
    private String diller;
    public Yazilimci(String diller, String isim, int maas, String departman) {
        super(isim, maas, departman);
        this.diller = diller;
    }
    public void format(String isletimSist){
        System.out.println(getIsim()+" "+isletimSist+" format atılıyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Diller:"+diller);
    }
    
    
}
