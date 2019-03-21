/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Kübra
 */
public class Dragon extends Bayblade{
       private String kutsalCanavar;
       private String gizliGuc;

    public Dragon(String baybladeci, int donusHizi, int SaldiriGucu,String kutsalCanavar,String gizliGuc) {
        super(baybladeci, donusHizi, SaldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
        this.gizliGuc=gizliGuc;
    }

    @Override
    public void bilgiler() {
        super.bilgiler(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal Canvar:"+kutsalCanavar);
        System.out.println("Gizli guc:"+gizliGuc);
    }

    @Override
    public void kutsalCanavar() {
        System.out.println(getBaybladeci()+"nin kutsal canavarı:"+kutsalCanavar);
    }
       
}
