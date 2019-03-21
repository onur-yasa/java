/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayvelinkedlistkarsilastirma;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kubra
 */
public class ArrayveLinkedListKarsilastirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        hesapla("LinkedList", linkedList);
        hesapla("ArrayList", arrayList);
                
    }
    public static void hesapla(String islem,List<Integer> list){
        long baslangic,bitis;
        baslangic=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            list.add(0,i);
        }
        bitis=System.currentTimeMillis();
        System.out.println(islem+" işlemi"+(bitis-baslangic)+" ms sürdü");
    }
    
}
