package Datos;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
    private int NumeroVuelo;
    private String HoraSalida;
    private String HoraLlegada;
    private String LugarOrigen;
    private String LugarDestino;
    private Date FechaSalida;
    private Date FechaRegreso;
    private String TipoVuelo;
    private Avion avion;
    private Ciudad ciudad;
    private Pasajero pasajero;
    private ArrayList <Asiento> listaAsientos;
    private Piloto piloto;

    public Vuelo(int NumeroVuelo, String HoraSalida, String HoraLlegada, String LugarOrigen, String LugarDestino, Date FechaSalida, Date FechaRegreso, String TipoVuelo, Avion avion, Ciudad ciudad, Pasajero pasajero, ArrayList<Asiento> listaAsientos, Piloto piloto) {
        this.NumeroVuelo = NumeroVuelo;
        this.HoraSalida = HoraSalida;
        this.HoraLlegada = HoraLlegada;
        this.LugarOrigen = LugarOrigen;
        this.LugarDestino = LugarDestino;
        this.FechaSalida = FechaSalida;
        this.FechaRegreso = FechaRegreso;
        this.TipoVuelo = TipoVuelo;
        this.avion = avion;
        this.ciudad = ciudad;
        this.pasajero = pasajero;
        this.listaAsientos = listaAsientos;
        this.piloto = piloto;
    }

    public int getNumeroVuelo() {
        return NumeroVuelo;
    }

    public void setNumeroVuelo(int NumeroVuelo) {
        this.NumeroVuelo = NumeroVuelo;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String HoraLlegada) {
        this.HoraLlegada = HoraLlegada;
    }

    public String getLugarOrigen() {
        return LugarOrigen;
    }

    public void setLugarOrigen(String LugarOrigen) {
        this.LugarOrigen = LugarOrigen;
    }

    public String getLugarDestino() {
        return LugarDestino;
    }

    public void setLugarDestino(String LugarDestino) {
        this.LugarDestino = LugarDestino;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public Date getFechaRegreso() {
        return FechaRegreso;
    }

    public void setFechaRegreso(Date FechaRegreso) {
        this.FechaRegreso = FechaRegreso;
    }

    public String getTipoVuelo() {
        return TipoVuelo;
    }

    public void setTipoVuelo(String TipoVuelo) {
        this.TipoVuelo = TipoVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public ArrayList<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    public void reservar (){}
    public void modificar (){}
    public void eliminar (){}
    public Vuelo buscar (){return null;}
}
