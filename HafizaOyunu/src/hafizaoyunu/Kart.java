/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafizaoyunu;

import java.io.Serializable;

/**
 *
 * @author Kübra
 */
public class Kart implements Serializable{
    private char deger;
    private boolean tahmin=false;

    public Kart(char deger) {
        this.deger = deger;
    }

    /**
     * @return the deger
     */
    public char getDeger() {
        return deger;
    }

    /**
     * @param deger the deger to set
     */
    public void setDeger(char deger) {
        this.deger = deger;
    }

    /**
     * @return the tahmin
     */
    public boolean isTahmin() {
        return tahmin;
    }

    /**
     * @param tahmin the tahmin to set
     */
    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
       
}
