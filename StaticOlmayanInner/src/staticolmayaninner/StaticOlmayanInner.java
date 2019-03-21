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
public class StaticOlmayanInner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        Matematic.Factorial factorial=new Matematic().new Factorial();
        factorial.faktoriyel();
        System.out.println("Yarıcap giriniz");
        int yaricap=scanner.nextInt();
        Matematic.Alan.DaireAlan alan=new Matematic().new Alan().new DaireAlan();
        alan.daireAlan(yaricap);
        Matematic.Asal asal=new Matematic().new Asal();
        if(asal.Asalmi()){
            System.out.println("sayı asal");
        }
        else{
            System.out.println("Sayı asal degil");
        }
    }
    
}
