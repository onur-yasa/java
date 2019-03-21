/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilometretutari;

import java.util.Scanner;

/**
 *
 * @author Kübra
 */
public class KilometreTutari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.print("Aracın km de kac kurus yakıyor?(örn:0,32):");
        double kurus=scanner.nextDouble();
        System.out.print("Aracınız ile kac km gittniz?:");
        int km=scanner.nextInt();
        System.out.println("Toplam odenecek tutar:"+(kurus*km)+" TL dir");
        
        
    }
    
}
