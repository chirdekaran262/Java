import java.sql.*;

class dbms_1 {
    public static void main(String[] args) {
        Class.forName("Org.sqlite.JDBC");
        Connection c=DriverManager.getConnection("jdbc:sqlite:univ.db");
        Statement s=c.createStatement();
        ResultSet rs=s.executeQuery("select * from dept");
        int dno;
        String dname;
        while (rs.next()) {
            dno=rs.getInt("deptno");
            dname=rs.getString("dname");
            System.out.print(dno+" "+dname);
        }
    }
}
