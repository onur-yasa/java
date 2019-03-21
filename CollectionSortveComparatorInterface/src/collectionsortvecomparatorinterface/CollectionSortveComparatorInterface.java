/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsortvecomparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringBuyuktenKucuge implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
    
}
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
class BuyuktenKucugePlayer implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId()<o2.getId()){
            return 1;
        }
        else if(o1.getId()>o2.getId()){
            return -1;
        }
        return 0;
    }
    
}
class BuyuktenKucugeIsım implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return -o1.getName().compareTo(o2.getName());
    }
    
}
public class CollectionSortveComparatorInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> stringList=new ArrayList<String>();
        stringList.add("kubra");
        stringList.add("emre");
        stringList.add("apo");
        stringList.add("merve");
        //Collections.sort(stringList);//bu normalkullanımı kucukten buyuge default 
        Collections.sort(stringList,new StringBuyuktenKucuge());//comparator interfaceınden türetilen classıgecirir.
        for(String a:stringList){
            System.out.println(a);
        }
        List<Player> listeler=new ArrayList<Player>();
        listeler.add(new Player(1, "Kubra"));
        listeler.add(new Player(15,"Merve"));
        listeler.add(new Player(4,"Emre"));
        listeler.add(new Player(3,"Apo"));
       // Collections.sort(listeler,new BuyuktenKucugeIsım());
        //Anonim olarak;
        Collections.sort(listeler,new Comparator<Player>(){
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getName().compareTo(o2.getName());
            }
        
    });
         for(Player a:listeler){
            System.out.println(a);
        }
        
    }
    
}
