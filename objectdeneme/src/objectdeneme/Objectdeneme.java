/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectdeneme;

import java.time.Clock;

/**
 *
 * @author Kübra
 */
class insan{
    int boy;
}
class ogrenci extends insan implements Cloneable{
    Object Kopyala() throws   CloneNotSupportedException{
     return this.clone();
}
    boolean equals(ogrenci rhs){
        return this.boy == rhs.boy;
    }
    public String toString(){
        return "boy."+this.boy;
    }
            
}
        
public class Objectdeneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        insan ali=new insan();
        insan ahmet=ali;
        ali.boy=182;
        if(ali==ahmet)  
            System.out.println(" eşit");
        if(ali.equals(ahmet))
        {
            System.out.println("eşitlik3");
        }
        
        ogrenci ayse=new ogrenci();
        ogrenci fatma=(ogrenci)ayse.Kopyala();
        ayse.boy=180;
        fatma.boy=180;
                
        if(ayse==fatma)
            System.out.println(" eşitlik2");
        if(ayse.equals(fatma))
        {
            System.out.println(" eşitlik 4");
        }
        System.out.println(ayse);
        
        
        
        
    }
    
}
