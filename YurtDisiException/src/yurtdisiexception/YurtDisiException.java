/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurtdisiexception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class YurtDisiException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws InterruptedException {
        // TODO code application logic here
          System.out.println("Havaalanına hosgeldiniz");
        while (true) {            
            Yolcu yolcu=new Yolcu();
            System.out.println("Harc bedeli kontrol ediliyor");
            Thread.sleep(3000);
              try {
                  yolcu.YurtdisiHarcKontrol();
              } catch (HarcException ex) {
                  ex.printStackTrace();
                  continue;
              }
            System.out.println("Siyasi kontrol yapılıyor");
            Thread.sleep(3000);
              try {
                  yolcu.SiyasiYasakKontrol();
              } catch (SiyasiException ex) {
                  ex.printStackTrace();
                  continue;
              }
            System.out.println("Vize kontrolu yapılıyor");
            Thread.sleep(3000);
              try {
                  yolcu.vizeKontrol();
              } catch (VizeException ex) {
                  ex.printStackTrace();
                  continue;
              }
            System.out.println("İşlem tamam");
            break;
        }
    }
    }
    

