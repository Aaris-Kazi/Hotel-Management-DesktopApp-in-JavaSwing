import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;

public class Index {
    public void Front() {
        Queries qr = new Queries();
        JPanel jpanel = new JPanel();
        jpanel.setBounds(240,  240, 500, 1280 );
        jpanel.setBackground(new Color(56, 55, 52));
        jpanel.setLayout(null);
        JPanel jpanel1 = new JPanel();//qr.avairoom();
        jpanel1.setBounds(240,  240, 500, 1280 );
        jpanel1.setBackground(new Color(56, 55, 52));
        jpanel1.setLayout(null); 
        JPanel jpanel2 = new JPanel();//qr.resroom(); 
        jpanel2.setBounds(240,  240, 500, 1280 );
        jpanel2.setBackground(new Color(56, 55, 52));
        jpanel2.setLayout(null);
        JPanel jpanel3 = new JPanel();//qr.customer();
        jpanel3.setBounds(240,  240, 500, 1280 );
        jpanel3.setBackground(new Color(56, 55, 52));
        jpanel3.setLayout(null);
        JPanel jpanel4 = new JPanel();//qr.rec_customer();
        jpanel4.setBounds(240,  240, 500, 1280 );
        jpanel4.setBackground(new Color(56, 55, 52));
        jpanel4.setLayout(null);
        JPanel jpanel5 = new JPanel();//qr.showres();
        jpanel5.setBounds(240,  240, 500, 1280 );
        jpanel5.setBackground(new Color(56, 55, 52));
        jpanel5.setLayout(null);
        JPanel jpanel6 = new JPanel();//qr.showresrec();
        jpanel6.setBounds(240,  240, 500, 1280 );
        jpanel6.setBackground(new Color(56, 55, 52));
        jpanel6.setLayout(null);
        JPanel jpanel7 = new JPanel();//qr.showbills();
        jpanel7.setBounds(240,  240, 500, 1280 );
        jpanel7.setBackground(new Color(56, 55, 52));
        jpanel7.setLayout(null);
        JPanel jpanel8 = new JPanel();//qr.showrecbills();
        jpanel8.setBounds(240,  240, 500, 1280 );
        jpanel8.setBackground(new Color(56, 55, 52));
        jpanel8.setLayout(null);
        JPanel jpanel9 = qr.addCustomer();
        JPanel jpanel10 = qr.addReservation();
        JPanel jpanel11 = qr.addBill();

        JFrame jf = new JFrame("Hotel Management");
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage("hotel.png");
        jf.getContentPane().setBackground(new Color(0, 0, 0, 220));
        Border border = BorderFactory.createLineBorder(new Color(88, 125, 184, 10).darker());

        JPanel panel = new JPanel();
        panel.setBackground(new Color(88, 125, 184).darker());
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLACK.darker());
        panel1.setBorder(border);
        JPanel panel2 = new JPanel() ;
        panel2.setBackground(Color.BLACK.darker());
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLACK.darker());
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.BLACK.darker());
        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.BLACK.darker());

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

        JButton showroom = new JButton("Show Rooms");
        showroom.setOpaque(true);
        showroom.setBackground(new Color(56, 55, 52));
        showroom.setForeground(Color.WHITE);
        showroom.setBorder(border);
        JButton avrooms = new JButton("Available Rooms");
        avrooms.setOpaque(true);
        avrooms.setBackground(new Color(56, 55, 52));
        avrooms.setForeground(Color.WHITE);
        avrooms.setBorder(border);
        JButton reserved = new JButton("Reserved Rooms");
        reserved.setOpaque(true);
        reserved.setBackground(new Color(56, 55, 52));
        reserved.setForeground(Color.WHITE);
        reserved.setBorder(border);

        JButton history = new JButton("Customer History");
        history.setOpaque(true);
        history.setBackground(new Color(56, 55, 52));
        history.setForeground(Color.WHITE);
        history.setBorder(border);
        JButton recent = new JButton("Recents Customer");
        recent.setOpaque(true);
        recent.setBackground(new Color(56, 55, 52));
        recent.setForeground(Color.WHITE);
        recent.setBorder(border);
        JButton add = new JButton("ADD Customer");
        add.setOpaque(true);
        add.setBackground(new Color(56, 55, 52));
        add.setForeground(Color.WHITE);
        add.setBorder(border);

        JButton history1 = new JButton("Reservation History");
        history1.setOpaque(true);
        history1.setBackground(new Color(56, 55, 52));
        history1.setForeground(Color.WHITE);
        history1.setBorder(border);
        JButton recent1 = new JButton("Upcoming Reservation");
        recent1.setOpaque(true);
        recent1.setBackground(new Color(56, 55, 52));
        recent1.setForeground(Color.WHITE);
        recent1.setBorder(border);
        JButton add1 = new JButton("ADD Reservation");
        add1.setOpaque(true);
        add1.setBackground(new Color(56, 55, 52));
        add1.setForeground(Color.WHITE);
        add1.setBorder(border);

        JButton history2 = new JButton("Bill History");
        history2.setOpaque(true);
        history2.setBackground(new Color(56, 55, 52));
        history2.setForeground(Color.WHITE);
        history2.setBorder(border);
        JButton recent2 = new JButton("Recent Bill");
        recent2.setOpaque(true);
        recent2.setBackground(new Color(56, 55, 52));
        recent2.setForeground(Color.WHITE);
        recent2.setBorder(border);
        JButton add2 = new JButton("Create Bill");
        add2.setOpaque(true);
        add2.setBackground(new Color(56, 55, 52));
        add2.setForeground(Color.WHITE);
        add2.setBorder(border);

        panel.setBounds(0, 0, 220, 720);
        panel.setLayout(null);
        panel1.setBounds(220, 0, 1280, 220);
        panel1.setLayout(null);
        panel2.setBounds(220, 0, 1280, 220);
        panel2.setLayout(null);
        panel3.setBounds(220, 0, 1280, 220);
        panel3.setLayout(null);
        panel4.setBounds(220, 0, 1280, 220);
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

        showroom.setBounds(20, 180, 150, 30);
        showroom.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        showroom.setOpaque(true);
        avrooms.setBounds(200, 180, 150, 30);
        avrooms.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        avrooms.setOpaque(true);
        reserved.setBounds(380, 180, 150, 30);
        reserved.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        reserved.setOpaque(true);

        history.setBounds(20, 180, 150, 30);
        history.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        history.setOpaque(true);
        recent.setBounds(200, 180, 150, 30);
        recent.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        recent.setOpaque(true);
        add.setBounds(380, 180, 150, 30);
        add.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        add.setOpaque(true);

        history1.setBounds(20, 180, 150, 30);
        history1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        history1.setOpaque(true);
        recent1.setBounds(190, 180, 180, 30);
        recent1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        recent1.setOpaque(true);
        add1.setBounds(390, 180, 150, 30);
        add1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        add1.setOpaque(true);

        history2.setBounds(20, 180, 150, 30);
        history2.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        history2.setOpaque(true);
        recent2.setBounds(200, 180, 150, 30);
        recent2.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        recent2.setOpaque(true);
        add2.setBounds(380, 180, 150, 30);
        add2.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        add2.setOpaque(true);

        jf.add(panel);
        jf.add(panel1);
        panel.add(l1);
        panel.add(btn);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);

        panel1.add(l2);
        panel1.add(showroom);
        panel1.add(avrooms);
        panel1.add(reserved);

        panel2.add(l3);
        panel2.add(history);
        panel2.add(recent);
        panel2.add(add);

        panel3.add(l4);
        panel3.add(history1);
        panel3.add(recent1);
        panel3.add(add1);

        panel4.add(l5);
        panel4.add(history2);
        panel4.add(recent2);
        panel4.add(add2);

        btn.addActionListener(new ActionListener() {
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

        btn1.addActionListener(new ActionListener() {
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

        btn2.addActionListener(new ActionListener() {
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

        btn3.addActionListener(new ActionListener() {
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
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        showroom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JScrollPane scroll = qr.showroom();
                jpanel.add(scroll);
                jpanel.repaint();
                jpanel.revalidate();
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel);
                jf.revalidate();
                jf.repaint();
            } 
        });

        avrooms.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JScrollPane scroll = qr.avairoom();
                jpanel1.add(scroll);
                jpanel1.repaint();
                jpanel1.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel1);
                jf.revalidate();
                jf.repaint();
            } 
        });

        reserved.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JScrollPane scroll = qr.resroom();
                jpanel2.add(scroll);
                jpanel2.repaint();
                jpanel2.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel2);
                jf.revalidate();
                jf.repaint();
            } 
        });

        history.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JScrollPane scroll = qr.customer();
                jpanel3.add(scroll);
                jpanel3.repaint();
                jpanel3.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel3);
                jf.revalidate();
                jf.repaint();
            } 
        });

        recent.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JScrollPane scroll = qr.rec_customer();
                jpanel4.add(scroll);
                jpanel4.repaint();
                jpanel4.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel4);
                jf.revalidate();
                jf.repaint();
            } 
        });

        history1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JScrollPane scroll = qr.showres();
                jpanel5.add(scroll);
                jpanel5.repaint();
                jpanel5.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel5);
                jf.revalidate();
                jf.repaint();
            } 
        });

        recent1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JScrollPane scroll = qr.showresrec();
                jpanel6.add(scroll);
                jpanel6.repaint();
                jpanel6.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel6);
                jf.revalidate();
                jf.repaint();
            } 
        });

        history2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JScrollPane scroll = qr.showbills();
                jpanel7.add(scroll);
                jpanel7.repaint();
                jpanel7.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel7);
                jf.revalidate();
                jf.repaint();
            } 
        });

        recent2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JScrollPane scroll = qr.showrecbills();
                jpanel8.add(scroll);
                jpanel8.repaint();
                jpanel8.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel8);
                jf.revalidate();
                jf.repaint();
            } 
        });
