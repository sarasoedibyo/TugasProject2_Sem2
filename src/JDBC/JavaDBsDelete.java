
package JDBC;

import java.sql.*;

public class JavaDBsDelete {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Data_Mahasiswa;user=root;password=ss;encrypt=false");
            
            PreparedStatement ps = con.prepareStatement("delete from kelas where NIM = ?");
            ps.setString(1,"03");
            ps.executeUpdate();
            System.out.println("Data has been successfully Deleted");
            
        } catch (SQLException e) {
            System.out.println("Failed to Connect");
        }
    }
}
