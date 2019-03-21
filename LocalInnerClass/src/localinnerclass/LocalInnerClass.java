/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localinnerclass;

/**
 *
 * @author Kubra
 */
public class LocalInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class Alan{//Local Inner class public ve static kelimleri kullanılmaz
            public void daireAlan(int yaricap){
                System.out.println(yaricap*yaricap*Math.PI);
            }
        }
        Alan daire=new Alan();
        daire.daireAlan(3);
    }
    
}
