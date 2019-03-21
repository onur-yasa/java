/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhesapmakinesi;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
class CarpimException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Sayılar çok büyük...");
    }
    
}
public class ExceptionHesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hesap MAkinesi hosgeldiniz");
        System.out.println("İşlemler");
        String islemler="1-Toplama\n"+
                        "2-Çıkarma\n"+
                        "3-Çarpma\n"+
                        "4-Bolme\n";
        System.out.println(islemler);
        System.out.println("İşlem seçiniz");
        Scanner scanner=new Scanner(System.in);
        int secim=scanner.nextInt();
        scanner.nextLine();
        int birincisayi,ikincisayi;
        System.out.println("Sayıları gir");
        
        try {
            birincisayi=scanner.nextInt();
        ikincisayi=scanner.nextInt();
        scanner.nextLine();
             switch(secim){
            case 1:
                System.out.println("Toplam: "+(birincisayi+ikincisayi));
                break;
            case 2:
                System.out.println("Fark: "+(birincisayi-ikincisayi));
                break;
            case 3:
                if(birincisayi>10000 && ikincisayi>10000){
                    throw  new CarpimException();
                }
                System.out.println("Çarpım: "+(birincisayi*ikincisayi));
                break;
            case 4:
                System.out.println("Bölüm: "+(birincisayi/ikincisayi));
                break;
            default:
                System.out.println("Geçersiz seçim");
                break;
                        
        }
        } catch (InputMismatchException e) {
            System.out.println("Lutfen sayı formatında giriniz");
        }
        catch(ArithmeticException e){
            System.out.println("0 a bölünmez");
        } catch (CarpimException ex) {
            ex.printStackTrace();
        }
        
       
                
    }
    
}
