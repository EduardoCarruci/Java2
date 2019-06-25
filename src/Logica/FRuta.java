package Logica;

import Datos.Ruta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FRuta {

 
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = ""; 
    public Integer totalregistros; 

    public DefaultTableModel mostrar(String buscar) {
       
        DefaultTableModel MODELO;
        String[] titulos = {"Codigo", "Precio", "Salida", "Destino", "Horario", "Buses", "Chofer"}; 
        String[] registro = new String[7]; 
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
      
        sSQL = "select r.Codigo,r.Precio,r.Salida,r.Destino,r.Horario,"
                + "(select Placa from buses where Placa=r.Buses)as Buses,"
                + "(select Cedula from chofer where Cedula=r.Chofer)as cedulaC from ruta r inner join buses b on r.Buses=b.Placa where Codigo like '%" + buscar + "%' order by Precio desc";
      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Codigo");
                registro[1] = rs.getString("Precio");
                registro[2] = rs.getString("Salida");
                registro[3] = rs.getString("Destino");
                registro[4] = rs.getString("Horario");
                registro[5] = rs.getString("Buses");
                registro[6] = rs.getString("cedulaC");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {

            System.out.println(e);
            return null;
        }
    }

    public boolean insertar(Ruta datos) {
        sSQL = "insert into ruta (Codigo,Precio,Salida,Destino,Horario,Buses,Chofer)"
                + "values (?,?,?,?,?,?,?)";
       
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCodigo());
            pst.setInt(2, datos.getPrecio());
            pst.setString(3, datos.getSalida());
            pst.setString(4, datos.getDestino());
            pst.setTime(5, datos.getHorario());
            pst.setString(6, datos.getBuses());
            pst.setInt(7, datos.getChofer());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique el Codigo ");
            return false;
        }

    }

    public boolean editar(Ruta datos) {
        
        sSQL = "update ruta set Codigo=?,Precio=?, Salida=?,Destino=?,Horario=?,Buses=?,Chofer=? where Codigo=Codigo";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCodigo());
            pst.setInt(2, datos.getPrecio());
            pst.setString(3, datos.getSalida());
            pst.setString(4, datos.getDestino());
            pst.setTime(5, datos.getHorario());
            pst.setString(6, datos.getBuses());
            pst.setInt(7, datos.getChofer());
            System.out.println(datos.getHorario());

            int n = pst.executeUpdate();
            if (n != 0) {

                return true;
            } else {

                return false;
            }

        } catch (Exception e) {
            System.out.println("catch");
            System.out.println(e);

            return false;
        }

    }

 
    public boolean eliminar(Ruta datos) {

        sSQL = "delete from ruta where Codigo=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCodigo());

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
        String[] titulos = {"Codigo", "Precio", "Salida", "Destino", "Horario", "Buses", "Chofer"};
        String[] registro = new String[7];
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select r.Codigo,r.Precio,r.Salida,r.Destino,r.Horario,"
                + "(select Placa from buses where Placa=r.Buses)as Buses,"
                + "(select Cedula from chofer where Cedula=r.Chofer)as cedulaC from ruta r inner join buses b on r.Buses=b.Placa where Codigo like '%" + buscar + "%' order by Precio desc";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Codigo");
                registro[1] = rs.getString("Precio");
                registro[2] = rs.getString("Salida");
                registro[3] = rs.getString("Destino");
                registro[4] = rs.getString("Horario");
                registro[5] = rs.getString("Buses");
                registro[6] = rs.getString("cedulaC");

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
