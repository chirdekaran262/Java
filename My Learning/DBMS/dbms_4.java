import java.sql.*;
import java.util.Scanner;

public class dbms_4 {
    public static void main(String[] args) {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C//sqlite//univ");
        PreparedStatement stm=con.prepareStatement("select * from students where deptno=?");
        Scanner sc=new Scanner(System.in);
        Sys.out.println("Enter Student data: ");
        int r=sc.nextInt();
        String name=sc.next();
        String city=sc.next();
        int dno=sc.nextInt();

        stm.setInt(1, r);
        stm.setString(2, name);
        stm.setString(3, city);
        stm.setInt(4, dno);
        stm.executeUpdate();
        
        stm.close();
        con.close();
    }
}

