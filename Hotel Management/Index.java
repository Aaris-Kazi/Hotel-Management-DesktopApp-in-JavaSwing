import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;

public class Index {
    public void Front() {
        JFrame jf = new JFrame("Hotel Management");
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage("hotel.png");
        jf.getContentPane().setBackground(new Color(0, 0, 0, 220));

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);

        JLabel l1 = new JLabel("Hotel Management");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        
        JLabel l3 = new JLabel();
        JButton btn = new JButton("ROOMS");
        btn.setOpaque(true);
        btn.setBackground(Color.BLUE);
        btn.setForeground(Color.WHITE);
        Border border = BorderFactory.createLineBorder(Color.BLUE);
        btn.setBorder(border);
        JButton btn1 = new JButton("Customer");
        btn1.setOpaque(true);
        btn1.setBackground(Color.BLUE);
        btn1.setForeground(Color.WHITE);
        btn1.setBorder(border);

        panel.setBounds(0, 0, 220, 720);
        panel.setLayout(null);
        l1.setBounds(10, 20, 200, 50);
        l3.setBounds(50, 350, 200, 50);
        btn.setBounds(10, 200, 100, 30);
        btn.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn.setOpaque(true);
        btn1.setBounds(10, 250, 100, 30);
        btn1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn1.setOpaque(true);

        jf.add(l3);
        jf.add(panel);
        panel.add(l1);
        panel.add(btn);
        panel.add(btn1);
        
        jf.setIconImage(icon);
        jf.setSize(1080, 720);
        jf.setDefaultCloseOperation(2);
        jf.setLayout(null);
        jf.setVisible(true);

        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                
            } 
        });
    }
    

    
}
