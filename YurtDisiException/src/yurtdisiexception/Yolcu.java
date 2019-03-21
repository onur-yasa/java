/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurtdisiexception;

import java.util.Scanner;


/**
 *
 * @author Kubra
 */
class VizeException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Vize Exception");
    }

}
class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi Exception");
    }

}
class HarcException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Harç Exception");
    }

}


public class Yolcu {

    private int harc;
    private boolean vize;
    private boolean siyasiyasak;
    
    
    public Yolcu() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Haarcı gir");
        harc=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Vize tamammı");
        String vizekontrol=scanner.nextLine();
        System.out.println("Siyasi yasak varmı");
         String siyasikontrol=scanner.nextLine();
         if(siyasikontrol.equals("evet")){
             siyasiyasak=true;
         }
         if(vizekontrol.equals("evet")){
             vize=true;
         }
    }
            
            

    public void YurtdisiHarcKontrol() throws HarcException {
        if(harc<15){
            throw  new HarcException();
            
        }
        else{
            System.out.println("Harc yatırılmıs");
            
        }
    }

 
    public void vizeKontrol() throws VizeException {
        if(vize){
            System.out.println("Vize tamam");
            
        }
        else{
            throw new VizeException();
            
        }
    }


    public void SiyasiYasakKontrol() throws SiyasiException {
        if(siyasiyasak){
            throw new SiyasiException();
            
        }
        else{
            System.out.println("Siyasi yasak yok");
            
        }
    }
    
}
