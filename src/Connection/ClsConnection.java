package Connection;

import java.sql.*;
import javax.swing.JOptionPane;

public class ClsConnection {

    //Variable global
    Connection CN;

    public ClsConnection() {

    }

    public Connection Connect() {

        try {
            String URL, User, Password;
            URL = "jdbc:mysqul://localhost:3306/dbtiendapedro";
            User = "root";
            Password ="";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            CN = DriverManager.getConnection(URL, User, Password);
            if (CN != null){
                JOptionPane.showMessageDialog(null, "Connection succecfull");
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Connection Error"+e.getLocalizedMessage());
        }
        return CN;
    }

}
