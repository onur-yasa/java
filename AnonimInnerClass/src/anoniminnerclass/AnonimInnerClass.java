/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anoniminnerclass;

/**
 *
 * @author Kubra
 */
public class AnonimInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //interface kullanarak anonim inner class
        IOgrenci ogrenci=new IOgrenci() {
            @Override
            public void dersegir() {
                System.out.println("Derse gir");
            }

            @Override
            public void derscalis() {
                System.out.println("Ders caliş");
            }
        };
        ogrenci.derscalis();
        ogrenci.dersegir();
        Aogrenci ogrenci2=new Aogrenci("Kubra",23) {
            @Override
            void kayitYap() {
                System.out.println("Kayıt yap");
            }
        };
        ogrenci2.kayitYap();
        System.out.println(ogrenci2.getIsim());
        System.out.println(ogrenci2.getYas());
    }
    
    public interface IOgrenci{
        void dersegir();
        void derscalis();
    }
    public static abstract class Aogrenci{
        private String isim;
        private int yas;

        public Aogrenci(String isim, int yas) {
            this.isim = isim;
            this.yas = yas;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getYas() {
            return yas;
        }

        public void setYas(int yas) {
            this.yas = yas;
        }
        
     abstract void kayitYap();
    public void selamla(){
        System.out.println("Selam");
    }
        
    }
    
}
