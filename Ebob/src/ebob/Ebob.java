/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebob;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class Ebob {

    /**
     * @param args the command line arguments
     */
    public static int EbobBulma(int a,int b){
        int ebob=1;
        for(int i=1;i<=a && i<=b;i++){
            if((a%i==0) &&(b%i==0))
            {
                ebob=i;
                
            }
        }
        return ebob;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayi giriniz");
        int sayi1=scanner.nextInt();
        System.out.println("2.sayi giriniz");
        int sayi2=scanner.nextInt();
        
        System.out.println("Ebobları:"+EbobBulma(sayi1, sayi2));
    }
    
}
