import java.sql.*;

class Test{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_management", "root", "");
            Statement smt = conn.createStatement();
            ResultSet res = smt.executeQuery("select * from room_status");
            while(res.next()){
                System.out.println(res.getString(1)+"\t"+res.getString(2)+"\t"+res.getString(3));
            }
            conn.close();
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}