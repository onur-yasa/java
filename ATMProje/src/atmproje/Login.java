/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmproje;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class Login {
    public  boolean login(Hesap hesap){
        Scanner scanner=new Scanner(System.in);
        String kullanici_adi,sifre;
        System.out.println("Kullanici adi gir:");
        kullanici_adi=scanner.nextLine();
        System.out.println("Parola gir:");
        sifre=scanner.nextLine();
        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(sifre)){
            return true;
        }
        else
            return false;
                
    }
}
