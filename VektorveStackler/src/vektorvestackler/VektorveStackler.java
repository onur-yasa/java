/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektorvestackler;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author Kubra
 */
public class VektorveStackler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<String> vektor=new Vector<String>();
        vektor.add("Kubra");
        vektor.add("Merve");
        vektor.add("Apo");
        vektor.add("Emre");
        //1. for ile gezinme
        /*for(String vektorler:vektor){
            System.out.println(vektorler);
        }
        */
        //2. listiterator ile gezinme
      /*  ListIterator<String> iter=vektor.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            
        }*/
      //3 enumeration ile gezinme
     /*   Enumeration<String> enumeration=vektor.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
            
        }*/
     
     //Stackler;
     Stack<String> stack=new Stack<String>();
     //stack.add("kubra");//bu sekilde de ekleme yapılır.
     stack.push("Kubra");
     stack.push("Merve");
     stack.push("Apo");
     stack.push("Emre");
     
     Enumeration<String> enumeration=stack.elements();
    /* while(enumeration.hasMoreElements()){
         System.out.println(enumeration.nextElement());
     }*/
        System.out.println("****************");
        System.out.println(stack.pop());
        System.out.println("*************");
       while(enumeration.hasMoreElements()){
         System.out.println(enumeration.nextElement());
     }
       while(!stack.empty()){
           System.out.println("Eleman çıkarılıyor:"+stack.pop());
       }
    }
     
    
}
