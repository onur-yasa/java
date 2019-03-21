/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueuekullanimi;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Kubra
 * 
 */
class Player implements Comparable<Player>{
    private int id;
    private  String name;

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
        return "İsim:"+name+" id:"+id;
    }

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
public class PriorityQueueKullanimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Queue<String> queue=new PriorityQueue<String>();
        queue.offer("Kubra");
        queue.offer("Emre");
        queue.offer("Apo");
        queue.offer("Merve");
        
        while(!queue.isEmpty()){
            System.out.println("Eleman çıkarılıyor"+queue.poll());
        }
        */
        //Kendi oluşturdugumuz claa için priority nasıl kullanacaz;
        //comparable interfaci implemente edecez.
        Queue<Player> player=new PriorityQueue<Player>();
        player.add(new Player(12, "Kubra"));
        player.add(new Player(16, "Merve"));
        player.add(new Player(4, "Emre"));
        player.add(new Player(14,"Apo"));
        
        while(!player.isEmpty()){
            System.out.println("Oyuncu cıkarılıyor..."+player.poll());
        }
    }
    
}
