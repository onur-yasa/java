/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author Kübra
 */
public class Resolution {
    private String en;
    private String boy;

    public Resolution(String en, String boy) {
        this.en = en;
        this.boy = boy;
    }

    /**
     * @return the en
     */
    public String getEn() {
        return en;
    }

    /**
     * @param en the en to set
     */
    public void setEn(String en) {
        this.en = en;
    }

    /**
     * @return the boy
     */
    public String getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(String boy) {
        this.boy = boy;
    }
    
}
