/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikkullanim;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Kubra
 */
public class Grafik extends JPanel {

    public Grafik() {
        setBackground(Color.BLACK);
    }
    

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.blue);
        g.drawRect(100, 10, 30, 30);
        g.setColor(Color.RED);
        g.fillRect(100, 50, 42, 40);
        g.setColor(Color.BLUE);
        g.drawOval(100, 150, 50, 50);
        g.fillOval(300, 300, 50, 50);
        g.setColor(Color.YELLOW);
        g.drawLine(300, 500, 400, 600);
        
    }
    
}
