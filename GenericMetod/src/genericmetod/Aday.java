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
abstract class Aday {
    private int fizik;
    private int matematik;
    private int edebiyat;
    private int kimya;

    public Aday(int fizik, int matematik, int edebiyat, int kimya) {
        this.fizik = fizik;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.kimya = kimya;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getKimya() {
        return kimya;
    }

    public void setKimya(int kimya) {
        this.kimya = kimya;
    }
    abstract int hesapla();
}
