/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikfizikprob;

/**
 *
 * @author Kubra
 */
public class Problem {
    public static  class Matematik{
    public static void daireAlan(int yaricap){
        System.out.println("Daire alanı:"+yaricap*yaricap*Math.PI);
    }
    public static void ucgenCevresi(int a,int b,int c){
        System.out.println("Üçgen cevresi:"+(a+b+c));
    }
    
    }
    public static class Fizik{
        public static void VektorCarpim(Vec vektor1,Vec vektor2){
            double hesapla=vektor1.getI()*vektor2.getI()+vektor1.getJ()*vektor2.getJ()+vektor1.getK()*vektor2.getK();
            System.out.println(vektor1.getIsim()+" ile"+vektor2.getIsim()+" in iç çarpımları:"+hesapla);
        }
    }
}
