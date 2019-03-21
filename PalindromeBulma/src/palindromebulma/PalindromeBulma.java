/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromebulma;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Kubra
 */
public class PalindromeBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.println("Cümle giriniz");
        String cumle=scanner.nextLine();
        Stack<Character> karakter=new Stack<Character>();
        for(int i=0;i<cumle.length()/2;i++){
            karakter.push(cumle.charAt(i));
        }
        if(isPalindrome(cumle, karakter)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Palindrome değil");
        }
       
    }
    public static boolean isPalindrome(String cumle,Stack<Character> karakter){
        for(int i=(cumle.length()/2)+1;i<cumle.length();i++){
            if(cumle.charAt(i)!=karakter.pop()){
                return false;
            }
        }
        return true;
    }
    
}
