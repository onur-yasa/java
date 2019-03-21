/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romennumbers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.omg.PortableServer.LifespanPolicy;

/**
 *
 * @author Kubra
 */
public class NewClass1 {
    public static void main(String[] args) {
      ReadFile();
    }
     public static void ReadFile(){
        
        LinkedHashMap<String,String> degerHashMap=new LinkedHashMap<>();
        List<String> hesaplanacak=new ArrayList();
        
       try(Scanner scanner=new Scanner(new FileReader("input.txt"));
           FileWriter writer=new FileWriter("output.txt")){
          while(scanner.hasNextLine()){
            String shopline=scanner.nextLine();
            if(shopline.trim().startsWith("what")){
                hesaplanacak.add(shopline.substring(21,shopline.length()-1));
             }else{
                String[] shoplist=shopline.split("is");
                degerHashMap.put(shoplist[0].trim(), shoplist[1].trim());
              }
             //writer.write(sonuc+"\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Exception");
        } catch (IOException ex) {
            System.out.println("IO Exception");
        }
        System.out.println("DEgerler:"+degerHashMap);
        System.out.println("Hesaplanacaklar:"+hesaplanacak);
        degerleriBul(degerHashMap);
        System.out.println("DEgerler:"+degerHashMap);
       /* List<String> hesapTest=new ArrayList<>();
        hesapTest.add("tomato carrot apple");
        hesapTest.add("apple carrot orange");
        hesapTest.add("apple strawberry orange");
        hesapTest.add("apple carrot apple");
        LinkedHashMap<String,String> degerHashMapTest=new LinkedHashMap<>();
        degerHashMapTest.put("apple", "1");
        degerHashMapTest.put("orange", "5");
        degerHashMapTest.put("carrot", "10");
        degerHashMapTest.put("tomato", "50");
        
        
        sonucHesap(hesapTest,degerHashMapTest);*/
       /*for(Map.Entry<String, String> entry : degerHashMap.entrySet()){
           if(entry.getValue().length()>5)
               degerHashMap.remove(entry);
       }*/
       degerDuzenle(degerHashMap);
    }
  
    public static void degerleriBul(LinkedHashMap<String,String> degerHashMap){
         
       LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
         
         roman_numerals.put("M", 1000);
         roman_numerals.put("CM", 900);
         roman_numerals.put("D", 500);
         roman_numerals.put("CD", 400);
         roman_numerals.put("C", 100);
         roman_numerals.put("XC", 90);
         roman_numerals.put("L", 50);
         roman_numerals.put("XL", 40);
         roman_numerals.put("X", 10);
         roman_numerals.put("IX", 9);
         roman_numerals.put("V", 5);
         roman_numerals.put("IV", 4);
         roman_numerals.put("I", 1);
      
         for(Map.Entry<String, String> entry : degerHashMap.entrySet()){
             for (Map.Entry<String, Integer> entryroman : roman_numerals.entrySet()) {
                 if(entry.getValue().contains(entryroman.getKey())){
                     entry.setValue(entryroman.getValue().toString());
                 }
                
             }
   
         } 
    }
   public static void degerDuzenle(LinkedHashMap<String,String> degerHashMap){
       int deger=0;
      for(Map.Entry<String, String> entry : degerHashMap.entrySet()){
          if(entry.getKey().split(" ").length>1){
              String[] parca=entry.getKey().split(" ");
               for(int i=0;i<parca.length;i++){
                if(degerHashMap.containsKey(parca[i])){
                  deger=degerHashMap
                }
              
                  
              }
              toplam+=Integer.valueOf(entry.getValue().trim());
               for(String key : degerHashMap.keySet()){
                   for(int i=0;i<parca.length;i++){
                       if(parca[i].contains(key)){
                         toplam-=Integer.parseInt(entry.getValue());
                       }else{
                          degerHashMap.put(parca[i],(String.valueOf(toplam)));
                       }
                   }
               }
                  
              }
          }
      }
   
   
    public static void sonucHesap(List<String> degerList,LinkedHashMap<String,String> hesapHashMap){
        int toplam=0;
        int eslesen=0;
        for(int i=0;i<degerList.size();i++){
            String[] ayri=degerList.get(i).split(" ");
            for (Map.Entry<String, String> entry : hesapHashMap.entrySet()) {
                for (int j = 0; j < ayri.length; j++) {
                    if(entry.getKey().contains(ayri[j])){
                      toplam+=Integer.valueOf(entry.getValue());
                      eslesen++;
                  }
               
                }
              
            }
              if(eslesen!=ayri.length){
                    toplam=0;
                     System.out.println("Invalıd input");
                }
          if(toplam!=0){
            System.out.println("toplam:"+toplam);
          }
            toplam=0;
            eslesen=0;
        }
        
    }
}
