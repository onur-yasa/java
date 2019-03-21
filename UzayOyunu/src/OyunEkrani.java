
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkrani extends JFrame{

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        OyunEkrani ekran=new OyunEkrani("Uzay Oyunu");
        ekran.setResizable(false);
        ekran.setFocusable(false);//işlemlern jframe e odaklanmasını istemiyoruz.jpanele odaklasnın
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun=new Oyun();
        oyun.requestFocus();//klavye işlemleri için focusu ver
        oyun.addKeyListener(oyun);//klavye işlemlerimi almak için
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);//klavye işlemerşni jpanelin anlamsı için false vermne lazım
        //yukardaki 3 fonk sırası önemli.........*********************************
        ekran.add(oyun);//jpaneli jframe  e ekledik.
        ekran.setVisible(true);
        
                
               
    }
    
}
