/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractornegi;

import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class AbstractOrnegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner=new Scanner(System.in);
      String islemler="0-Çıkış için q ya basın\n"+
                      "1-Karenın alanın hesaplama\n"+
                      "2-Dairenin alanının hesaplama\n"+
                      "3-Üçgenin alanını hesaplama\n";
      Sekil sekil=null;
      
      while(true){
          System.out.println("İşlem seçiniz");
          System.out.println(islemler);    
          String islem=scanner.nextLine();
          if(islem.equals("q")){
              System.out.println("Programdan cıkılıyor");
              break;
          }
          else if(islem.equals("1")){
              System.out.println("Karenin kenarını giriniz");
              int kare=scanner.nextInt();
              scanner.nextLine();
              System.out.println("Karenin alanı hesaplanıyor:");
              sekil=new Kare("Kare", kare);
              sekil.alanHesapla();
          }
          else if(islem.equals("2")){
              System.out.println("Daire yarıcap giriniz");
              int yaricap=scanner.nextInt();
              scanner.nextLine();
              System.out.println("Dairenin alanı hesaplanıyor");
              sekil=new Daire("Daire", yaricap);
              sekil.alanHesapla();
          }
          else if(islem.equals("3")){
              System.out.println("Kenar uzunlujkları gir");
              int a=scanner.nextInt();
              int b=scanner.nextInt();
              int c=scanner.nextInt();
              scanner.nextLine();
              System.out.println("Üçgenin alanı hesaplanıyor");
              sekil=new Ucgen("Ucgen", a, b, c);
              sekil.alanHesapla();
          }
          else{
              System.out.println("Yanlıs secim...");
          }
      }
    }
    
}
