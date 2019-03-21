/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapkullanimi;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kubra
 */
public class HashMapKullanimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
        hashmap.put(10, "Kubra");
        hashmap.put(20, "apo");
        hashmap.put(30, "Emre");
        hashmap.put(40,"merve");
        
        System.out.println(hashmap);
        hashmap.put(20, "ayse");
        System.out.println(hashmap);
        
        for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Anahtar:"+key+" Değer:"+value);
            
        }
    }
    
}
