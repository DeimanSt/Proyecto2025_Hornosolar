package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBDD {
    Connection con = null;

    public Connection conectar() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contol_hornos", "root", "");
            JOptionPane.showMessageDialog(null, "conexión establecida");
        
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error de conexión: " + e);
        }
        
        return con;
    }
}
