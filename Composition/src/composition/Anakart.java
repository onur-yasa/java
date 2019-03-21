package composition;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kübra
 */
public class Anakart {
 
    private String model;
    private String uretici;
    private String yuva_Sayisi;
    private String isletim_sis;
    public Anakart(String model,String uretici,String yuva_sayisi,String isletim_sis){
        this.model=model;
        this.uretici=uretici;
        this.yuva_Sayisi=yuva_sayisi;
        this.isletim_sis=isletim_sis;
    }
    public void isletimsisYukle(String isletim_sis){
        this.isletim_sis=isletim_sis;
        System.out.println("İşletim sis:"+isletim_sis);
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
     * @return the yuva_Sayisi
     */
    public String getYuva_Sayisi() {
        return yuva_Sayisi;
    }

    /**
     * @param yuva_Sayisi the yuva_Sayisi to set
     */
    public void setYuva_Sayisi(String yuva_Sayisi) {
        this.yuva_Sayisi = yuva_Sayisi;
    }

    /**
     * @return the isletim_sis
     */
    public String getIsletim_sis() {
        return isletim_sis;
    }

    /**
     * @param isletim_sis the isletim_sis to set
     */
    public void setIsletim_sis(String isletim_sis) {
        this.isletim_sis = isletim_sis;
    }
    
}
