/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaptreemaplinkedmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Kubra
 */
public class HashMapTreeMapLinkedMAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer,String> hashmap=new HashMap<Integer,String>();
        Map<Integer,String> treeMap=new TreeMap<Integer,String>();
        Map<Integer,String> linkedMap=new LinkedHashMap<Integer,String>();
        
        
        ekle(hashmap);
        System.out.println("*****************");
        ekle(linkedMap);
        System.out.println("****************");
        ekle(treeMap);
        
    }
    public static void ekle(Map<Integer,String> map){
        map.put(10, "Kubra");
        map.put(50, "Emre");
        map.put(40, "Merve");
        map.put(25, "Apo");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Anahtar:"+key+" Değer"+value);
            
        }
    }
}
