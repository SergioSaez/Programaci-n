package Datos;

import java.util.ArrayList;

public class Piloto {
    private String codigoPiloto;
    private String nombre;
    private String apellido;
    private ArrayList<Piloto> listaPilotos;

    public Piloto(String codigoPiloto, String nombre, String apellido, ArrayList<Piloto> listaPilotos) {
        this.codigoPiloto = codigoPiloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaPilotos = listaPilotos;
    }

    public String getCodigoPiloto() {
        return codigoPiloto;
    }

    public void setCodigoPiloto(String codigoPiloto) {
        this.codigoPiloto = codigoPiloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Piloto> getListaPilotos() {
        return listaPilotos;
    }

    public void setListaPilotos(ArrayList<Piloto> listaPilotos) {
        this.listaPilotos = listaPilotos;
    }
    
    public void agregar_nuevo (){}
    public void asignar_vuelo (){}
    public void cancelar_vuelo(){}
    public void modificar () {}
    public Piloto obtener (){return null;}
}
