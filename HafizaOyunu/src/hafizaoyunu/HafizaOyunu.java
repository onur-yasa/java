/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafizaoyunu;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Kübra
 */

public class HafizaOyunu {
      private static Kart[][] kartlar=new Kart[4][4];
    public static void KayittanAl(){
        File file=new File("oyun.bin");
        Scanner scanner=new Scanner(System.in);
        if(file.exists()){
            System.out.println("Kaydedilmiş oyununuz var.Devam etmek iset misiniz?(yes/no)");
            if(scanner.nextLine().equals("yes")){
               kartlar =OyunKayit.oyunGetir();
               return;
            }
        }
         kartlar[0][0]=new Kart('E');
        kartlar[0][1]=new Kart('A');
        kartlar[0][2]=new Kart('B');
        kartlar[0][3]=new Kart('F');
        kartlar[1][0]=new Kart('G');
        kartlar[1][1]=new Kart('A');
        kartlar[1][2]=new Kart('D');
        kartlar[1][3]=new Kart('F');
        kartlar[2][0]=new Kart('H');
        kartlar[2][1]=new Kart('C');
        kartlar[2][2]=new Kart('D');
        kartlar[2][3]=new Kart('H');
        kartlar[3][0]=new Kart('E');
        kartlar[3][1]=new Kart('G');
        kartlar[3][2]=new Kart('B');
        kartlar[3][3]=new Kart('C');
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner=new Scanner(System.in);
       KayittanAl();
        while (OyunBittimi()==false) {            
          OyunTahtasi();    
          
            System.out.println("Oyundan çıkmak mı istiyorsunuz(yes,no)");
            String cevap=scanner.nextLine();
            if(cevap.equals("yes")){
                System.out.println("Oyunu kaydetmek istiyormsunuz(yes,no)");
                String isKayit=scanner.nextLine();
                if(isKayit.equals("yes")){
                    OyunKayit.OyunKaydet(kartlar);
                    break;
                }
                 else{
                System.out.println("oyun kaydedilmedi.");
            }
            }
           
          tahmin();
          
        }
          
       
         
    }
    public static boolean OyunBittimi(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin()==false)
                    return false;
            }
        }
        return true;
    }
    public static void tahmin(){
        Scanner scanner=new Scanner(System.in);
        int i1,i2,j1,j2;
        System.out.println("İlk değeri girin(i ve j olarak aralıklı gir)");
        i1=scanner.nextInt();
        j1=scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        OyunTahtasi();
        System.out.println("İkinci tahmini gir");
        i2=scanner.nextInt();
        j2=scanner.nextInt();
              
        if(kartlar[i1][j1].getDeger()==kartlar[i2][j2].getDeger()){
            System.out.println("Dogru tahmin");
            kartlar[i2][j2].setTahmin(true);
        }
        else
        {
            System.out.println("Yanlıs tahmin");
            kartlar[i1][j1].setTahmin(false);
        }
    }
    public static void OyunTahtasi(){
        for(int i=0;i<4;i++){
            System.out.println("_______________________");
            for(int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" |"+kartlar[i][j].getDeger()+" |");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("________________________");
    }
    
}
