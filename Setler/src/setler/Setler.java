/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setler;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kubra
 */
public class Setler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> set1=new HashSet<String>();
        Set<String> set2=new HashSet<String>();
        set1.add("Java");
        set1.add("C#");
        set1.add("Pyhton");
        
        set2.add("C");
        set2.add("C++");
        set2.add("Android");
        set2.add("Kotlin");
        set2.add("React");
        set2.add("Java");
        
        Set<String> fark=new HashSet<String>(set2);
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);
        System.out.println("***********************");
        Set<String> kesisim=new HashSet<String>(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);
        
                
    }
    
    
}
