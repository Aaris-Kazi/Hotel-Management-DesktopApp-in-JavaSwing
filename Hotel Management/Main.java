import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;

class Main {
    public static void main(String[] args) {

        JFrame jf = new JFrame("Hotel Management");
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage("hotel.png");

        JLabel l1 = new JLabel("User Name");
        JLabel l2 = new JLabel("Password");
        JLabel l3 = new JLabel();
        JTextField tf = new JTextField();
        JPasswordField jpp = new JPasswordField();
        JButton btn = new JButton("Submit");
        
        l1.setBounds(50, 100, 200, 50);
        l2.setBounds(50, 200, 200, 50);
        l3.setBounds(50, 350, 200, 50);
        tf.setBounds(50, 150, 250, 20);
        jpp.setBounds(50, 250, 250, 20); 
        btn.setBounds(150, 300, 80, 20);
        
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
        jf.add(tf);
        jf.add(jpp);
        jf.add(btn);

        jf.setIconImage(icon);
        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setVisible(true);

        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String data =  tf.getText();
                data += new String(jpp.getPassword());
                l3.setText(data);
                
            }
            
        });
    }
}