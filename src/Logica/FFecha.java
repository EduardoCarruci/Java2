package Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class FFecha {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";

    public DefaultTableModel mostrarFechaActual(String buscar) {
        DefaultTableModel MODELO;
        String[] titulos = {"Monto", "Campo"};
        String[] registro = new String[2];

        MODELO = new DefaultTableModel(null, titulos);

        sSQL = "select sum(Monto),count(*)"
                + "from venta where Fecha_De_Venta='" + buscar + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = rs.getString("sum(Monto)");
                registro[1] = rs.getString("count(*)");
                System.out.println(buscar);
                System.out.println(registro[0]);
                System.out.println(registro[1]);

                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {

            System.out.println(e);
            return null;
        }
    }
}
