package Logica;

import Datos.Chofer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FChofer {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel MODELO;

        String[] titulos = {"Cedula", "Nombre", "Apellido", "Telefono", "Direccion", "Compañia"};
        String[] registro = new String[6];
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from chofer where Cedula like '%" + buscar + "%' order by Nombre";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Apellido");
                registro[3] = rs.getString("Telefono");
                registro[4] = rs.getString("Direccion");
                registro[5] = rs.getString("Compañia");
                
                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Cedula del chofer duplicada");
            return null;
        }
    }


    public boolean insertar(Chofer datos) {
        sSQL = "insert into chofer (Cedula,Nombre,Apellido,Telefono,Direccion,Compañia)"
                + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCedula());
            pst.setString(2, datos.getNombre());
            pst.setString(3, datos.getApellido());
            pst.setString(4, datos.getTelefono());
            pst.setString(5, datos.getDireccion());
            pst.setString(6, datos.getCompañia());

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

    public boolean editar(Chofer datos) {

        sSQL = "update  chofer set Cedula=?,Nombre=?,Apellido=?,Telefono=?,Direccion=?,Compañia=?"
                + "where Cedula=Cedula";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCedula());
            pst.setString(2, datos.getNombre());
            pst.setString(3, datos.getApellido());
            pst.setString(4, datos.getTelefono());
            pst.setString(5, datos.getDireccion());
            pst.setString(6, datos.getCompañia());

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

    public boolean eliminar(Chofer datos) {
        // eliminar por cedula
        sSQL = "delete from chofer where Cedula=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCedula());

            //resultado de la ejecucion del statement
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
     public DefaultTableModel mostrarVista(String buscar) {
        DefaultTableModel MODELO;

        String[] titulos = {"Cedula", "Nombre", "Apellido", "Telefono", "Direccion", "Compañia"};
        String[] registro = new String[6];

        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from chofer where Cedula like '%" + buscar + "%' order by Nombre";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Apellido");
                registro[3] = rs.getString("Telefono");
                registro[4] = rs.getString("Direccion");
                registro[5] = rs.getString("Compañia");
           
                
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
