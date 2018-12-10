package Datos;

public class datos {
    private String nombre;
    private String dNacimiento;
    private String mNacimiento;
    private String aNacimiento;
    private String dirección;
    private String codigo_postal;
    private String ciudad;

    public datos(String nombre, String dNacimiento, String mNacimiento, String aNacimiento, String dirección, String codigo_postal, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
        this.dirección = dirección;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(String dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public String getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(String mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public String getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
