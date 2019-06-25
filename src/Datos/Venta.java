package Datos;

import java.sql.Date;

public class Venta {

    private int Codigo;
    private Date Fecha_De_Venta;
    private int Asiento_Asignado;
    private Date FechaSalida;
    private String Medio_De_Pago;
    private int Tasa_Salida;
    private int IVA;
    private int Empleado;
    private int Cliente;
    private int Ruta;
    private String NumerodeBus;
    private int Monto;

    public Venta() {

    }

    public Venta(int Codigo, Date Fecha_De_Venta, int Asiento_Asignado, Date FechaSalida, String Medio_De_Pago, int Tasa_Salida, int IVA, 
            int Empleado, int Cliente, int Ruta, String NumerodeBus, int Monto) {
        this.Codigo = Codigo;
        this.Fecha_De_Venta = Fecha_De_Venta;
        this.Asiento_Asignado = Asiento_Asignado;
        this.FechaSalida = FechaSalida;

        this.Medio_De_Pago = Medio_De_Pago;
        this.Tasa_Salida = Tasa_Salida;
        this.IVA = IVA;
        this.Empleado = Empleado;
        this.Cliente = Cliente;
        this.Ruta = Ruta;
        this.NumerodeBus = NumerodeBus;
        this.Monto = Monto;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public Date getFecha_De_Venta() {
        return Fecha_De_Venta;
    }

    public void setFecha_De_Venta(Date Fecha_De_Venta) {
        this.Fecha_De_Venta = Fecha_De_Venta;
    }

    public int getAsiento_Asignado() {
        return Asiento_Asignado;
    }

    public void setAsiento_Asignado(int Asiento_Asignado) {
        this.Asiento_Asignado = Asiento_Asignado;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getNumerodeBus() {
        return NumerodeBus;
    }

    public void setNumerodeBus(String NumerodeBus) {
        this.NumerodeBus = NumerodeBus;
    }

    public String getMedio_De_Pago() {
        return Medio_De_Pago;
    }

    public void setMedio_De_Pago(String Medio_De_Pago) {
        this.Medio_De_Pago = Medio_De_Pago;
    }

    public int getTasa_Salida() {
        return Tasa_Salida;
    }

    public void setTasa_Salida(int Tasa_Salida) {
        this.Tasa_Salida = Tasa_Salida;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public int getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(int Empleado) {
        this.Empleado = Empleado;
    }

    public int getCliente() {
        return Cliente;
    }

    public void setCliente(int Cliente) {
        this.Cliente = Cliente;
    }

    public int getRuta() {
        return Ruta;
    }

    public void setRuta(int Ruta) {
        this.Ruta = Ruta;
    }

}
