/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikfizikprob;

import java.util.Scanner;

/**
 *
 * @author Kubra
 */
public class Vec {
    private String isim;
    private int i,j,k;
    Scanner scanner=new Scanner(System.in);
    public Vec(String isim){
        this.isim=isim;
        System.out.println("İ degerini gir:");
        this.i=scanner.nextInt();
        System.out.println("j degerini gir");
        this.j=scanner.nextInt();
        System.out.println("k degerini gir");
        this.k=scanner.nextInt();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

   
    
}
