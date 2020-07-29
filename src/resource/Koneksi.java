package resource;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *f
 * @author bayug
 */
public class Koneksi {
    ConfigApp conf = new ConfigApp();
    
    private final String url = "jdbc:mysql://"+conf.getDbHost()+"/"+conf.getDbName();
    private final String uname = conf.getDbUname();
    private final String pswd = conf.getDbPass();
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
