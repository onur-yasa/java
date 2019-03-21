/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikkullanim;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Kubra
 */
public class GrafikKullanim extends  JFrame{

    /**
     * @param args the command line arguments
     */
    
    public GrafikKullanim(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GrafikKullanim grafikKullanim=new GrafikKullanim("Grafik kullanımı");
        Grafik grafik=new Grafik();
        
        grafikKullanim.setVisible(true);
        grafikKullanim.setResizable(true);
        grafikKullanim.setSize(800,600);
        grafikKullanim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grafikKullanim.add(grafik);
    }
    
}
