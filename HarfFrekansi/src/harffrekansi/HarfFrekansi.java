/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harffrekansi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Kubra
 */
public class HarfFrekansi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String kelime=scanner.nextLine();
        Map<Character,Integer> frekans=new TreeMap<Character,Integer>();
        for(int i=0;i<kelime.length();i++){
            char c=kelime.charAt(i);
            if(frekans.containsKey(c)){
                frekans.replace(c, frekans.get(c)+1);
            }
            else{
                frekans.put(c, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry:frekans.entrySet()){
            System.out.println(entry.getKey()+" değeri "+entry.getValue()+" e kadar geçcti");
        }
    }
    
}
