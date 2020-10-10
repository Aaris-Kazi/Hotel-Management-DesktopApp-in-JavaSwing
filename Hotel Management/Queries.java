import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Queries{
    public JPanel showroom() {
        JPanel jp = new JPanel();
        String column[]={"Room No","Price","Status"};   
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        JTable jt = new JTable();
        jt.setModel(model);
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

                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);

            }
            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                System.out.println(i + " Records Found");

            }
            conn.close();
        } catch (Exception e) {
            System.out.println("You are not Connected with the server");
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //JPanel jp = new JPanel();
        JScrollPane scroll = new JScrollPane(jt);
        jp.add(scroll);
        jp.setBounds(240, 240, 500, 1280);
        return jp;
        //setLayout(null);
        //jf.setDefaultCloseOperation(2);
        
    }
}
