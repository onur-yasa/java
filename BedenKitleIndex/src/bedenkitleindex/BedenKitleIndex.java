/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bedenkitleindex;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class BedenKitleIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kilo gir:");
        int kilo=scanner.nextInt();
        System.out.print("Boy gir:");
        double boy=scanner.nextDouble();
        double bki=kilo/(boy*boy);
        System.out.println("Beden kitle indexi:"+bki);
        if(bki<18.5)
         System.out.println("Zayıf");
        else if(bki>=18.5 && bki<25)
            System.out.println("normal");
        else if(bki>=25 && bki<30)
            System.out.println("fazla kilolu");
        else
            System.out.println("obez");
        
        
    }
    
}
