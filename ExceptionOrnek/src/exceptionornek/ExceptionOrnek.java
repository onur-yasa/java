/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionornek;

/**
 *
 * @author Kubra
 */
public class ExceptionOrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //int a=20/4;
            int []a={1,2,3,4};
            System.out.println(a[5]);
                    
            
        }
        catch(ArithmeticException e){
            System.out.println("Hata oluştu");
            
        }
        finally{
            System.out.println("Finally blogu");
        }
        System.out.println("Selam");
    }
    
}
