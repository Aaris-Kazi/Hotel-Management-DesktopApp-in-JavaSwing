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
        panel.setBackground(new Color(88, 125, 184).darker());
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(88, 125, 184).darker());
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(88, 125, 184).darker());
        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(88, 125, 184).darker());
        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(88, 125, 184).darker());
        JPanel panel5 = new JPanel();
        panel5.setBackground(new Color(88, 125, 184).darker());

        JLabel l1 = new JLabel("Hotel Management");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        JLabel l2 = new JLabel("ROOMS");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        JLabel l3 = new JLabel("CUSTOMER");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        JLabel l4 = new JLabel("RESERVATIONS");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        JLabel l5 = new JLabel("BILLS");
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("TimesRoman", Font.PLAIN, 22));
        
        JButton btn = new JButton("ROOMS");
        btn.setOpaque(true);
        btn.setBackground(new Color(78, 78, 173).darker());
        btn.setForeground(Color.WHITE);
        Border border = BorderFactory.createLineBorder(new Color(88, 125, 184,10).darker());
        btn.setBorder(border);
        JButton btn1 = new JButton("CUSTOMER");
        btn1.setOpaque(true);
        btn1.setBackground(new Color(78, 78, 173).darker());
        btn1.setForeground(Color.WHITE);
        btn1.setBorder(border);
        JButton btn2 = new JButton("RESERVATIONS");
        btn2.setOpaque(true);
        btn2.setBackground(new Color(78, 78, 173).darker());
        btn2.setForeground(Color.WHITE);
        btn2.setBorder(border);
        JButton btn3 = new JButton("BILLS");
        btn3.setOpaque(true);
        btn3.setBackground(new Color(78, 78, 173).darker());
        btn3.setForeground(Color.WHITE);
        btn3.setBorder(border);

        panel.setBounds(0, 0, 220, 720);
        panel.setLayout(null);
        panel1.setBounds(230, 5, 825, 220);
        panel1.setLayout(null);
        panel2.setBounds(230, 5, 825, 220);
        panel2.setLayout(null);
        panel3.setBounds(230, 5, 825, 220);
        panel3.setLayout(null);
        panel4.setBounds(230, 5, 825, 220);
        panel4.setLayout(null);
        
        
        l1.setBounds(10, 20, 200, 50);
        l2.setBounds(20, 20, 200, 50);
        l3.setBounds(20, 20, 200, 50);
        l4.setBounds(20, 20, 200, 50);
        l5.setBounds(20, 20, 200, 50);
        
        btn.setBounds(10, 200, 150, 30);
        btn.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn.setOpaque(true);
        btn1.setBounds(10, 250, 150, 30);
        btn1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn1.setOpaque(true);
        btn2.setBounds(10, 300, 150, 30);
        btn2.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn2.setOpaque(true);
        btn3.setBounds(10, 350, 150, 30);
        btn3.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        btn3.setOpaque(true);


        jf.add(panel);
        jf.add(panel1);
        panel.add(l1);
        panel.add(btn);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel1.add(l2);
        panel2.add(l3);
        panel3.add(l4);
        panel4.add(l5);

        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jf.remove(panel2);
                jf.remove(panel3);
                jf.remove(panel4);
                jf.add(panel1);
                jf.revalidate();
                jf.repaint();

            } 
        });

        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jf.remove(panel1);
                jf.remove(panel3);
                jf.remove(panel4);
                jf.add(panel2);
                jf.revalidate();
                jf.repaint();

            } 
        });

        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jf.remove(panel1);
                jf.remove(panel2);
                jf.remove(panel4);
                jf.add(panel3);
                jf.revalidate();
                jf.repaint();

            } 
        });

        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jf.remove(panel1);
                jf.remove(panel2);
                jf.remove(panel3);
                jf.add(panel4);
                jf.revalidate();
                jf.repaint();

            } 
        });
        
        jf.setIconImage(icon);
        jf.setSize(1080, 720);
        jf.setDefaultCloseOperation(2);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    

    
}
