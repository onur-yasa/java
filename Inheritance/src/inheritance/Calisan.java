/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Kübra
 */
public class Calisan {
    private String isim;
    private int maas;
    private String departman;
    public Calisan(String isim,int maas,String departman){
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;
    }
    public void bilgileriGoster(){
        System.out.println("İsim:"+isim+" Maas: "+maas+" Departman: "+departman);
    }
    public void departmanDegis(String dep){
        this.departman=dep;
        System.out.println("Yeni departmna:"+departman);
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
}
