/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bayblade programına hosgeldinz");
        String islemler="1-Dragon,Draciel,Dranza,Drayga şeklinde giriniz"+
                        "2-Çıkış için q ya basın";
        
        while (true) {            
            System.out.println(islemler);
            System.out.println("İşlem giriniz");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan cıkılıypr");
                break;
            }
            BaybladeFabrikasi fabrika=new BaybladeFabrikasi();
            Bayblade bayblade=fabrika.baybladeUret(islem);
            if(bayblade==null){
                System.out.println("Geçerli bayblade giriniz");
            }
            else{
                bayblade.bilgiler();
                bayblade.kutsalCanavar();
                bayblade.saldir();
            }
                    
        }
    }
    
}
