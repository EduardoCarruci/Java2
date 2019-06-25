package Logica;

import Datos.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class FCliente {

    //para crear la instancia de conexion " clase " 
    private Conexion mysql = new Conexion();

    // hace la conexion con la clase
    private Connection cn = mysql.conectar();

    //variable para la conexion 
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel MODELO;

        String[] titulos = {"Cedula", "Nombre", "Apellido", "Telefono", "Direccion", "Tarjeta","TipoTarjeta"};
        String[] registro = new String[7];

        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        //instruccion sql      tabla  filtro por cedula   concantenar con cedula " buscar y ordena por nombre " 
        sSQL = "select * from cliente where Cedula like '%" + buscar + "%' order by Nombre";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Apellido");
                registro[3] = rs.getString("Telefono");
                registro[4] = rs.getString("Direccion");
                registro[5] = rs.getString("Tarjeta");
                registro[6] = rs.getString("TipoTarjeta");
                //rellenar LA CASILLA TDC O TDD
                // registro[6] = rs.getString("Cedula");
                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //importando la clase cliente
    public boolean insertar(Cliente datos) {
        sSQL = "insert into cliente (Cedula,Nombre,Apellido,Telefono,Direccion,Tarjeta,TipoTarjeta)"
                + "values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCedula());
            pst.setString(2, datos.getNombre());
            pst.setString(3, datos.getApellido());
            pst.setString(4, datos.getTelefono());
            pst.setString(5, datos.getDireccion());
            pst.setString(6, datos.getTarjeta());
            pst.setString(7, datos.getTipoTarjeta());

            //resultado de la ejecucion del statement
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

    public boolean editar(Cliente datos) {
        //actualizar x cedula LO HICEEEEEEEEEEEEEEEEEEE
        sSQL = "update  cliente set Cedula=?,Nombre=?,Apellido=?,Telefono=?,Direccion=?,Tarjeta=?,TipoTarjeta=?"
                + "where Cedula=Cedula";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCedula());
            pst.setString(2, datos.getNombre());
            pst.setString(3, datos.getApellido());
            pst.setString(4, datos.getTelefono());
            pst.setString(5, datos.getDireccion());
            pst.setString(6, datos.getTarjeta());
            pst.setString(7, datos.getTipoTarjeta());
            System.out.println("ESTOY ACA");
            //resultado de la ejecucion del statement
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

    public boolean eliminar(Cliente datos) {
        // eliminar por cedula
        sSQL = "delete from cliente where Cedula=?";

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
    
    public DefaultTableModel mostrarClientes(){
        DefaultTableModel MODELO;
        String[] titulos = {"Cedula"};
        String[] registro = new String[1];
         totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        //instruccion sql      tabla  filtro por cedula   concantenar con cedula " buscar y ordena por nombre " 
        sSQL = "select Cedula from cliente   order by Cedula asc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
               
                
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

        String[] titulos = {"Cedula", "Nombre", "Apellido", "Telefono", "Direccion", "Tarjeta","TipoTarjeta"};
        String[] registro = new String[7];

        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        //instruccion sql      tabla  filtro por cedula   concantenar con cedula " buscar y ordena por nombre " 
        sSQL = "select * from cliente where Cedula like '%" + buscar + "%' order by Nombre";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Apellido");
                registro[3] = rs.getString("Telefono");
                registro[4] = rs.getString("Direccion");
                registro[5] = rs.getString("Tarjeta");
                registro[6] = rs.getString("TipoTarjeta");
                
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