//////////////////////////////////////////////////////////////////////////////////////
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jpanel.removeAll();
                jpanel.repaint();
                jpanel.revalidate();
                jpanel1.removeAll();
                jpanel1.repaint();
                jpanel1.revalidate();
                jpanel2.removeAll();
                jpanel2.repaint();
                jpanel2.revalidate();
                jpanel3.removeAll();
                jpanel3.repaint();
                jpanel3.revalidate();
                jpanel4.removeAll();
                jpanel4.repaint();
                jpanel4.revalidate();
                jpanel5.removeAll();
                jpanel5.repaint();
                jpanel5.revalidate();
                jpanel6.removeAll();
                jpanel6.repaint();
                jpanel6.revalidate();
                jpanel7.removeAll();
                jpanel7.repaint();
                jpanel7.revalidate();
                jpanel8.removeAll();
                jpanel8.repaint();
                jpanel8.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel10);
                jf.remove(jpanel11);
                jf.add(jpanel9);
                jf.revalidate();
                jf.repaint();
            } 
        });

        add1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jpanel.removeAll();
                jpanel.repaint();
                jpanel.revalidate();
                jpanel1.removeAll();
                jpanel1.repaint();
                jpanel1.revalidate();
                jpanel2.removeAll();
                jpanel2.repaint();
                jpanel2.revalidate();
                jpanel3.removeAll();
                jpanel3.repaint();
                jpanel3.revalidate();
                jpanel4.removeAll();
                jpanel4.repaint();
                jpanel4.revalidate();
                jpanel5.removeAll();
                jpanel5.repaint();
                jpanel5.revalidate();
                jpanel6.removeAll();
                jpanel6.repaint();
                jpanel6.revalidate();
                jpanel7.removeAll();
                jpanel7.repaint();
                jpanel7.revalidate();
                jpanel8.removeAll();
                jpanel8.repaint();
                jpanel8.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel11);
                jf.add(jpanel10);
                jf.revalidate();
                jf.repaint();
            } 
        });

        add2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jpanel.removeAll();
                jpanel.repaint();
                jpanel.revalidate();
                jpanel1.removeAll();
                jpanel1.repaint();
                jpanel1.revalidate();
                jpanel2.removeAll();
                jpanel2.repaint();
                jpanel2.revalidate();
                jpanel3.removeAll();
                jpanel3.repaint();
                jpanel3.revalidate();
                jpanel4.removeAll();
                jpanel4.repaint();
                jpanel4.revalidate();
                jpanel5.removeAll();
                jpanel5.repaint();
                jpanel5.revalidate();
                jpanel6.removeAll();
                jpanel6.repaint();
                jpanel6.revalidate();
                jpanel7.removeAll();
                jpanel7.repaint();
                jpanel7.revalidate();
                jpanel8.removeAll();
                jpanel8.repaint();
                jpanel8.revalidate();
                jf.remove(jpanel);
                jf.remove(jpanel1);
                jf.remove(jpanel2);
                jf.remove(jpanel3);
                jf.remove(jpanel4);
                jf.remove(jpanel5);
                jf.remove(jpanel6);
                jf.remove(jpanel7);
                jf.remove(jpanel8);
                jf.remove(jpanel9);
                jf.remove(jpanel10);
                jf.add(jpanel11);
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
