/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticolmayaninner;

import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class Matematic {
    private double PI=Math.PI;
    Scanner scanner=new Scanner(System.in);
    public class Factorial{
        public void faktoriyel(){
            int fakt=1;
            System.out.println("Sayı giriniz");
      
            int sayi=scanner.nextInt();
            for(int i=2;i<=sayi;i++){
                fakt*=i;
            }
            System.out.println("Faktoriyel:"+fakt);
        }

    }
    public class Asal{
        public boolean Asalmi(){
            int sayi;
            int i=2;
            System.out.println("Sayı gir");
            sayi=scanner.nextInt();
            while(i<sayi){
                if(sayi%i==0){
                    return false;
                }
                i++;
            }
            return true;
           
        }
    }
    public class Alan{
        public class DaireAlan{
             public void daireAlan(int yaricap){
            System.out.println("Dairenin alanı:"+(yaricap*yaricap*PI));
        }
        }
       
    }
           
}
