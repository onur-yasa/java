/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kubrakkyn.lock;

/**
 *
 * @author Kubra
 */
public class Main {
    public static void main(String[] args) {
        ListWorker listWorker=new ListWorker();
        /*long baslangic=System.currentTimeMillis();
        listWorker.degerAta();
        long bitis=System.currentTimeMillis();
        System.out.println("Gecen sure:"+(bitis-baslangic));*/
        listWorker.calistir();
    }
}
