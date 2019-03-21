/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikfizikprob;

import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class MatematikFizikProb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        String islemler="0-Çıkış için q ya bas\n"+
                        "1-Dairenin alanı hesapla\n"+
                        "2-Üçgen çevresi hesapla\n"+
                        "3-Vektorlerin iç çarpımı\n";
        while (true) {            
            System.out.println("İşlem seçiniz");
            System.out.println(islemler);   
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan cıkılıyor");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Yarıcap giriniz");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Daire alanı hesaplnaıyot");
                Problem.Matematik.daireAlan(yaricap);
            }
            else if(islem.equals("2")){
                System.out.println("İlk kenari gir");
                int a=scanner.nextInt();
                System.out.println("İknci kenarı gir");
                int b=scanner.nextInt();
                System.out.println("Üçuncu kenarı gir:");
                int c=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Üçgen cevresi hesaplanıyor");
                Problem.Matematik.ucgenCevresi(a, b, c);
            }
            else if(islem.equals("3")){
                Vec vektor1=new Vec("vektor1");
                Vec vektor2=new Vec("Vektor2");
                System.out.println("Vektor carpımları hesaplnaıypr");
                Problem.Fizik.VektorCarpim(vektor1, vektor2);
            }
            else{
                System.out.println("Yanlıs secim");
            }
        }
    }
    
}
