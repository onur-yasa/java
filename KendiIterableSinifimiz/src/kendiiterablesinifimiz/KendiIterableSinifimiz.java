/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendiiterablesinifimiz;

import java.util.Iterator;

/**
 *
 * @author Kubra
 */
public class KendiIterableSinifimiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] kanallar={"A kanalı","B kanalı","C kanalı","D kanaalı"};
        Radyo radyo=new Radyo(kanallar);
       /* for(String kanal:radyo){
            System.out.println(kanal);
        }*/ 
       Iterator<String> iterator=radyo.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
    
}
