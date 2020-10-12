import java.awt.Color;
import java.sql.*;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
            JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            System.out.print(e);
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
            JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            System.out.print(e);
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
            JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("You are not Connected with the server");
            System.out.print(e);
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
}
