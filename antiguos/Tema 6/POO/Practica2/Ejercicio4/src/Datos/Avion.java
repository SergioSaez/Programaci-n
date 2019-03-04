package Datos;

import java.util.ArrayList;

public class Avion {
    private String aerolinia;
    private String codigoAvion;
    private int numeroAsientos;
    private String compartimentos;
    private ArrayList<Vuelo>listaVuelos;

    public Avion(String aerolinia, String codigoAvion, int numeroAsientos, String compartimentos, ArrayList<Vuelo> listaVuelos) {
        this.aerolinia = aerolinia;
        this.codigoAvion = codigoAvion;
        this.numeroAsientos = numeroAsientos;
        this.compartimentos = compartimentos;
        this.listaVuelos = listaVuelos;
    }

    public String getAerolinia() {
        return aerolinia;
    }

    public void setAerolinia(String aerolinia) {
        this.aerolinia = aerolinia;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    public void asignarVuelo(){}
    public Avion obtener (){return null;}
    public void cancelarVuelo(){}
}
