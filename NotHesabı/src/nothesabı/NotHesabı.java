/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nothesabı;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class NotHesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vize1.notu giriniz");
        int vize=scanner.nextInt();
        System.out.println("Vize 2. notu giriniz");
        int vize2=scanner.nextInt();
        System.out.println("Final notunu giriniz");
        int finalNot=scanner.nextInt();
        double toplam=(vize*3/10.0)+(vize2*3/10.0)+(finalNot*4/10.0);
        if(toplam>=90)
            System.out.println("Notunuz:AA");
        else if(toplam>=85)
            System.out.println("Notunuz:BA");
        else if(toplam>=80)
            System.out.println("Notunuz:BB");
        else if(toplam>=75)
            System.out.println("Notunuz:CB");
        else if(toplam>=70)
            System.out.println("Notunuz:CC");
        else if(toplam>=65)
            System.out.println("Notunuz:DC");
        else if(toplam>=60)
            System.out.println("Notunuz:DD");
        else
            System.out.println("Notunuz:FF");
                    
    }
    
}
