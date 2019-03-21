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
public class ATM {
    public void calis(Hesap hesap){
        Login login=new Login();
        int giris_hakki=3;
        
        System.out.println("atm projesine hoşgeldin.Kullanıcı giriş Ekranı"); 
        while (true) {            
            if(login.login(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else{
                System.out.println("Giriş başarısız");
                giris_hakki--;
                System.out.println(giris_hakki+" hakkınız kaldı");
            }
            if(giris_hakki==0){
                System.out.println("Giriş hakkınız bitti..");
                return;
            }
        }
        System.out.println("Atm ekranı");
        System.out.println("*****************************");
        String islemler="1-Bakiye öğrenme\n"+
                        "2-Para yatırma\n"+
                        "3-Para Çekme\n"+
                        "4-Çıkış için q";
        System.out.println(islemler);
        System.out.println("******************************");
        
        while (true) {            
            Scanner scanner =new Scanner(System.in);
            String islem=scanner.nextLine();
            if(islem.equals("1"))
            {
                System.out.println("Bakiyeniz:"+hesap.getBakiye());
            }
            else if(islem.equals("2"))
            {
                System.out.println("yatıralacak miktarı giriniz");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekilecek miktar giriniz");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else if(islem.equals("q")){
                System.out.println("Çıkıyor...");
                break;
            }
            else
            {
                System.out.println("Yanlıs secim");
            }
        }
        
        
    }
}
