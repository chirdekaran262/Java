import java.sql.*;

public class dbms_2 {
    public static void main(String[] args) {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C//sqlite//univ");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select * from students");
        while (rs.next()) {
            System.out.println(rs.getInt("roll")+" ");
            System.out.println(rs.getString("name")+" ");
            System.out.println(rs.getString("city")+" ");
            System.out.println(rs.getInt(4)+" ");
        }
        stm.close();
        con.close();
    }
}
