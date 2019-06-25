package Datos;

public class Cliente {

    private int Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Direccion;
    private String Tarjeta;
    private String TipoTarjeta;
    public Cliente() {

    }

    public Cliente(int Cedula, String Nombre, String Apellido, String Telefono, String Direccion, String Tarjeta, String TipoTarjeta) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Tarjeta = Tarjeta;
        this.TipoTarjeta= TipoTarjeta;
    }

    public String getTipoTarjeta() {
        return TipoTarjeta;
    }

    public void setTipoTarjeta(String TipoTarjeta) {
        this.TipoTarjeta = TipoTarjeta;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(String Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

}
