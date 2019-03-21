/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ygslysbirinci;

import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class YgsLysBirinci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ygs lys birinci hesaplama programı");
        String islemler="1-Eşit agırlık birincileri:"+
                        "2-Sayısal birincileri:";
        while (true) {            
            System.out.println("Çıkış için q ya basın");
            String cevap=scanner.nextLine();
            if(cevap.equals("q")){
                System.out.println("Programdan cıkılıyor");
                break;
            }
            System.out.println("1.Öğrenci ismi giriniz");
            String isim=scanner.nextLine();
            System.out.println("Netleri giriniz:(Fizik,MAtematik,Edebiyat,Kimya)");
            int fizik=scanner.nextInt();
            int kimya=scanner.nextInt();
            int mat=scanner.nextInt();
            int edb=scanner.nextInt();
            scanner.nextLine();
            System.out.println("*********************");
             System.out.println("2.Öğrenci ismi giriniz");
            String isim2=scanner.nextLine();
            System.out.println("Netleri giriniz:(Fizik,MAtematik,Edebiyat,Kimya)");
            int fizik2=scanner.nextInt();
            int kimya2=scanner.nextInt();
            int mat2=scanner.nextInt();
            int edb2=scanner.nextInt();
            scanner.nextLine();
            System.out.println("*********************");
             System.out.println("3.Öğrenci ismi giriniz");
            String isim3=scanner.nextLine();
            System.out.println("Netleri giriniz:(Fizik,MAtematik,Edebiyat,Kimya)");
            int fizik3=scanner.nextInt();
            int kimya3=scanner.nextInt();
            int mat3=scanner.nextInt();
            int edb3=scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Hangi işlem seciniz");
            System.out.println(islemler);
            String islemlegir=scanner.nextLine();
            if(islemlegir.equals("1")){
                EsitAgirlik e1=new EsitAgirlik(fizik, mat, edb, kimya,isim);
                EsitAgirlik e2=new EsitAgirlik(fizik2, mat2, edb2, kimya2,isim2);
                EsitAgirlik e3=new EsitAgirlik(fizik3, mat3, edb3, kimya3,isim3);
                System.out.println("Birinci:"+birinci(e1, e2, e3).getIsim()+" Puanı:"+birinci(e1, e2, e3).hesapla());
                
            }
            else if(islemlegir.equals("2")){
                SAyisal s1=new SAyisal(fizik, mat, edb, kimya, isim);
                SAyisal s2=new SAyisal(fizik2, mat2, edb2, kimya2, isim2);
                SAyisal s3=new SAyisal(fizik3, mat3, edb3, kimya3, isim3);
                System.out.println("Birinci:"+birinci(s1, s2, s3).getIsim()+" Puanı:"+birinci(s1, s2, s3).hesapla());
            }
            else{
                System.out.println("Yanlıs secim");
            }
            
        }
        
        
    }
    public static <E extends Aday> E birinci(E e1,E e2,E e3){
        if(e1.hesapla()>e2.hesapla() && e1.hesapla()>e3.hesapla()){
            return e1;
        }
        else if(e2.hesapla()>e3.hesapla() && e2.hesapla()>e1.hesapla()){
            return e2;
        }
        else if(e3.hesapla()>e2.hesapla() && e3.hesapla()>e1.hesapla()){
            return e3;
        }
        else{
            return e1;
        }
    }
    
}
