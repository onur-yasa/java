/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kubra
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListKullanimi {
    public static void yazdir(LinkedList<String> yollar){
       /* for(String s:yollar){
            System.out.println(s);
        }*/
        ListIterator<String> iterator=yollar.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void siraliEkle(LinkedList<String> yollar,String yeni){
        ListIterator<String> iterator=yollar.listIterator();
        while(iterator.hasNext()){
            int karsilastir=iterator.next().compareTo(yeni);
            if(karsilastir==0){
                System.out.println("Bu deger zaten var");
                return;
            }
            else if(karsilastir<0){
                //yeni değer iterator.next ten daha buyuk
            }
            else if(karsilastir>0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }
    public static void main(String[] args) {
        LinkedList<String> yollar=new LinkedList<String>();
       /* yollar.add("Postane");
        yollar.add("Magaza");
        yollar.add("AVM");
        yollar.add("Ototpark");
         yazdir(yollar);
         System.out.println("******************************");
         yollar.add(2, "İŞ");
         yazdir(yollar);*/
        siraliEkle(yollar, "Postane");
        siraliEkle(yollar, "Magaza");
        siraliEkle(yollar, "Avm");
        siraliEkle(yollar, "İŞ");
        siraliEkle(yollar, "As");
        yazdir(yollar);
                
    }
}
