/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafizaoyunu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class OyunKayit {
    public  static void OyunKaydet(Kart[][] kartlar){
        try(ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("oyun.bin"))){
            output.writeObject(kartlar);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OyunKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OyunKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Kart[][] oyunGetir(){
         try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("oyun.bin"))){
            Kart[][] kartlar=(Kart[][])input.readObject();
            return kartlar;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OyunKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OyunKayit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OyunKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
         return  null;
    }
}
