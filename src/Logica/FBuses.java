package Logica;

import Datos.Buses;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FBuses {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel MODELO;

        String[] titulos = {"Placa", "Modelo", "Num_Asientos", "Año", "NumerodeBus"};
        String[] registro = new String[5];
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select Placa,Modelo,Num_Asientos,Año,"
                + " NumerodeBus  from buses where Placa like '%" + buscar + "%' order by Año desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Placa");
                registro[1] = rs.getString("Modelo");
                registro[2] = rs.getString("Num_Asientos");
                registro[3] = rs.getString("Año");

                registro[4] = rs.getString("NumerodeBus");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {

            System.out.println(e);
            return null;
        }
    }

    public boolean insertar(Buses datos) {
        sSQL = "insert into buses (Placa,Modelo,Num_Asientos,Año,NumerodeBus)"
                + "values (?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, datos.getPlaca());
            pst.setString(2, datos.getModelo());
            pst.setInt(3, datos.getNum_asientos());
            pst.setInt(4, datos.getAño());

            pst.setInt(5, datos.getNumerodeBus());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Verifique el numero de Placa");
            return false;
        }

    }

    public boolean editar(Buses datos) {

        sSQL = "update  buses set Placa=?,Modelo=?,Num_Asientos=?,Año=?,NumerodeBus=?"
                + "where Placa=Placa";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, datos.getPlaca());
            pst.setString(2, datos.getModelo());
            pst.setInt(3, datos.getNum_asientos());
            pst.setInt(4, datos.getAño());

            pst.setInt(6, datos.getNumerodeBus());

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

    public boolean eliminar(Buses datos) {

        sSQL = "delete from buses where Placa=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, datos.getPlaca());

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

        String[] titulos = {"Placa", "Modelo", "Num_Asientos", "Año", "NumerodeBus"};
        String[] registro = new String[5];
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select Placa,Modelo,Num_Asientos,Año,"
                + " NumerodeBus  from buses where Placa like '%" + buscar + "%' order by Año desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Placa");
                registro[1] = rs.getString("Modelo");
                registro[2] = rs.getString("Num_Asientos");
                registro[3] = rs.getString("Año");

                registro[4] = rs.getString("NumerodeBus");

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
