/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendiexceptionclassimiz;

import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class KendiExceptionClassimiz {

    /**
     * @param args the command line arguments
     */
    public static void kontrol(int yas) throws InvalidAgeException{
        if(yas<18){
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("Welcome");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int yas=scanner.nextInt();
        try {
            kontrol(yas);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        
    }
    
}
