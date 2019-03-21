/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;

/**
 *
 * @author Kubra
 */
public class GenericClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Character[] chardizi={'k','u','b','r','a'};
        Integer[] intdizi={1,2,3,4,5};
        String[] stringdizi={"merve","kubra","emre","abdullah"};
        GenericOlusum<Character> chard=new GenericOlusum<Character>();
        chard.yazdir(chardizi);
        System.out.println("*************");
        GenericOlusum<Integer> intd=new GenericOlusum<Integer>();
        intd.yazdir(intdizi);
        System.out.println("***************");
        GenericOlusum<String> strd=new GenericOlusum<String>();
        strd.yazdir(stringdizi);
    }
    
}
