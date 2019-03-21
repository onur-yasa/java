/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ygslysbirinci;

/**
 *
 * @author Kubra
 */
public class SAyisal extends Aday{
     public SAyisal(int fizik, int matematik, int edebiyat, int kimya,String isim) {
        super(fizik, matematik, edebiyat, kimya,isim);
    }

    @Override
    int hesapla() {
        return getEdebiyat()*1+getFizik()*5+getKimya()*5+getMatematik()*4;
    }
}
