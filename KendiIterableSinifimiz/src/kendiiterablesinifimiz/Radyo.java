/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendiiterablesinifimiz;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kubra
 */
public class Radyo implements Iterable<String>{
   
     private ArrayList<String> kanallar=new ArrayList<String>();
     
    public class RadyoIterator implements Iterator<String>{

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
            String deger=kanallar.get(index);
            index++;
            return deger;
        }
        
    }
    
   
    
    public Radyo(String[]kanal){
        for(String a:kanal){
            kanallar.add(a);
        }
    }

    @Override
    public Iterator<String> iterator() {
        //return kanallar.iterator();
        return new RadyoIterator();
    }
            
}
