/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Kübra
 */
public class BaybladeFabrikasi {
    public Bayblade baybladeUret(String tur){
        if(tur.equals("Dragon")){
            return new Dragon("kubra", 500, 500, "Ates topu", "Kılıc");
        }
        else if(tur.equals("Draciel")){
            return new Draciel("emre", 400, 400, "Ucan top");
        }
        else if(tur.equals("Dranza")){
            return new Dranza("Apb", 350, 450, "Baykus");
        }
        else if(tur.equals("Drayga")){
            return new Drayga("Mrv", 450, 400, "sinirli kus");
        }
        else {
            return null;
        }
    }
}
