/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class Atm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int bakiye=1000;
        String islemler="1.işlem:Bakiye Öğrenme\n"+
                        "2.işlem:Para Çekme\n"+
                        "3.işlem:Para Yatırma\n"+
                        "Çıkış:q";
        System.out.println("**********************");
        System.out.println("İşlemler");
        System.out.println(islemler);
        System.out.println("***********************");
        
        while(true){
            System.out.println("İşlem seçiniz");
            String deger=scanner.nextLine();    
            if(deger.equals("q"))
            {
                System.out.println("Programdan cıkılıyor");
                break;
            }
            else if(deger.equals("1"))
            {
                System.out.println("Bakiyeniz:"+bakiye);
            }
            else if(deger.equals("2"))
            {
                System.out.println("Cekilecek tutar giriniz");
                int tutar=scanner.nextInt();
                scanner.nextLine();//nextInt ten sonra nextLine cagrıldıgında ki hatayı kaldırmak için
                if(tutar>bakiye)
                    System.out.println("Bakiyeniz:"+bakiye+"Çekebilcek tutarı aştınız");
                else
                  bakiye-=tutar;
            }
            else if(deger.equals("3")){
                System.out.println("Yatırılacak para miktarı giriniz");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiye:"+bakiye);
            }
            else{
                System.out.println("Yanlış seçim");
            }
                
        }
    }
    
}
