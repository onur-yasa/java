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
public class ATMProje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ATM atm=new ATM();
        Hesap hesap=new Hesap("kubra", "1234", 1500);
        atm.calis(hesap);
        System.out.println("Programdan cıkılıyor");
    }
    
}
