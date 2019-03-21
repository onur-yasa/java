/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendiexceptionclassimiz;

import java.io.IOException;

/**
 *
 * @author Kubra
 */
public class InvalidAgeException extends IOException{//ArithmeticException{
    
    public InvalidAgeException(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Invalid Age Exception");
    }
    
}
