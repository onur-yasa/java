/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KumandaProjesi;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kubra
 */
public class Kumanda implements Iterable<String>{
    
   public ArrayList<String> kanallar=new ArrayList<String>();
   public class KumandaIterator implements Iterator<String>{

       int index;
        @Override
        public boolean hasNext() {
            if(index<kanallar.size()){
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            String kanal=kanallar.get(index);
            index++;
            return kanal;
        }
       
   }
   public void KanalEkle(String kanal){
       kanallar.add(kanal);
   }
   public void KanalSil(String kanal){
       if(kanallar.contains(kanal)){
           kanallar.remove(kanal);
       }
       else{
           System.out.println("Böyle bir kanal yok...");
       }
   }
   public int kanalSayisi(){
       return kanallar.size();
   }

    @Override
    public Iterator<String> iterator() {
        return new KumandaIterator();
    }
   
}
