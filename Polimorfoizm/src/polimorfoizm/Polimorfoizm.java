/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfoizm;

/**
 *
 * @author Kübra
 */
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konustu";
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
    
}
class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" konustu";
    }
}
class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

  @Override
    public String konus() {
        return this.getIsim()+"konustu";
    }
    
}
public class Polimorfoizm {

    /**
     * @param args the command line arguments
     */
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Hayvan hayvan1=new Kedi("Karabas");
        Hayvan hayvan2=new Kopek("Til");
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        konustur(new Kedi("Pamuk"));
        konustur(new Kopek("Can"));
    }
    
}
