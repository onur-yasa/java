/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenus;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class Hipotenus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci Kenar");
        int birinci=scanner.nextInt();
        System.out.print("İkinci Kenar");
        int ikinci=scanner.nextInt();
        double hipotenus=Math.sqrt(birinci*birinci+ikinci*ikinci);
        System.out.println("Hipotenus:"+hipotenus);
                
        
        
    }
    
}
