
package JDBC;

import java.sql.*;

public class JavaDBsUpdate {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Data_Mahasiswa;user=root;password=ss;encrypt=false");
            
            PreparedStatement ps = con.prepareStatement("update kelas set Jurusan = ? where NIM = ?");
            ps.setString(1,"DCM");
            ps.setString(2,"02");
            ps.executeUpdate();
            System.out.println("Data has been successfully Updated");

        } catch (SQLException e) {
            System.out.println("Failed to Connect");
        }
    }
}