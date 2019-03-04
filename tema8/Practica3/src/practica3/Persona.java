
package practica3;

class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String Curso;

    public Persona(String nombre, String apellidos, String dni, String Curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.Curso = Curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    
}
