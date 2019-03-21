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
public class Bayblade {
    private String baybladeci;
    private int donusHizi;
    private int SaldiriGucu;

    public Bayblade(String baybladeci, int donusHizi, int SaldiriGucu) {
        this.baybladeci = baybladeci;
        this.donusHizi = donusHizi;
        this.SaldiriGucu = SaldiriGucu;
    }
    public void saldir(){
        System.out.println(baybladeci+" nin"+donusHizi+" hızı ile"+SaldiriGucu+" saldırı gücü ile hareket ediyor");
    }
    public void kutsalCanavar(){
        System.out.println("Kutsal canavarı yok");
    }
    public void bilgiler(){
        System.out.println("Baybladeci:"+baybladeci);
        System.out.println("Donus hızı:"+donusHizi);
        System.out.println("Saldırı gucu:"+SaldiriGucu);
                
    }
    /**
     * @return the baybladeci
     */
    public String getBaybladeci() {
        return baybladeci;
    }

    /**
     * @param baybladeci the baybladeci to set
     */
    public void setBaybladeci(String baybladeci) {
        this.baybladeci = baybladeci;
    }

    /**
     * @return the donusHizi
     */
    public int getDonusHizi() {
        return donusHizi;
    }

    /**
     * @param donusHizi the donusHizi to set
     */
    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    /**
     * @return the SaldiriGucu
     */
    public int getSaldiriGucu() {
        return SaldiriGucu;
    }

    /**
     * @param SaldiriGucu the SaldiriGucu to set
     */
    public void setSaldiriGucu(int SaldiriGucu) {
        this.SaldiriGucu = SaldiriGucu;
    }
    
}
