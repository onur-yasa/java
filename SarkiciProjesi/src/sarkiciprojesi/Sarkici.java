package sarkiciprojesi;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kubra
 */
public class Sarkici {
    ArrayList<String> arraylist=new ArrayList<String>();
    public void SarkiciEkle(String name){
        arraylist.add(name);
        System.out.println(name+" "+"isimli kişi eklendi");
    }
    public void SarkiciCikar(int id){
        String isim=arraylist.get(id);
        arraylist.remove(id);
        System.out.println(isim+" adlı sarkcıı silindi");
      
    }
    public void Bilgiler(){
        System.out.println("Sarkıcı bilgileri");
        System.out.println(arraylist.size()+" tane sarkıcı bulunmaktadır.");
        for(int i=0;i<arraylist.size();i++){
            System.out.println((i+1)+".şsrkıcı:"+arraylist.get(i));
        }
    }
    public void guncelle(String isim,int index){
      
            arraylist.set(index, isim);
            System.out.println("İsim "+isim+" olarak guncellendi.");
            
        
    }
    public void ara(String sarkici){
        int id=arraylist.indexOf(sarkici);
        if(id>=0){
            System.out.println("Bulundu");
            System.out.println("Sarkıcı ismi"+sarkici+" "+(id+1)+".pozisyonda");
                   
        }
        else{
            System.out.println("Sarkcıı bulunamadı");
        }
    }
}
