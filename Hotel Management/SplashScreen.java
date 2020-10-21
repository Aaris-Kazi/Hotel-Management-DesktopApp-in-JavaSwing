import javax.swing.*;
import java.awt.*;


class SplashScreen extends JWindow{
    private static final long serialVersionUID = 1L;
    java.awt.Image img = Toolkit.getDefaultToolkit().getImage("Walkway.png");
    
    public SplashScreen(){
        try{
            setSize(633, 360);
            setLocationRelativeTo(null);
            setVisible(true);
            //show();
            Thread.sleep(5000);
            dispose();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"Error"+e.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
            System.out.println("! Something Went Wrong in Execution !");
        }
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);
        
    }
    public static void main(String[] args) {
        new SplashScreen();
        Index I = new Index();
        I.Front();
    }
}