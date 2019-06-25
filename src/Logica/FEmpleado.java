package Logica;

import Datos.Cliente;
import Datos.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FEmpleado {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel MODELO;

        String[] titulos = {"Cedula", "Nombre", "Apellido", "Telefono", "Direccion", "Login", "Password"};
        String[] registro = new String[7];
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);

        sSQL = "select * from empleado where Cedula like '%" + buscar + "%' order by Nombre";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Apellido");
                registro[3] = rs.getString("Telefono");
                registro[4] = rs.getString("Direccion");
                registro[5] = rs.getString("Login");
                registro[6] = rs.getString("Password");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public boolean insertar(Empleado datos) {
        sSQL = "insert into empleado (Cedula,Nombre,Apellido,Telefono,Direccion,Login,Password)"
                + "values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCedula());
            pst.setString(2, datos.getNombre());
            pst.setString(3, datos.getApellido());
            pst.setString(4, datos.getTelefono());
            pst.setString(5, datos.getDireccion());
            pst.setString(6, datos.getLogin());
            pst.setString(7, datos.getPassword());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Verifique el numero de Cedula");
            return false;
        }

    }

    public boolean editar(Empleado datos) {

        sSQL = "update  empleado set Cedula=?,Nombre=?,Apellido=?,Telefono=?,Direccion=?,Login=?,Password=?"
                + "where Cedula=Cedula";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCedula());
            pst.setString(2, datos.getNombre());
            pst.setString(3, datos.getApellido());
            pst.setString(4, datos.getTelefono());
            pst.setString(5, datos.getDireccion());
            pst.setString(6, datos.getLogin());
            pst.setString(7, datos.getPassword());

            int n = pst.executeUpdate();
            if (n != 0) {

                return true;
            } else {
                System.out.println("false");
                return false;
            }

        } catch (Exception e) {
            System.out.println("catch");
            System.out.println(e);
            return false;
        }

    }

    public boolean eliminar(Empleado datos) {

        sSQL = "delete from empleado where Cedula=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCedula());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public DefaultTableModel login(String login, String password) {
        DefaultTableModel MODELO;

        String[] titulos = {"Cedula", "Nombre", "Apellido", "Login", "Password", "Telefono", "Direccion"};
        String[] registro = new String[7];
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);

        sSQL = "select Cedula,Nombre,Apellido,Login,Password,Telefono,Direccion from Empleado"
                + " where Login='"
                + login + "' and Password='" + password + "'order by Cedula desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Apellido");
                registro[3] = rs.getString("Telefono");
                registro[4] = rs.getString("Direccion");
                registro[5] = rs.getString("Login");
                registro[6] = rs.getString("Password");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public DefaultTableModel mostrarVista(String buscar) {
        DefaultTableModel MODELO;

        String[] titulos = {"Cedula", "Nombre", "Apellido", "Telefono", "Direccion", "Login", "Password"};
        String[] registro = new String[7];
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);

        sSQL = "select * from empleado where Cedula like '%" + buscar + "%' order by Nombre";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Apellido");
                registro[3] = rs.getString("Telefono");
                registro[4] = rs.getString("Direccion");
                registro[5] = rs.getString("Login");
                registro[6] = rs.getString("Password");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
