/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticinnerclass;

/**
 *
 * @author Kubra
 */
public class Matematic {
    private static double PI=Math.PI;
    public static class Alan{
        public static void daireAlan(int yaricap){
            System.out.println(yaricap*yaricap*PI);
        }
    }
}
