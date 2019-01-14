package Datos;

public class Asiento {
    private int numeroAsiento;
    private boolean estado;
    private String compartimento;
    private Pasajero Pasajero;
    private Vuelo vuelo;

    public Asiento(int numeroAsiento, boolean estado, String compartimento, Pasajero Pasajero, Vuelo vuelo) {
        this.numeroAsiento = numeroAsiento;
        this.estado = estado;
        this.compartimento = compartimento;
        this.Pasajero = Pasajero;
        this.vuelo = vuelo;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }

    public Pasajero getPasajero() {
        return Pasajero;
    }

    public void setPasajero(Pasajero Pasajero) {
        this.Pasajero = Pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    public void reservar(){}
    public void comprar(){}
    public boolean mostrar_disponibilidad(){return false;}
    public void desbloquear (){}
}
