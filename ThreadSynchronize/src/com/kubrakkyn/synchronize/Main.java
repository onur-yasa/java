
package com.kubrakkyn.synchronize;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 * 2 thread oluşturduk
 * Threadler çalışırken main deki thread de çalıştı ve sonuc:0 geldi
 * Bunu nlemek için thread.join metodunu kullandık
 * Daha sonra count degişkeni her çalıstıgında farklı sonoclar uretti
 * yani güncel değer uzerinde işlem yapamdı thread bu synchroized sorunu
 * Bunu önlemek için bir metod ollusturıp count degerini metod içinde artturdık
 * Bu metod 'synhroized' anahtar kelimesinikullanıyor
 * Böylece thread lock işlemini kendine aldı ve baska thread 'synchroize' olan baska metodlara 
 * bile erişemedi.Çünkü bu ifade classa özgu bir tana lock (anahtarımız ) var
 * bu sonradan sıkıntı oluşturabilir.2 anahtar kullanabilirz.v
 */
public class Main {
    
    public static class ThreadSafe{
        public synchronized void arttir(){
            count++;
        }
        private int count=0;
        public void threadCalistir(){
            
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5000;i++){
                  //count++;   //burada arttırma işlemi yaptıgında her ssferınde farklı sonuc gelir
                  //bu synchronize sorunu
                  //önlemek için metod basşıan synchroize yaz 
                  arttir();
                }
                
            }
        });
        
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5000;i++){
                  //count++;    
                  arttir();
                }
                
            }
        });
        thread1.start();
        thread2.start();
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        System.out.println("Count:"+count);//count=0 çıkar yukardaki 
        //threadlerin  çalışmasınu beklesin istersem
        //join kullan
               
        }
    }
    public static void main(String[] args) {
        ThreadSafe threadSafe=new ThreadSafe();
        threadSafe.threadCalistir();
    }
}
