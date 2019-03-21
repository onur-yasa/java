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
public class Bilgisayar {
    private Anakart anakart;
    private Kasa kasa;
    private Monitor monitor;

    public Bilgisayar(Anakart anakart, Kasa kasa, Monitor monitor) {
        this.anakart = anakart;
        this.kasa = kasa;
        this.monitor = monitor;
    }

    /**
     * @return the anakart
     */
    public Anakart getAnakart() {
        return anakart;
    }

    /**
     * @param anakart the anakart to set
     */
    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    /**
     * @return the kasa
     */
    public Kasa getKasa() {
        return kasa;
    }

    /**
     * @param kasa the kasa to set
     */
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    /**
     * @return the monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
