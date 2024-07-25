import java.sql.*;
import java.util.Scanner;

public class dbms_5 {
    public static void main(String[] args) {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C//sqlite//univ");
        Statement stm=con.createStatement();
       
        stm.executeUpdate("drop table Temp");
        
        stm.close();
        con.close();
    }
}

