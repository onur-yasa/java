/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idman;

/**
 *
 * @author Kübra
 */
public class IdmanYap {
    private int squat_sayisi;
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;

    public IdmanYap(int squat_sayisi, int burpee_sayisi, int pushup_sayisi, int situp_sayisi) {
        this.squat_sayisi = squat_sayisi;
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }
    public void hareketYap(String hareket_türü,int hareket_sayisi){
        if(hareket_türü.equals("squad")){
            squadYap(hareket_sayisi);
        }
        else if(hareket_türü.equals("pushup")){
            pushupYap(hareket_sayisi);
        }
        else if(hareket_türü.equals("sitUp")){
            sitUpYap(hareket_sayisi);
        }
        else if(hareket_türü.equals("burpee")){
            burpeeYap(hareket_sayisi);
            
        }
        else{
            System.out.println("Idman bulunamadı");
          
        }
    }
    public void squadYap(int hareketSayisi){
        if(squat_sayisi==0){
            System.out.println("Ypacak squat kalmadı");
        }
        if(squat_sayisi-hareketSayisi<0){
            System.out.println("Hedeflenen squat sayısı geçildi.Tebrikler..");
            squat_sayisi=0;
            System.out.println("Kalan squat:"+squat_sayisi);
        }
        else{
            squat_sayisi-=hareketSayisi;
            System.out.println("Kalan squat:"+squat_sayisi);
        }
    }
     public void pushupYap(int hareketSayisi){
        if(pushup_sayisi==0){
            System.out.println("Ypacak pushup kalmadı");
        }
        if(pushup_sayisi-hareketSayisi<0){
            System.out.println("Hedeflenen pushupYap sayısı geçildi.Tebrikler..");
            pushup_sayisi=0;
            System.out.println("Kalan pushupYap:"+pushup_sayisi);
        }
        else{
            pushup_sayisi-=hareketSayisi;
            System.out.println("Kalan pushupYap:"+pushup_sayisi);
        }
    }
      public void sitUpYap(int hareketSayisi){
        if(situp_sayisi==0){
            System.out.println("Ypacak sitUpYap kalmadı");
        }
        if(situp_sayisi-hareketSayisi<0){
            System.out.println("Hedeflenen sitUpYap sayısı geçildi.Tebrikler..");
            situp_sayisi=0;
            System.out.println("Kalan sitUpYap:"+situp_sayisi);
        }
        else{
            situp_sayisi-=hareketSayisi;
            System.out.println("Kalan sitUpYap:"+situp_sayisi);
        }
    }
       public void burpeeYap(int hareketSayisi){
        if(burpee_sayisi==0){
            System.out.println("Ypacak burpee kalmadı");
        }
        if(burpee_sayisi-hareketSayisi<0){
            System.out.println("Hedeflenen burpee sayısı geçildi.Tebrikler..");
            burpee_sayisi=0;
            System.out.println("Kalan burpee:"+burpee_sayisi);
        }
        else{
            burpee_sayisi-=hareketSayisi;
            System.out.println("Kalan burpee:"+burpee_sayisi);
        }
    }
       public boolean HareketKaldımı(){
           return (burpee_sayisi==0)&&(squat_sayisi==0)&&(situp_sayisi==0)&&(pushup_sayisi==0);
       }
}
