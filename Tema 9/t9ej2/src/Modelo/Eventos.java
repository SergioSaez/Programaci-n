/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Sergio
 */
public class Eventos {
    
    int id_eventos;
    String nombre;
    String Lugar;
    LocalDate Fecha;
    LocalTime HoraInicio;
    LocalTime HoraFin;
    int Aforo;

    public Eventos(String nombre, String Lugar, LocalDate Fecha, LocalTime HoraInicio, LocalTime HoraFin, int Aforo) {
        this.nombre = nombre;
        this.Lugar = Lugar;
        this.Fecha = Fecha;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.Aforo = Aforo;
    }

    public int getId_eventos() {
        return id_eventos;
    }

    public void setId_eventos(int id_eventos) {
        this.id_eventos = id_eventos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public LocalTime getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(LocalTime HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public LocalTime getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(LocalTime HoraFin) {
        this.HoraFin = HoraFin;
    }

    public int getAforo() {
        return Aforo;
    }

    public void setAforo(int Aforo) {
        this.Aforo = Aforo;
    }
    
    
}

