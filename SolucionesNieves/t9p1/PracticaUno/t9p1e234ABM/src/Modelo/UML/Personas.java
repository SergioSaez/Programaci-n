package Modelo.UML;

public class Personas {
    private String nombrePersonas;
    private String dni;

    
    public Personas(String nombrePersonas, String dni, String empresa) {
        this.nombrePersonas = nombrePersonas;
        this.dni = dni;
    }

    public String getNombrePersonas() {
        return nombrePersonas;
    }

    public void setNombrePersonas(String nombrePersonas) {
        this.nombrePersonas = nombrePersonas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
