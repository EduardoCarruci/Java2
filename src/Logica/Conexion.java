package Logica;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Conexion {
   
    public String db = "mydb";
   
    public String url = "jdbc:mysql://localhost:3306/mydb";

    public String users = "root";
    public String password = "";

    public Conexion() {
    }

    public Connection conectar() {

        Connection link = null;

        try {
            
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.users, this.password);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return link;

    }
}
