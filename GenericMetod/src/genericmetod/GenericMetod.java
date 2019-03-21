/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmetod;

/**
 *
 * @author Kubra
 */
public class GenericMetod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SAyisal s1=new SAyisal(40, 30, 15, 30);
        SAyisal s2=new SAyisal(40, 35, 14, 24);
        EsitAgirlik e1=new EsitAgirlik(10, 25, 32, 5);
        EsitAgirlik e2=new EsitAgirlik(3, 40, 35, 3);
        System.out.println("Birinci :"+"puan:"+birinci(s1, s2).hesapla());
        System.out.println("Birinci :"+"puan:"+birinci(e1, e2).hesapla());
        
       
    }
     public static <E extends Aday> E birinci(E s1,E s2){
            if(s1.hesapla()>s2.hesapla()){
                return s1;
            }
            else{
                return s2;
            }
        }
    
}
