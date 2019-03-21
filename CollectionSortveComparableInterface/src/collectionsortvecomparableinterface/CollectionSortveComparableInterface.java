/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsortvecomparableinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Kubra
 */
class Player implements Comparable<Player>{
   private int id;
   private String name;

    public Player() {
    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id:"+id+" Name:"+name;
    }

     //kendi classımızdaki objeleri karşılaştırmak için mutlaka override et.
    @Override
    public int compareTo(Player player) {
        if(this.id<player.id){
            return -1;

        }
        else if(this.id>player.id){
            return 1;
        }
        return 0;
    }
    
}

public class CollectionSortveComparableInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       /*String leri bu şekilde sıralayabiliriz Collections.sort ile
       //Fakat kendi yazdığımız class objesini bu şekilde sıralyamamıyoruz .
       Onun için kendi classımızı Comparable interfaceini implemente etmemiz gerekir.*/
        /*List<String> liste=new ArrayList<String>();
        liste.add("merve");
        liste.add("kubra");
        liste.add("apo");
        liste.add("emre");
       
                
        Collections.sort(liste);
        for(String d:liste){
            System.out.println(d);
        }*/
       List<Player> listeler=new ArrayList<Player>();
        listeler.add(new Player(1, "Kubra"));
        listeler.add(new Player(15,"Merve"));
        listeler.add(new Player(4,"Emre"));
        listeler.add(new Player(3,"Apo"));
        /*Player p1=new Player(1, "Kubra");
        Player p2=new Player(15,"Merve");
        System.out.println(p2.compareTo(p1));*/
        
        /*Collections.sort(listeler);//artuk hata vermez,id ye göre sıraladı.
        for(Player p:listeler){
            System.out.println(p);
        }*/
        Set<Player> setPlayer=new TreeSet<Player>();
        setPlayer.add(new Player(1, "Kubra"));
        setPlayer.add(new Player(15,"Merve"));
        setPlayer.add(new Player(4,"Emre"));
        setPlayer.add(new Player(3,"Apo"));
        
        for(Player p:setPlayer){
            System.out.println(p);
        }
       
    }
    
}
