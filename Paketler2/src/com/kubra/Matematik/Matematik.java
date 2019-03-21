/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kubra.Matematik;

/**
 *
 * @author Kubra
 */
public class Matematik implements IMatematik{

    @Override
    public void topla(int a, int b) {
        System.out.println("Toplam:"+(a+b));
    }

    @Override
    public void carp(int a, int b) {
        System.out.println("Capım:"+(a*b));
    }

    @Override
    public void bol(int a, int b) {
        System.out.println("Bolum:"+((double)a/b));
    }

    @Override
    public void cikar(int a, int b) {
        System.out.println("Fark:"+(a-b));
    }
    
}
