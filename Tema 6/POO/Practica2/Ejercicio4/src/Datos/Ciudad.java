package Datos;

import java.util.ArrayList;

public class Ciudad {
    private String CodigoCiudad;
    private String Nombre;
    private ArrayList <Vuelo> listaVuelos;

    public Ciudad(String CodigoCiudad, String Nombre, ArrayList<Vuelo> vuelo) {
        this.CodigoCiudad = CodigoCiudad;
        this.Nombre = Nombre;
        this.listaVuelos = vuelo;
    }
    
    public String getCodigoCiudad() {
        return CodigoCiudad;
    }

    public void setCodigoCiudad(String CodigoCiudad) {
        this.CodigoCiudad = CodigoCiudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Vuelo> getVuelo() {
        return listaVuelos;
    }

    public void setVuelo(ArrayList<Vuelo> vuelo) {
        this.listaVuelos = vuelo;
    }
    public void agregar_nuevo(){}
    public Ciudad obtener (){return null;}
}