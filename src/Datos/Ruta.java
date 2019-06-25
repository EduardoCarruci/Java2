package Datos;

import java.sql.Time;

public class Ruta {

    private int Codigo;
    private int Precio;
    private String Salida;
    private String Destino;
    private Time Horario;
    private String Buses;
    private int Chofer;

    public Ruta() {

    }

    public Ruta(int Codigo, int Precio, String Salida, String Destino, Time Horario, String Buses, int Chofer) {
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Salida = Salida;
        this.Destino = Destino;
        this.Horario = Horario;
        this.Buses = Buses;
        this.Chofer = Chofer;
    }

    public int getChofer() {
        return Chofer;
    }

    public void setChofer(int Chofer) {
        this.Chofer = Chofer;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getSalida() {
        return Salida;
    }

    public void setSalida(String Salida) {
        this.Salida = Salida;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public Time getHorario() {
        return Horario;
    }

    public void setHorario(Time Horario) {
        this.Horario = Horario;
    }

    public String getBuses() {
        return Buses;
    }

    public void setBuses(String Buses) {
        this.Buses = Buses;
    }

}
