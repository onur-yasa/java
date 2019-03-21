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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Kubra
 */
public class NewClass {
    public static  void main(String[] args){
        LinkedHashMap<String,String> degerHashMap=new LinkedHashMap<>();
          List<String> hesaplanacak=new ArrayList();
       try(Scanner scanner=new Scanner(new FileReader("input.txt"));
                FileWriter writer=new FileWriter("output.txt")){
            while(scanner.hasNextLine()){
                String shopline=scanner.nextLine();
                if(shopline.trim().startsWith("what")){
                 hesaplanacak.add(shopline.substring(21,shopline.length()-1));
                    
                    //System.out.println(hesaplanacak);
                }else{
                  String[] shoplist=shopline.split("is");
                  degerHashMap.put(shoplist[0], shoplist[1]);
                }
                //writer.write(sonuc+"\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Hata oluştu");
        } catch (IOException ex) {
            System.out.println("Yazma hatası");
        }
      
        //System.out.println(search(hesaplanacak, degerHashMap));
        for(Map.Entry<String, String> entry : degerHashMap.entrySet()){
            //System.out.println(entry.getKey()+" "+entry.getValue());
           //System.out.println(search(hesaplanacak, degerHashMap));
        }
        
       
        
        
    
    }
    public static  boolean search(List<String> arama,LinkedHashMap<String,String> degerlerHashMap){
        int matches=0;
        for(int i=0;i<arama.size();i++){
             for(Map.Entry<String, String> entry : degerlerHashMap.entrySet()){
                   if(!arama.get(i).contains(entry.getKey()))
                {
                 matches=0;
                }   
                 else
                     matches++;
             }
             System.out.println(matches);
               if(matches!=0)
        
               return false;
        }
        

           return true;
                
        
    }
      /*String deneme="Apple is L";
      String[] splitdeneme=deneme.split("is");
      System.out.println(splitdeneme[1]);
        for (int i = 0; i < splitdeneme.length; i++) {
            System.out.println(splitdeneme[i]);
        }
      */
    public static void hesaplama(LinkedHashMap<String,String> degerHashMap){
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
     
    
    
    }
              
  public static String RomanNumerals(int number) {
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
    String res = "";
    for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
      int matches = number/entry.getValue();
      res += repeat(entry.getKey(), matches);
      number = number % entry.getValue();
    }
    return res;
  }
  public static String repeat(String s, int n) {
    if(s == null) {
        return null;
    }
    final StringBuilder sb = new StringBuilder();
    for(int i = 0; i < n; i++) {
        sb.append(s);
    }
    return sb.toString();
  }
      
    }
    
    
//}
