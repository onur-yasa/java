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
public class Drayga extends Bayblade{
      private String kutsalCanavar;

    public Drayga(String baybladeci, int donusHizi, int SaldiriGucu,String kutsalCanavar) {
        super(baybladeci, donusHizi, SaldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
                
    }

    @Override
    public void bilgiler() {
        super.bilgiler(); 
        System.out.println("Kutsal canavar:"+kutsalCanavar);
    }

    @Override
    public void kutsalCanavar() {
        System.out.println(getBaybladeci()+"kutsal canvarı:"+kutsalCanavar);
    }
    
}
