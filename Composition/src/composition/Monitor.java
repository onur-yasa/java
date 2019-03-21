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
public class Monitor {
   private String model;
   private String uretici;
   private String boyut;
   private Resolution resolution;
    public Monitor(String model, String uretici, String boyut, Resolution resolution) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
 public void monitorKapat(){
     System.out.println("Monitor kapatılıor");
 }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the boyut
     */
    public String getBoyut() {
        return boyut;
    }

    /**
     * @param boyut the boyut to set
     */
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
   
   
}
