/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static int[] arrayDondur(int sayi){
        int []dizi=new int[sayi];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<sayi;i++){
         dizi[i]=scanner.nextInt();
         }
        return  dizi;
    }
    public static void bastir(int []dizi){
        for(int i=0;i<dizi.length;i++){
            System.out.println("Dizinin "+(i+1)+". elemanı:"+dizi[i]);
        }
    }
    public static void arraySort(int [] dizi){
        //Arrays sınfını kullanıp sort işlemi yapılacak
        Arrays.sort(dizi);
        bastir(dizi);
    }
    public static void main(String[] args) {
        // TODO code application logic here
       // int [] dizi=arrayDondur(5);
        //bastir(dizi);
      //  arraySort(dizi);
        int [][] dizi2=new int[2][2];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                dizi2[i][j]=scanner.nextInt();
            }
        }
         for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(dizi2[i][j]+" ");
                
            }
             System.out.println("");
        }
       
    }
    
}
