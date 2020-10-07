
import javax.swing.*;
import java.awt.*;


class SplashScreen extends JWindow{
    
    private static final long serialVersionUID = 1L;
    java.awt.Image img = Toolkit.getDefaultToolkit().getImage("Walkway.png");
    ImageIcon icon = new ImageIcon(img);
    
    public SplashScreen(){
        try{
            setSize(633, 360);
            setLocationRelativeTo(null);
            show();
            Thread.sleep(5000);
            dispose();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog((java.awt.Component) null,"Error"+e.getMessage(), "Error:", javax.swing.JOptionPane.DEFAULT_OPTION); 
            System.out.println("! Something Went Wrong in Execution !");
        }
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);
        
    }
    public static void main(String[] args) {
        SplashScreen m = new SplashScreen();
        Index I = new Index();
        I.Front();
        
    }
}