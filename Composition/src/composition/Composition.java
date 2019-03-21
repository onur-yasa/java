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
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Resolution resolution=new Resolution("55", "140");
                
        Monitor monitor=new Monitor("AsusX5k", "Asus", "8.4", resolution);
        Kasa kasa=new Kasa("kll", "asus", "Cam");
        Anakart anakart=new Anakart("Asas45", "Asus", "51", "Linux");
        Bilgisayar pc=new Bilgisayar(anakart, kasa, monitor);
        pc.getAnakart().isletimsisYukle("Ubuntu");
        pc.getKasa().Calistir();
        pc.getMonitor().monitorKapat();
    }
    
}
