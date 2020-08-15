package resource;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *f
 * @author bayug
 */
public class Koneksi {
    
    private final String url = "jdbc:mysql://localhost/db_gudang";
    private final String uname = "root";
    private final String pswd = "";
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return java.sql.DriverManager.getConnection(url, uname, pswd);
	} catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Gagal terkoneksi, tidak bisa dilanjutkan \n -> "+ex.getMessage().toString());
            ex.printStackTrace();
            System.exit(0);
	}
        return null;
    }    
    
}
