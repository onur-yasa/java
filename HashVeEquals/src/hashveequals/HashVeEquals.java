/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashveequals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Kubra
 */
class Player{
    private int id;
    private String isim;

    public Player(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "ID :"+id+" isim:"+isim; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.isim);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        return true;
    }
    
    
}
public class HashVeEquals {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Set<Player> hashmap=new HashSet<Player>();
        Player p1=new Player(10, "Kubra");
        Player p2=new Player(20, "Merve");
        Player p3=new Player(40, "emre");
        Player p4=new Player(10,"Kubra");
        hashmap.add(p1);
        hashmap.add(p2);
        hashmap.add(p3);
        hashmap.add(p4);
        for (Player p:hashmap){
            System.out.println(p);
        }
    }
    
}
