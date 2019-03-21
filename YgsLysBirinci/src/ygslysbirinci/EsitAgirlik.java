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
public class EsitAgirlik extends Aday{
    public EsitAgirlik(int fizik, int matematik, int edebiyat, int kimya,String isim) {
        super(fizik, matematik, edebiyat, kimya,isim);
    }

    @Override
    int hesapla() {
        return getFizik()*1+getEdebiyat()*5+getKimya()*1+getMatematik()*4;
    }
}
