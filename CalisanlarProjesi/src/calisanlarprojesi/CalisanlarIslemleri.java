/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlarprojesi;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kubra
 */
public class CalisanlarIslemleri {
     private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    private Connection connection=null;
    public CalisanlarIslemleri(){
     String url="jdbc:mysql://"+Database.host+":"+Database.port+"/"+Database.dbName+"?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı");
        }
        try {
            connection=(Connection) DriverManager.getConnection(url, Database.kullaniciAdi, Database.parola);
            System.out.println("Başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlanamdı");
        }
    }
    
    public boolean GirisKontrol(String kullanici,String parola){
        String sorgu="Select * From adminler where username = ? and password = ?";
         try {
             preparedStatement=connection.prepareStatement(sorgu);
             preparedStatement.setString(1, kullanici);
             preparedStatement.setString(2, parola);
             ResultSet rs=preparedStatement.executeQuery();
             return rs.next();
         } catch (SQLException ex) {
             Logger.getLogger(CalisanlarIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
       return false;
        
    }
    public ArrayList<Calisan> calisanlariGetir(){
        
         ArrayList<Calisan> cikti = new ArrayList<Calisan>();
        
        try {
            statement =  connection.createStatement();
            String sorgu =  "Select * From calisanlar";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String dept  = rs.getString("departman");
                String maas = rs.getString("maas");
                
                cikti.add(new Calisan(id, ad, soyad, dept, maas));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanlarIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
        
        
        
    }
    public void calisanEkle(String ad,String soyad,String maas,String dept){
        String sorgu="Insert Into calisanlar (ad,soyad,departman,maas) VALUES(?,?,?,?)";
         try {
             preparedStatement=connection.prepareStatement(sorgu);
             preparedStatement.setString(1, ad);
             preparedStatement.setString(2, soyad);
             preparedStatement.setString(3, dept);
             preparedStatement.setString(4, maas);
             preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(CalisanlarIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public void guncelle(int id,String ad,String soyad,String maas,String dept){
        
       
         String sorgu =  "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? where id = ?";
         try {
              preparedStatement=connection.prepareStatement(sorgu);
              preparedStatement.setString(1, ad);
              preparedStatement.setString(2, soyad);
              preparedStatement.setString(3, maas);
              preparedStatement.setString(4, dept);
              preparedStatement.setInt(5, id);
              preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(CalisanlarIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
       
                
    }
    public void sil(int id){
        String sorgu="Delete from calisanlar where id = ?";
         try {
             preparedStatement=connection.prepareStatement(sorgu);
             preparedStatement.setInt(1,id);
             preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(CalisanlarIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
                
    }
}
