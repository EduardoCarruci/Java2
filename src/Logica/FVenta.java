package Logica;

import Datos.Venta;
import Presentacion.Vista_Pasajeros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class FVenta {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String Consultapivote="";
    public Integer totalregistros;
    
    
    public DefaultTableModel mostrarBusquedaparaFecha(String buscar){
         DefaultTableModel MODELO;
        String[] titulos = {"Codigo", "Fecha_De_Venta", 
            "FechaSalida", "Medio_De_Pago","Empleado", "Cliente", "Ruta", "Monto"};
        String[] registro = new String[8];
        totalregistros = 0;
   
        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select v.Codigo,v.Fecha_De_Venta,v.FechaSalida,v.Medio_De_Pago,"
                + "(select Cedula from empleado where v.Empleado=Cedula)as cedulaE,"
                + "(select Cedula from cliente where Cedula=v.Cliente)as cedulaC,r.Codigo,"
                + "v.Monto from venta v inner join ruta r on v.Ruta=r.Codigo where v.Codigo like '%" + buscar + "%' order by Asiento_Asignado desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Codigo");
                registro[1] = rs.getString("Fecha_De_Venta");
                registro[2] = rs.getString("FechaSalida");
                registro[3] = rs.getString("Medio_De_Pago");
                registro[4] = rs.getString("cedulaE");
                registro[5] = rs.getString("cedulaC");
                registro[6] = rs.getString("r.Codigo"); 
                registro[7] = rs.getString("Monto");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {
            System.out.println("ESTOY ACA");

            System.out.println(e);
            return null;
        }
    }
    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel MODELO;
        String[] titulos = {"Codigo", "Fecha_De_Venta", "Asiento_Asignado",
            "FechaSalida", "Medio_De_Pago", "Tasa_Salida", "IVA",
            "Empleado", "Cliente", "Ruta", "NumerodeBus", "Monto"};
        String[] registro = new String[12];
        totalregistros = 0;
        /* sSQL = "select r.Codigo,r.Precio,r.Salida,r.Destino,r.Horario,"
                + "(select Placa from buses where Placa=r.Buses)as Buses,"
                + "(select Cedula from chofer where Cedula=r.Chofer)as cedulaC from ruta r inner join buses b on r.Buses=b.Placa where Codigo like '%" + buscar + "%' order by Precio desc";*/
        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select v.Codigo,v.Fecha_De_Venta,v.Asiento_Asignado,v.FechaSalida,v.Medio_De_Pago,v.Tasa_Salida,v.IVA,"
                + "(select Cedula from empleado where v.Empleado=Cedula)as cedulaE,"
                + "(select Cedula from cliente where Cedula=v.Cliente)as cedulaC,r.Codigo,"
                + "(select Placa from buses where Placa=r.Buses)as placaB,v.Monto from venta v inner join ruta r on v.Ruta=r.Codigo where v.Codigo like '%" + buscar + "%' order by Asiento_Asignado desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Codigo");
                registro[1] = rs.getString("Fecha_De_Venta");
                registro[2] = rs.getString("Asiento_Asignado");
                registro[3] = rs.getString("FechaSalida");
                registro[4] = rs.getString("Medio_De_Pago");
                registro[5] = rs.getString("Tasa_Salida");
                registro[6] = rs.getString("IVA");
                registro[7] = rs.getString("cedulaE");
                registro[8] = rs.getString("cedulaC");
                registro[9] = rs.getString("r.Codigo");
                registro[10] = rs.getString("placaB");
                registro[11] = rs.getString("Monto");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {
            System.out.println("ESTOY ACA");

            System.out.println(e);
            return null;
        }
    }

    public boolean insertar(Venta datos) {
        sSQL = "insert into venta (Codigo,Fecha_De_Venta,Asiento_Asignado,FechaSalida,Medio_De_Pago,Tasa_Salida,IVA,Empleado,Cliente,Ruta,NumerodeBus,Monto)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCodigo());
            pst.setDate(2, datos.getFecha_De_Venta());
            pst.setInt(3, datos.getAsiento_Asignado());
            pst.setDate(4, datos.getFechaSalida());
            pst.setString(5, datos.getMedio_De_Pago());
            pst.setInt(6, datos.getTasa_Salida());
            pst.setInt(7, datos.getIVA());
            pst.setInt(8, datos.getEmpleado());
            pst.setInt(9, datos.getCliente());
            pst.setInt(10, datos.getRuta());
            pst.setString(11, datos.getNumerodeBus());
            Double pivote = datos.getMonto() * 0.01;
            Double pivote2 = datos.getMonto() * 0.12;
            pst.setInt(12, (int) (pivote + pivote2 + datos.getMonto()));

            System.out.println(pivote + datos.getMonto() + pivote2);

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);

            System.out.println("ESTOY ACA 2");
            return false;
        }

    }

    public boolean editar(Venta datos) {

        sSQL = "update  venta set Codigo=?,Fecha_De_Venta=?,Asiento_Asignado=?,FechaSalida=?,Medio_De_Pago=?,Tasa_Salida=?,IVA=?,Empleado=?,Cliente=?,Ruta=?,NumerodeBus=?,Monto=?"
                + "where Codigo=Codigo";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCodigo());
            pst.setDate(2, datos.getFecha_De_Venta());
            pst.setInt(3, datos.getAsiento_Asignado());
            pst.setDate(4, datos.getFechaSalida());
            pst.setString(5, datos.getMedio_De_Pago());
            pst.setInt(6, datos.getTasa_Salida());
            pst.setInt(7, datos.getIVA());
            pst.setInt(8, datos.getEmpleado());
            pst.setInt(9, datos.getCliente());
            pst.setInt(10, datos.getRuta());
            pst.setString(11, datos.getNumerodeBus());
            pst.setInt(12, datos.getMonto());

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

    public boolean eliminar(Venta datos) {

        sSQL = "delete from venta where Codigo=?";

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
        String[] titulos = {"Codigo", "Fecha_De_Venta", "Asiento_Asignado",
            "FechaSalida", "Medio_De_Pago", "Tasa_Salida", "IVA",
            "Empleado", "Cliente", "Ruta", "NumerodeBus"};
        String[] registro = new String[11];
        totalregistros = 0;
        ///numero de bus e splaca reucereda
        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select v.Codigo,v.Fecha_De_Venta,v.Asiento_Asignado,v.FechaSalida,v.Medio_De_Pago,v.Tasa_Salida,v.IVA,"
                + "(select Cedula from empleado where Cedula=v.Empleado)as cedulaE,"
                + "(select Cedula from cliente where Cedula=v.Cliente)as cedulaC,"
                + "(selec Codigo from ruta where Codigo=v.Ruta)as codigoR,"
                + "(select Placa from buses where Placa=r.Buses)as placaB from venta vinner join ruta r on v.Ruta=r.Codigo where v.Codigo like '%" + buscar + "%' order by v.IVA desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Codigo");
                registro[1] = rs.getString("Fecha_De_Venta");
                registro[2] = rs.getString("Asiento_Asignado");
                registro[3] = rs.getString("FechaSalida");
                registro[4] = rs.getString("Medio_De_Pago");
                registro[5] = rs.getString("Tasa_Salida");
                registro[6] = rs.getString("IVA");
                registro[7] = rs.getString("cedulaE");
                registro[8] = rs.getString("cedulaC");
                registro[9] = rs.getString("codigoR");
                registro[10] = rs.getString("placaB");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {

            System.out.println(e);
            return null;
        }
    }

    public DefaultTableModel mostrarBoleto(String buscar) {
        DefaultTableModel MODELO;
        String[] titulos = {"Codigo", "Fecha_De_Venta", "FechaSalida",
            "Monto", "Cedula", "Horario", "Salida",
            "Destino", "Medio_De_Pago", "Asiento_Asignado", "NumerodeBus"};
        String[] registro = new String[12];
        totalregistros = 0;
        ///numero de bus e splaca reucereda
        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select v.Codigo,v.Fecha_De_Venta,v.FechaSalida,v.Monto,(select Cedula from cliente where v.Cliente=Cedula)as cedulaCliente,r.Horario,r.Salida,r.Destino,"
                + "v.Medio_De_Pago,v.Asiento_Asignado,"
                + "(select NumerodeBus from Buses where r.Buses=Placa)as NumeroBus from venta v inner join ruta r on v.Ruta=r.Codigo";
        //where Fecha_De_Venta='"+buscar+"'"             like '%" + buscar + "%'
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Codigo");
                registro[1] = rs.getString("Fecha_De_Venta");
                registro[2] = rs.getString("FechaSalida");
                registro[3] = rs.getString("Monto");
                registro[4] = rs.getString("cedulaCliente");
                registro[5] = rs.getString("Horario");
                registro[6] = rs.getString("Salida");
                registro[7] = rs.getString("Destino");
                registro[8] = rs.getString("Medio_De_Pago");
                registro[9] = rs.getString("Asiento_Asignado");
                registro[10] = rs.getString("NumeroBus");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {

            System.out.println(e);
            return null;
        }
    }

    public DefaultTableModel mostrarHistoricoCliente(String buscar) {
        DefaultTableModel MODELO;
        String[] titulos = {"Codigo", "Fecha_De_Venta", "FechaSalida",
            "Monto", "Cedula", "Horario", "Salida",
            "Destino", "Medio_De_Pago", "Asiento_Asignado", "NumerodeBus"};
        String[] registro = new String[12];
        totalregistros = 0;
        ///numero de bus e splaca reucereda
        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select v.Codigo,v.Fecha_De_Venta,v.FechaSalida,v.Monto,(select Cedula from cliente where v.Cliente=Cedula)as cedulaCliente,r.Horario,r.Salida,r.Destino,"
                + "v.Medio_De_Pago,v.Asiento_Asignado,"
                + "(select NumerodeBus from Buses where r.Buses=Placa)as NumeroBus from venta v inner join ruta r on v.Ruta=r.Codigo where v.Cliente='" + buscar + "' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("Codigo");
                registro[1] = rs.getString("Fecha_De_Venta");
                registro[2] = rs.getString("Asiento_Asignado");
                registro[3] = rs.getString("FechaSalida");
                registro[4] = rs.getString("Monto");
                registro[5] = rs.getString("cedulaCliente");
                registro[6] = rs.getString("Horario");
                registro[7] = rs.getString("Salida");
                registro[8] = rs.getString("Destino");
                registro[9] = rs.getString("Medio_De_Pago");
                registro[10] = rs.getString("Asiento_Asignado");
                registro[11] = rs.getString("NumeroBus");

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {

            System.out.println(e);
            return null;
        }
    }
    public void Asignar_Codigo(String Destino, String Salida, String Fecha, String Horario)
    {
        String[] registroPivote = new String[1];
        Consultapivote = "select r.Codigo from venta v inner join ruta r on v.Ruta=r.Codigo where r.Destino='" + Destino + "' "
                + "and r.Salida='" + Salida + "' "
                + "and v.FechaSalida='" + Fecha + "' "
                + "and r.Horario='" + Horario + "' ";
        
        
          try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Consultapivote);
        
             while (rs.next()) {
                registroPivote[0] = rs.getString("r.Codigo");
                
               

            }
           Vista_Pasajeros.Label_Codigo.setText(registroPivote[0]);
        
        } catch (Exception e) {

            System.out.println(e);
        
        }
        
        
                
            }
    public DefaultTableModel mostrarPasajeros(String Destino, String Salida, String Fecha, String Horario) {
        DefaultTableModel MODELO;
        String[] titulos = {"Cedula", "Nombre", "Apellido"};
        String[] registro = new String[3];
        totalregistros = 0;
       
        
        String[] registroPivote = new String[1];

        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select v.Cliente," //v.Cliente='" + buscar + "' "
                + "(select Nombre from cliente where v.Cliente=Cedula)as Cnombre,"
                + "(select Apellido from cliente where v.Cliente=Cedula)as Capellido "
                + "from venta v inner join ruta r on v.Ruta=r.Codigo where r.Destino='" + Destino + "' "
                + "and r.Salida='" + Salida + "' "
                + "and v.FechaSalida='" + Fecha + "' "
                + "and r.Horario='" + Horario + "' ";
        

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            /*
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st.executeQuery(Consultapivote);
            */

            while (rs.next()) {
                registro[0] = rs.getString("Cliente");
                registro[1] = rs.getString("Cnombre");
                registro[2] = rs.getString("Capellido");
               // registroPivote[0] =rs.getString("v.Codigo");
                totalregistros++;
                MODELO.addRow(registro);

            }
           // Vista_Pasajeros.Label_Codigo.setText(registroPivote[0]);
            return MODELO;
        } catch (Exception e) {

            System.out.println(e);
            return null;
        }
    }
  public DefaultTableModel mostrarTotalVenta_Fecha(String Fecha1, String Fecha2) {
        DefaultTableModel MODELO;
        String[] titulos = {"Monto Total"};
        String[] registro = new String[3];
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select sum(Monto) from venta  where Fecha_De_Venta between '"+Fecha1+"' and '"+Fecha2+"' ";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("sum(Monto)");
              

                totalregistros++;
                MODELO.addRow(registro);

            }
            return MODELO;
        } catch (Exception e) {

            System.out.println(e);
            return null;
        }
    }

    public DefaultTableModel mostrarTasaSalida(String Fecha1, String Fecha2) {
        DefaultTableModel MODELO;
        String[] titulos = {"Monto Total"};
        String[] registro = new String[3];
        totalregistros = 0;

        MODELO = new DefaultTableModel(null, titulos);
        sSQL = "select sum(v.Tasa_Salida) from venta v  where Fecha_De_Venta between '"+Fecha1+"' and '"+Fecha2+"' ";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("sum(v.Tasa_Salida)");
              

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
