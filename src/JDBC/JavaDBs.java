
package JDBC;

import java.sql.*;

public class JavaDBs {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Data_Mahasiswa;user=root;password=ss;encrypt=false");
            
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("select * from kelas");
            while(rs.next())
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                con.close();
            System.out.println("User connected");
        } catch (SQLException e) {
            System.out.println("Failed to Connect");
        }
    }
}
