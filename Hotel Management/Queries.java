import java.awt.Color;
import java.sql.*;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.border.Border;
import java.awt.event.*;

public class Queries{
    public JPanel showroom() {
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));
        String column[]={"Room No","Price","Status"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        JTableHeader th = jt.getTableHeader();
        th.setBackground(new Color(88, 125, 184).darker());
        th.setForeground(Color.WHITE);
        jt.setModel(model);
        jt.setForeground(Color.WHITE);
        jt.setBackground(new Color(88, 125, 184).darker());
        jt.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jt.setFillsViewportHeight(true);
        
        String data = "";
        String adata = "";
        String adataa = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from room_status");
            int i = 0;
            while(res.next()){
                //System.out.println(res.getString(1)+","+res.getString(2)+","+res.getString(3));
                data = res.getString(1);
                adata = res.getString(2);
                adataa = res.getString(3);
                model.addRow(new Object[]{data, adata, adataa});
                i++;
            }
            if (i < 1) {
                System.out.println(i + " Records Not Found");
            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                //System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            //System.out.print(e);
        }
        //JPanel jp = new JPanel();
        JScrollPane scroll = new JScrollPane(jt);
        
        jp.add(scroll);
        jp.setBounds(240, 240, 500, 1280);
        jp.repaint();
        jp.revalidate();
        return jp;
        //setLayout(null);
        //jf.setDefaultCloseOperation(2);
        
    }

    public JPanel avairoom() {
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));
        String column[]={"Room No","Price","Status"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        JTableHeader th = jt.getTableHeader();
        th.setBackground(new Color(88, 125, 184).darker());
        th.setForeground(Color.WHITE);
        jt.setModel(model);
        jt.setForeground(Color.WHITE);
        jt.setBackground(new Color(88, 125, 184).darker());
        jt.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jt.setFillsViewportHeight(true);
        
        String data = "";
        String adata = "";
        String adataa = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from room_status where status = 'available'");
            int i = 0;
            while(res.next()){
                //System.out.println(res.getString(1)+","+res.getString(2)+","+res.getString(3));
                data = res.getString(1);
                adata = res.getString(2);
                adataa = res.getString(3);
                model.addRow(new Object[]{data, adata, adataa});
                i++;
            }
            if (i < 1) {
                System.out.println(i + " Records Not Found");
            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                //System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            //System.out.print(e);
        }
        //JPanel jp = new JPanel();
        JScrollPane scroll = new JScrollPane(jt);
        
        jp.add(scroll);
        jp.repaint();
        jp.revalidate();
        jp.setBounds(240, 240, 500, 1280);
        
        return jp;
        //setLayout(null);
        //jf.setDefaultCloseOperation(2);
        
    }

    public JPanel resroom() {
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));
        String column[]={"Room No","Price","Status"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        JTableHeader th = jt.getTableHeader();
        th.setBackground(new Color(88, 125, 184).darker());
        th.setForeground(Color.WHITE);
        jt.setModel(model);
        jt.setForeground(Color.WHITE);
        jt.setBackground(new Color(88, 125, 184).darker());
        jt.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jt.setFillsViewportHeight(true);
        
        String data = "";
        String adata = "";
        String adataa = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from room_status where status = 'reserved'");
            int i = 0;
            while(res.next()){
                //System.out.println(res.getString(1)+","+res.getString(2)+","+res.getString(3));
                data = res.getString(1);
                adata = res.getString(2);
                adataa = res.getString(3);
                model.addRow(new Object[]{data, adata, adataa});
                i++;
            }
            if (i < 1) {
                System.out.println(i + " Records Not Found");
            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                //System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            //System.out.print(e);
        }
        JScrollPane scroll = new JScrollPane(jt);
        
        jp.add(scroll);
        jp.repaint();
        jp.revalidate();
        jp.setBounds(240, 240, 500, 1280);
        return jp;
    }

    public JPanel customer() {
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));
        String column[]={"Name","Check In","Check Out","Room No","Price"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        JTableHeader th = jt.getTableHeader();
        th.setBackground(new Color(88, 125, 184).darker());
        th.setForeground(Color.WHITE);
        jt.setModel(model);
        jt.setForeground(Color.WHITE);
        jt.setBackground(new Color(88, 125, 184).darker());
        jt.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jt.setBounds(10, 10, 700, 1080);
        jt.setFillsViewportHeight(true);
        
        String adata = "";
        String adataa = "";
        String datata = "";
        String adatata = "";
        String adataata = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from hotel_system");
            int i = 0;
            while(res.next()){
                //System.out.println(res.getString(1)+","+res.getString(2)+","+res.getString(3));

                adata = res.getString(2);
                adataa = res.getString(3);
                datata = res.getString(4);
                adatata = res.getString(5);
                adataata = res.getString(6);
                model.addRow(new Object[]{adata, adataa, datata, adatata, adataata});
                i++;
            }
            if (i < 1) {
                System.out.println(i + " Records Not Found");
            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                //System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            //System.out.print(e);
        }
        
        JScrollPane scroll = new JScrollPane(jt);
        
        jp.add(scroll);
        jp.repaint();
        jp.revalidate();
        jp.setBounds(240, 240, 700, 1280);
        return jp;
    }

    public JPanel rec_customer() {
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));
        String column[]={"Name","Check In","Check Out","Room No","Price"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        JTableHeader th = jt.getTableHeader();
        th.setBackground(new Color(88, 125, 184).darker());
        th.setForeground(Color.WHITE);
        jt.setModel(model);
        jt.setForeground(Color.WHITE);
        jt.setBackground(new Color(88, 125, 184).darker());
        jt.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jt.setBounds(10, 10, 700, 1080);
        jt.setFillsViewportHeight(true);
        
        
        String adata = "";
        String adataa = "";
        String datata = "";
        String adatata = "";
        String adataata = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from hotel_system order by check_in desc");
            int i = 0;
            while(res.next()){
                //System.out.println(res.getString(1)+","+res.getString(2)+","+res.getString(3));
                
                adata = res.getString(2);
                adataa = res.getString(3);
                datata = res.getString(4);
                adatata = res.getString(5);
                adataata = res.getString(6);
                model.addRow(new Object[]{adata, adataa, datata, adatata, adataata});
                i++;
            }
            if (i < 1) {
                System.out.println(i + " Records Not Found");
            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                //System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            //System.out.print(e);
        }
        
        JScrollPane scroll = new JScrollPane(jt);
        
        
        jp.add(scroll);
        jp.repaint();
        jp.revalidate();
        jp.setBounds(240, 240, 700, 1280);
        return jp;
    }

   public JPanel showres() {
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));
        String column[]={"Customer Name","Reservation Date","No Of Days"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        JTableHeader th = jt.getTableHeader();
        th.setBackground(new Color(88, 125, 184).darker());
        th.setForeground(Color.WHITE);
        jt.setModel(model);
        jt.setForeground(Color.WHITE);
        jt.setBackground(new Color(88, 125, 184).darker());
        jt.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jt.setFillsViewportHeight(true);
        
        String data = "";
        String adata = "";
        String adataa = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from customer order by reservation_date desc");
            int i = 0;
            while(res.next()){
                //System.out.println(res.getString(1)+","+res.getString(2)+","+res.getString(3));
                data = res.getString(2);
                adata = res.getString(3);
                adataa = res.getString(4);
                model.addRow(new Object[]{data, adata, adataa});
                i++;
            }
            if (i < 1) {
                System.out.println(i + " Records Not Found");
            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                //System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            //System.out.print(e);
        }
        //JPanel jp = new JPanel();
        JScrollPane scroll = new JScrollPane(jt);
        
        jp.add(scroll);
        jp.setBounds(240, 240, 500, 1280);
        jp.repaint();
        jp.revalidate();
        return jp;
        //setLayout(null);
        //jf.setDefaultCloseOperation(2);
        
    } 

    public JPanel showresrec() {
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));
        String column[]={"Customer Name","Reservation Date","No Of Days"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        JTableHeader th = jt.getTableHeader();
        th.setBackground(new Color(88, 125, 184).darker());
        th.setForeground(Color.WHITE);
        jt.setModel(model);
        jt.setForeground(Color.WHITE);
        jt.setBackground(new Color(88, 125, 184).darker());
        jt.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jt.setFillsViewportHeight(true);
        
        String data = "";
        String adata = "";
        String adataa = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from customer order by customer_id desc");
            int i = 0;
            while(res.next()){
                //System.out.println(res.getString(1)+","+res.getString(2)+","+res.getString(3));
                data = res.getString(2);
                adata = res.getString(3);
                adataa = res.getString(4);
                model.addRow(new Object[]{data, adata, adataa});
                i++;
            }
            if (i < 1) {
                System.out.println(i + " Records Not Found");
            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                //System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            //System.out.print(e);
        }
        //JPanel jp = new JPanel();
        JScrollPane scroll = new JScrollPane(jt);
        
        jp.add(scroll);
        jp.setBounds(240, 240, 500, 1280);
        jp.repaint();
        jp.revalidate();
        return jp;
        //setLayout(null);
        //jf.setDefaultCloseOperation(2);
        
    }

    public JPanel showbills() {
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));
        String column[]={"Date","Customer Name","Room No","Amount","Payment"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        JTableHeader th = jt.getTableHeader();
        th.setBackground(new Color(88, 125, 184).darker());
        th.setForeground(Color.WHITE);
        jt.setModel(model);
        jt.setForeground(Color.WHITE);
        jt.setBackground(new Color(88, 125, 184).darker());
        jt.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jt.setFillsViewportHeight(true);
        
        String data = "";
        String adata = "";
        String adataa = "";
        String datata = "";
        String adatata = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from bill");
            int i = 0;
            while(res.next()){
                //System.out.println(res.getString(1)+","+res.getString(2)+","+res.getString(3));
                data = res.getString(2);
                adata = res.getString(3);
                adataa = res.getString(4);
                datata = res.getString(5);
                adatata = res.getString(6);
                model.addRow(new Object[]{data, adata, adataa, datata, adatata});
                i++;
            }
            if (i < 1) {
                System.out.println(i + " Records Not Found");
            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                //System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            //System.out.print(e);
        }
        //JPanel jp = new JPanel();
        JScrollPane scroll = new JScrollPane(jt);
        
        jp.add(scroll);
        jp.setBounds(240, 240, 500, 1280);
        jp.repaint();
        jp.revalidate();
        return jp;
        //setLayout(null);
        //jf.setDefaultCloseOperation(2);   
    }

    public JPanel showrecbills() {
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));
        String column[]={"Date","Customer Name","Room No","Amount","Payment"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        JTableHeader th = jt.getTableHeader();
        th.setBackground(new Color(88, 125, 184).darker());
        th.setForeground(Color.WHITE);
        jt.setModel(model);
        jt.setForeground(Color.WHITE);
        jt.setBackground(new Color(88, 125, 184).darker());
        jt.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jt.setFillsViewportHeight(true);
        
        String data = "";
        String adata = "";
        String adataa = "";
        String datata = "";
        String adatata = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from bill order by date desc");
            int i = 0;
            while(res.next()){
                //System.out.println(res.getString(1)+","+res.getString(2)+","+res.getString(3));
                data = res.getString(2);
                adata = res.getString(3);
                adataa = res.getString(4);
                datata = res.getString(5);
                adatata = res.getString(6);
                model.addRow(new Object[]{data, adata, adataa, datata, adatata});
                i++;
            }
            if (i < 1) {
                System.out.println(i + " Records Not Found");
            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                //System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            //System.out.print(e);
        }
        //JPanel jp = new JPanel();
        JScrollPane scroll = new JScrollPane(jt);
        
        jp.add(scroll);
        jp.setBounds(240, 240, 500, 1280);
        jp.repaint();
        jp.revalidate();
        return jp;
        //setLayout(null);
        //jf.setDefaultCloseOperation(2);   
    }

    public JPanel addCustomer() {
        Border border = BorderFactory.createLineBorder(new Color(88, 125, 184, 10).darker());
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));

        JLabel label = new JLabel("CUSTOMER");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("TimesRoman", Font.PLAIN, 16));

        JLabel l1 = new JLabel("NAME");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JLabel l2 = new JLabel("CHECK IN");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JLabel l3 = new JLabel("CHECK OUT");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JLabel l4 = new JLabel("ROOM NO");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("TimesRoman", Font.PLAIN, 16));

        JTextField text1 = new JTextField();
        text1.setForeground(Color.WHITE);
        text1.setBackground(new Color(88, 125, 184).darker());
        JTextField text2 = new JTextField();
        text2.setForeground(Color.WHITE);
        text2.setBackground(new Color(88, 125, 184).darker());
        JTextField text3 = new JTextField();
        text3.setForeground(Color.WHITE);
        text3.setBackground(new Color(88, 125, 184).darker());
        JTextField text4 = new JTextField();
        text4.setForeground(Color.WHITE);
        text4.setBackground(new Color(88, 125, 184).darker());

        JButton btn1 = new JButton("SUBMIT");
        btn1.setOpaque(true);
        btn1.setBackground(new Color(78, 78, 173).darker());
        btn1.setForeground(Color.WHITE);
        btn1.setBorder(border);

        label.setBounds(200, 0, 200, 50);
        l1.setBounds(10, 50, 200, 50);
        l2.setBounds(10, 100, 200, 50);
        l3.setBounds(400, 100, 200, 50);
        l4.setBounds(10, 200, 200, 50);

        text1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        text1.setBounds(100, 65, 500, 25);
        text2.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        text2.setBounds(100, 115, 100, 25);
        text3.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        text3.setBounds(500, 115, 100, 25);
        text4.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        text4.setBounds(100, 215, 100, 25);

        btn1.setBounds(500, 350, 150, 30);

        jp.add(label);
        jp.add(l1);
        jp.add(l2);
        jp.add(l3);
        jp.add(l4);

        jp.add(text1);
        jp.add(text2);
        jp.add(text3);
        jp.add(text4);

        jp.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String name = text1.getText();
                String check_in = text2.getText();
                String check_out = text3.getText();
                String room = text4.getText();
                String amount = "";
                String status = "";
                if(name == null || check_in == null || check_out == null || room == null){
                    System.out.println("Please fill all the data");
                    JOptionPane.showMessageDialog(null, "Records are left empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
                        Statement smt = conn.createStatement();
                        ResultSet res = smt.executeQuery("select * from room_status where room_no = "+room+"");
                        while(res.next()){
                            amount = res.getString(2);
                            status = res.getString(3);
                        }
                        if(status == "not available" || status == "reserved"){
                            System.out.println("Cannot place reservation the room is already taken!");
                            JOptionPane.showMessageDialog(null, "Rooms are already taken", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            smt.executeUpdate("insert into hotel_system (name, check_in, check_out, room_no, price) values ('"+name+"', '"+check_in+"', '"+check_out+"', "+room+", "+amount+")");
                            smt.executeUpdate("update room_status set status = 'not available' where room_no = "+room+"");
                            JOptionPane.showMessageDialog(null, "Record Fill Successfully", "Success", JOptionPane.WARNING_MESSAGE);
                            conn.close();
                        }
                    } catch (Exception error) {
                        //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("You are not Connected with the server"+error);
                    }
    
                    text1.setText("");
                    text2.setText("");
                    text3.setText("");
                    text4.setText("");
                }
                
            }
        });
        jp.setBounds(240, 240, 1000, 1280);
        jp.setLayout(null);
        return jp;
    }

    public JPanel addReservation() {
        Border border = BorderFactory.createLineBorder(new Color(88, 125, 184, 10).darker());
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));

        JLabel label = new JLabel("RESERVATION");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("TimesRoman", Font.PLAIN, 16));

        JLabel l1 = new JLabel("NAME");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JLabel l2 = new JLabel("CHECK IN");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JLabel l3 = new JLabel("NO OF DAYS");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JLabel l4 = new JLabel("ROOM NO");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("TimesRoman", Font.PLAIN, 16));

        JTextField text1 = new JTextField();
        text1.setForeground(Color.WHITE);
        text1.setBackground(new Color(88, 125, 184).darker());
        JTextField text2 = new JTextField();
        text2.setForeground(Color.WHITE);
        text2.setBackground(new Color(88, 125, 184).darker());
        JTextField text3 = new JTextField();
        text3.setForeground(Color.WHITE);
        text3.setBackground(new Color(88, 125, 184).darker());
        JTextField text4 = new JTextField();
        text4.setForeground(Color.WHITE);
        text4.setBackground(new Color(88, 125, 184).darker());

        JButton btn1 = new JButton("SUBMIT");
        btn1.setOpaque(true);
        btn1.setBackground(new Color(78, 78, 173).darker());
        btn1.setForeground(Color.WHITE);
        btn1.setBorder(border);

        label.setBounds(200, 0, 200, 50);
        l1.setBounds(10, 50, 200, 50);
        l2.setBounds(10, 100, 200, 50);
        l3.setBounds(400, 100, 200, 50);
        l4.setBounds(10, 200, 200, 50);

        text1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        text1.setBounds(100, 65, 500, 25);
        text2.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        text2.setBounds(100, 115, 100, 25);
        text3.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        text3.setBounds(500, 115, 100, 25);
        text4.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        text4.setBounds(100, 215, 100, 25);

        btn1.setBounds(500, 350, 150, 30);

        jp.add(label);
        jp.add(l1);
        jp.add(l2);
        jp.add(l3);
        jp.add(l4);

        jp.add(text1);
        jp.add(text2);
        jp.add(text3);
        jp.add(text4);

        jp.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String name = text1.getText();
                String check_in = text2.getText();
                String noDays = text3.getText();
                String room = text4.getText();
                String status = "";
                if(name == null || check_in == null || noDays == null || room == null){
                    System.out.println("Please fill all the data");
                    JOptionPane.showMessageDialog(null, "Records are left empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
                        Statement smt = conn.createStatement();
                        ResultSet res = smt.executeQuery("select * from room_status where room_no = "+room+"");
                        while(res.next()){
                            status = res.getString(3);
                        }
                        if(status == "not available" || status == "reserved"){
                            System.out.println("Cannot place reservation the room is already taken!");
                            JOptionPane.showMessageDialog(null, "Rooms are already taken", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            smt.executeUpdate("insert into customer (cus_name, reservation_date, room_no, no_days) values ('"+name+"', '"+check_in+"', "+room+", "+noDays+")");
                            smt.executeUpdate("update room_status set status = 'reserved' where room_no = "+room+"");
                            JOptionPane.showMessageDialog(null, "Record Fill Successfully", "Success", JOptionPane.WARNING_MESSAGE);
                            text1.setText("");
                            text2.setText("");
                            text3.setText("");
                            text4.setText("");
                            conn.close();
                        }
                    } catch (Exception error) {
                        //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("You are not Connected with the server"+error);
                    }
    
                    
                }
                
            }
        });
        jp.setBounds(240, 240, 1000, 1280);
        jp.setLayout(null);
        return jp;
    }

    public JPanel addBill() {
        Border border = BorderFactory.createLineBorder(new Color(88, 125, 184, 10).darker());
        JPanel jp = new JPanel();
        jp.setBackground(new Color(56, 55, 52));

        JLabel label = new JLabel("BILLS");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("TimesRoman", Font.PLAIN, 16));

        JLabel l1 = new JLabel("NAME");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JLabel l2 = new JLabel("PAYMENT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JLabel l3 = new JLabel("CHECK OUT");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JLabel l4 = new JLabel("ROOM NO");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("TimesRoman", Font.PLAIN, 16));

        JTextField text1 = new JTextField();
        text1.setForeground(Color.WHITE);
        text1.setBackground(new Color(88, 125, 184).darker());
        JTextField text2 = new JTextField();
        text2.setForeground(Color.WHITE);
        text2.setBackground(new Color(88, 125, 184).darker());
        JTextField text3 = new JTextField();
        text3.setForeground(Color.WHITE);
        text3.setBackground(new Color(88, 125, 184).darker());
        JTextField text4 = new JTextField();
        text4.setForeground(Color.WHITE);
        text4.setBackground(new Color(88, 125, 184).darker());

        JButton btn1 = new JButton("SUBMIT");
        btn1.setOpaque(true);
        btn1.setBackground(new Color(78, 78, 173).darker());
        btn1.setForeground(Color.WHITE);
        btn1.setBorder(border);

        label.setBounds(200, 0, 200, 50);
        l1.setBounds(10, 50, 200, 50);
        l2.setBounds(10, 100, 200, 50);
        l3.setBounds(400, 100, 200, 50);
        l4.setBounds(10, 200, 200, 50);

        text1.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        text1.setBounds(100, 65, 500, 25);
        text2.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        text2.setBounds(100, 115, 100, 25);
        text3.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        text3.setBounds(500, 115, 100, 25);
        text4.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        text4.setBounds(100, 215, 100, 25);

        btn1.setBounds(500, 350, 150, 30);

        jp.add(label);
        jp.add(l1);
        jp.add(l2);
        jp.add(l3);
        jp.add(l4);

        jp.add(text1);
        jp.add(text2);
        jp.add(text3);
        jp.add(text4);

        jp.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String name = text1.getText();
                String payment = text2.getText();
                String check_out = text3.getText();
                String room = text4.getText();
                String amount = "";
                String status = "";
                if(name == null || payment == null || check_out == null || room == null){
                    System.out.println("Please fill all the data");
                    JOptionPane.showMessageDialog(null, "Records are left empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
                        Statement smt = conn.createStatement();
                        ResultSet res = smt.executeQuery("select * from room_status where room_no = "+room+"");
                        while(res.next()){
                            amount = res.getString(2);
                            status = res.getString(3);
                        }
                        if(status == "available" || status == "reserved"){
                            JOptionPane.showMessageDialog(null, "The Room is empty", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            smt.executeUpdate("insert into bill (date, customer_name, room_no, amount, payment) values ('"+check_out+"', '"+name+"', "+room+", "+amount+", '"+payment+"')");
                            smt.executeUpdate("update room_status set status = 'available' where room_no = "+room+"");
                            JOptionPane.showMessageDialog(null, "Record Fill Successfully", "Success", JOptionPane.WARNING_MESSAGE);
                            conn.close();
                        }
                    } catch (Exception error) {
                        //JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("You are not Connected with the server"+error);
                    }
    
                    text1.setText("");
                    text2.setText("");
                    text3.setText("");
                    text4.setText("");
                }
                
            }
        });
        jp.setBounds(240, 240, 1000, 1280);
        jp.setLayout(null);
        return jp;
    }
}
