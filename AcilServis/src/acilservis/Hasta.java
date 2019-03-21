/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acilservis;

/**
 *
 * @author Kubra
 */
public class Hasta implements Comparable<Hasta>{
    private String name;
    private String hastalik;
    private int oncelik;
    public Hasta(String name,String hastalik){
        this.name=name;
        this.hastalik=hastalik;
        if(this.hastalik.equals("Apandisit")){
            oncelik=3;
        }
        else if(this.hastalik.equals("Yanık")){
            oncelik=2;
        }
        else{
            oncelik=1;   
        }
                
    }

    @Override
    public int compareTo(Hasta hasta) {
        if(this.oncelik>hasta.oncelik){
            return -1;
        }
        else if(this.oncelik<hasta.oncelik){
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHastalik() {
        return hastalik;
    }

    public void setHastalik(String hastalik) {
        this.hastalik = hastalik;
    }

    public int getOncelik() {
        return oncelik;
    }

    public void setOncelik(int oncelik) {
        this.oncelik = oncelik;
    }

    @Override
    public String toString() {
        return "Hasta adı:"+name+"\nHastalığı:"+hastalik;
    }
    
}
