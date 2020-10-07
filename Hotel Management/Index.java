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
        panel.setBackground(new Color(88, 125, 184, 100));

        JLabel l1 = new JLabel("Hotel Management");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        
        
        JButton btn = new JButton("ROOMS");
        btn.setOpaque(true);
        btn.setBackground(new Color(78, 78, 173));
        btn.setForeground(Color.WHITE);
        Border border = BorderFactory.createLineBorder(new Color(88, 125, 184,10).darker());
        btn.setBorder(border);
        JButton btn1 = new JButton("Customer");
        btn1.setOpaque(true);
        btn1.setBackground(new Color(78, 78, 173));
        btn1.setForeground(Color.WHITE);
        btn1.setBorder(border);
        JButton btn2 = new JButton("RESERVATIONS");
        btn2.setOpaque(true);
        btn2.setBackground(new Color(78, 78, 173));
        btn2.setForeground(Color.WHITE);
        btn2.setBorder(border);
        JButton btn3 = new JButton("BILLS");
        btn3.setOpaque(true);
        btn3.setBackground(new Color(78, 78, 173));
        btn3.setForeground(Color.WHITE);
        btn3.setBorder(border);

        panel.setBounds(0, 0, 220, 720);
        panel.setLayout(null);
        l1.setBounds(10, 20, 200, 50);
        
        btn.setBounds(10, 200, 100, 30);
        btn.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn.setOpaque(true);
        btn1.setBounds(10, 250, 100, 30);
        btn1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn1.setOpaque(true);
        btn2.setBounds(10, 300, 150, 30);
        btn2.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn2.setOpaque(true);
        btn3.setBounds(10, 350, 75, 30);
        btn3.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn3.setOpaque(true);

        jf.add(panel);
        panel.add(l1);
        panel.add(btn);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        
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
