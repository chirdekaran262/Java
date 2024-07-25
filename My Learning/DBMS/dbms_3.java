import java.sql.*;
import java.util.Scanner;

public class dbms_2 {
    public static void main(String[] args) {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C//sqlite//univ");
        PreparedStatement stm=con.prepareStatement("select * from students where deptno=?");
        Scanner sc=new Scanner(System.in);
        int dno=sc.nextInt();
        stm.setInt(1, dno);
        ResultSet rs=stm.executeQuery();
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

