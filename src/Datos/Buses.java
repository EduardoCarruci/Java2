package Datos;

public class Buses {

    private String Placa;
    private String modelo;
    private int Num_asientos;
    private int Año;
   
    private int NumerodeBus;

    public Buses() {

    }

    public Buses(String Placa, String modelo, int Num_asientos, int Año, int NumerodeBus) {
        this.Placa = Placa;
        this.modelo = modelo;
        this.Num_asientos = Num_asientos;
        this.Año = Año;
      
        this.NumerodeBus = NumerodeBus;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNum_asientos() {
        return Num_asientos;
    }

    public void setNum_asientos(int Num_asientos) {
        this.Num_asientos = Num_asientos;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getNumerodeBus() {
        return NumerodeBus;
    }

    public void setNumerodeBus(int NumerodeBus) {
        this.NumerodeBus = NumerodeBus;
    }

}
