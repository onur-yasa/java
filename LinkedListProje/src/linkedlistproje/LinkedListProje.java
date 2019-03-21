/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistproje;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class LinkedListProje {

    /**
     * @param args the command line arguments
     */
    public static void secimler(){
        System.out.println("0-Listeyi göster");
        System.out.println("1-İleri git");
        System.out.println("2-Geri git");
        System.out.println("3-Programdan cıkış");
    }
    public static void sehirTurla(LinkedList<String> sehir){
        ListIterator<String> iterator=sehir.listIterator();
        int secim;
        secimler();
        Scanner scanner=new Scanner(System.in);
        
        boolean dongu=false;
        boolean ileri=true;
        if(!iterator.hasNext()){
            System.out.println("Şehir turu yok");
        }
        while(!dongu){
            secim=scanner.nextInt();
        switch(secim){
            case 0:
                System.out.println("Seçim listesi:");
                secimler();
                break;
            case 1:
                /*if(!ileri){
                    if(iterator.hasNext()){
                        iterator.next();
                    }
                    ileri=true;
                }*/
                if(iterator.hasNext()){
                    System.out.println(iterator.next()+" şehrine gidiliyor");
                    
                }
                else
                {
                    System.out.println("Sehir turu sonlandı..");
                    ileri=true;
                    
                }
                break;
            case 2:
                /*if(ileri){
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    
                }
                    ileri=false;
                }*/
                if(iterator.hasPrevious()){
                    System.out.println(iterator.previous()+" şehre gidiliyor");
                }
                else{
                    System.out.println("Şehir turu basşı");
                }
                break;
            case 3:
                System.out.println("Programdan cıkılıyor");
                dongu=true;
                break;
        }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> sehir=new LinkedList<String>();
        sehir.add("Ankara");
        sehir.add("Eskişehir");
        sehir.add("Afyon");
        sehirTurla(sehir);
        
    }
    
}
