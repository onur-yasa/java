/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacekullanimi;

/**
 *
 * @author Kubra
 */
public interface IMuhendis {
    void askerlik_durumu_sorgula();
    void adli_sicil_sorgula();
    void isTecrubesi(String[] array);
    String mezuniyetOrtalamasi(double derece);
    
}
