/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlockolusumu;

/**
 *
 * @author Kubra
 */
public class Hesap {
    private int bakiye=1000;
    public void paraCek(int miktar){
        bakiye-=miktar;
    }
    public void paraYatir(int miktar){
        bakiye+=miktar;
    }
    public static void paraTransferi(Hesap hesap1,Hesap hesap2,int miktar){
        hesap1.paraCek(miktar);
        hesap2.paraYatir(miktar);
    }
    public int getBakiye(){
        return bakiye;
    }
    
    
}
