package Database;
//import java.sql.*;
import java.sql.*;
import javax.swing.JTextField;





public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getConnection() throws SQLException{
        String db = "jdbc:mysql://localhost/db_mahasiswa";
        String user = "root";
        String pass = "";
        if(koneksi == null){
            koneksi = DriverManager.getConnection(db, user, pass);
        }
        return koneksi;
    }
}
