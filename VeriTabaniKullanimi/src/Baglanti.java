
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kubra
 */
public class Baglanti {
    private String kullaniciAdi="root";
    private String parola="";
    private String dbName="demo";
    private String host="localhost";
    private int port=3306;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    private Connection connection=null;
    public void verileriGetir(){
       
        String sorgu="Select * from calisanlar";
        try {
            statement=connection.createStatement();
            ResultSet sonuc=statement.executeQuery(sorgu);
            while(sonuc.next()){
                int id=sonuc.getInt("id");
                String ad=sonuc.getString("ad");
                String soyad=sonuc.getString("soyad");
                String mail=sonuc.getString("email");
                System.out.println("Kişi: "+ad+" "+soyad+"id: "+id+"Mail: "+mail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void veriEkle(){
        try {
            String sorgu="insert into calisanlar(ad,soyad,email) values(?,?,?)";
            preparedStatement=connection.prepareStatement(sorgu);
            preparedStatement.setString(1, "kubra");
            preparedStatement.setString(2, "melek");
            preparedStatement.setString(3, "kma@gmail.com");
            preparedStatement.executeUpdate();
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void guncelle(){
        try {
            //id si 3 ten buyuk olanın maili guncelle
            statement=connection.createStatement();
            String sorgu="update calisanlar set email='kbrak' where id>3 ";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
    public void sil(){
        try {
            //idsi 3 ten buyukolanalrı sil
            statement=connection.createStatement();
            String sorgu="Delete  from calisanlar where id>3";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void prepared(int id){
        
        String sorgu="Select * from calisanlar where id=?";
        
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            ResultSet sonuc=preparedStatement.executeQuery();
            
            while(sonuc.next()){
                String ad=sonuc.getString("ad");
                String soyad=sonuc.getString("soyad");
                String mail=sonuc.getString("email");
                System.out.println("İsim: "+ad+" "+soyad+" Mail:"+mail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    public Baglanti(){
        String url="jdbc:mysql://"+host+":"+port+"/"+dbName+"?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı");
        }
        try {
            connection=(Connection) DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlanamdı");
        }
    }
    public void commitRollback(){
    
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("İşlemleriniz kayıt edilsinmi?");
        String sonuc=scanner.nextLine();
       
        try {
            connection.setAutoCommit(false);
            statement=connection.createStatement();
            String sorgu1="Update calisanlar set email='selam@gmail' where id=1";
            String sorgu2="Delete from calisanlar where id>2";
            String sorgu3="insert into calisanlar (ad,soyad,email) values ('aynur','akkoyun','aynur@gmail.com')";
            statement.executeUpdate(sorgu1);
            statement.executeUpdate(sorgu2);
            statement.executeUpdate(sorgu3);
            
            System.out.println("**********************************");
           if(sonuc.equals("yes")){
            connection.commit();
            System.out.println("İşlemler yapıldı");
            System.out.println("*****************");
            verileriGetir();
        }
        else{
            connection.rollback();
            System.out.println("İşlemler iptal edildi");
            System.out.println("*************************");
            verileriGetir();
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
        Baglanti bag=new Baglanti();
        bag.prepared(2);
       /* bag.veriEkle();
        bag.verileriGetir();
        bag.guncelle();
        bag.verileriGetir();
        System.out.println("----------------------------------------------------------");
        bag.sil();
        bag.verileriGetir();*/
     //  bag.veriEkle();
     bag.commitRollback();
        System.out.println("************************//");
       bag.verileriGetir();
    }
    
}

