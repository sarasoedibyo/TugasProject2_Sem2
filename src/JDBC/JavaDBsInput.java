
package JDBC;

import java.sql.*;

public class JavaDBsInput {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Data_Mahasiswa;user=root;password=ss;encrypt=false");
            
            PreparedStatement ps = con.prepareStatement("insert into Kelas values(?,?,?)");
            ps.setString(1,"03");
            ps.setString(2,"Chantika");
            ps.setString(3,"ITE");
            ps.executeUpdate();
            System.out.println("Data has been successfully Inputed");

        } catch (SQLException e) {
            System.out.println("Failed to Connect");
        }
    }
}