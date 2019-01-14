
package practicanum3;

import Excepciones.*;
import Modelo.Alumno;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class PracticaNum3 {

    public static void main(String[] args) {
        try
        {
            ArrayList<Alumno> listaClase;
            listaClase = obtenerDatosAlumnos();
            buscarPorCodigo(listaClase);
        }
        catch(Exception e)
        {
            System.out.println("Problemas");
        }
    }
    
    
    public static void buscarPorCodigo(ArrayList<Alumno> lista) throws Exception{
        String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
        // Validar
        validarCodigo(codigo);
        // Buscar por código
        int x;
        for(x = 0; x < lista.size() && lista.get(x).getCodigo().equals(codigo)== false; x++){}
        if( x == lista.size())
            JOptionPane.showMessageDialog(null,"Alumno no encontrado");
        else
            JOptionPane.showMessageDialog(null,"Objeto alumno: " + lista.get(x) + "\n" + lista.get(x).toString());
            
    }
    
    public static ArrayList<Alumno> obtenerDatosAlumnos(){
        ArrayList<Alumno> lista = new ArrayList();
        do
        {
            try
            {
                String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
                validarCodigo(codigo);
                String nombre = JOptionPane.showInputDialog("Teclea el nombre del alumno");
                validarNombre(nombre);
                String domicilio = JOptionPane.showInputDialog("Teclea el domicilio del alumno");
                validarDomicilio(domicilio);
                String telefono = JOptionPane.showInputDialog("Teclea el teléfono del alumno");
                validarTelefono(telefono);
                String edad = JOptionPane.showInputDialog("Teclea la edad del alumno");
                validaredad(edad);
                String fechNac = JOptionPane.showInputDialog("Teclea la fecha de nacimiento del alumno");
                validarfechNac(fechNac);
                String email = JOptionPane.showInputDialog("Teclea el email del alumno");
                validaremail(email);
                String esCiv = JOptionPane.showInputDialog("Teclea el estado civil del alumno");
                validaresCiv(esCiv);
                Alumno a = new Alumno(codigo, nombre, domicilio, telefono, edad, fechNac, email, esCiv);
                
                lista.add(a);
            }
            catch(DatoNoValido e){
              JOptionPane.showMessageDialog(null,"El dato introducido no es correcto");
            }
            catch(Exception e)
            {
                System.out.println("Problemas");
            }
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Quieres continuar?")==0);
        return lista;
        //TODO hacer que al seleccionar no se cierre el programa
    }
    
    public static void validarCodigo(String codigo)throws Exception{
        // Cinco dígitos numéricos
        Pattern cd = Pattern.compile("^[0-9]{5}$");
        Matcher cod = cd.matcher(codigo);
        boolean error=false;
        if (cod.matches()){
            error = true;
        } else {
            error = true;
            if (error)
            throw new DatoNoValido();
        }      
    }
    
    public static void validarNombre(String nombre)throws Exception{
        
        Pattern nom = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)*$");
        Matcher nmb = nom.matcher(nombre);
        boolean error=false;
        if (nmb.matches()){
            error = true;
        } else {
            error = true;
            if (error)
            throw new DatoNoValido();
        }      
    }   
   
    public static void validarDomicilio(String domicilio)throws Exception{
        Pattern domicil = Pattern.compile("^c/([A-Z][a-z]*)+[ ][0-9]{1,3}[ ][0-9][A-Z]$");
        Matcher dm = domicil.matcher(domicilio);
        boolean error=false;
        if (dm.matches()){
            error = true;
        } else {
            error = true;
            if (error)
            throw new DatoNoValido();
        }            
    }
    
    public static void validarTelefono(String telefono) throws Exception{
        // 9 digitos numéricos empezando por 6, 7 , 8 o 9
        Pattern tel = Pattern.compile("^[6789][0-9]{8}$");
        Matcher tlf = tel.matcher(telefono);
        boolean error=false;
        if (tlf.matches()){
            error = true;
        } else {
            error = true;
            if (error)
            throw new DatoNoValido();
        }
    }
    public static void validaredad(String edad) throws Exception{
        Pattern eda = Pattern.compile("^[0-9]{1,2}$");
        Matcher ed = eda.matcher(edad);
        boolean error=false;
        if (ed.matches()){
            error = true;
        } else {
            error = true;
            if (error)
            throw new DatoNoValido();
        }
    }
    public static void validarfechNac(String fechNac) throws Exception{
        Pattern fechaNac = Pattern.compile("^[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}$");//TODO validar con fecha actual
        Matcher fN = fechaNac.matcher(fechNac);
        boolean error=false;
        if (fN.matches()){
            error = true;
        } else {
            error = true;
            if (error)
            throw new DatoNoValido();
        }   
        /*DateTimeFormatter formatter=DateTimeFromatter.ofP...
          fecha = LocalDate.parse(f,formatter);*/
    }
    public static void validaremail(String email) throws Exception{
        Pattern ema = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+.([a-z]{2,4})$");
        Matcher em = ema.matcher(email);
        boolean error=false;
        if (em.matches()){
            error = true;
        } else {
            error = true;
            if (error)
            throw new DatoNoValido();
        }
    }
    public static void validaresCiv(String esCiv) throws Exception{
        Pattern estadoCiv = Pattern.compile("^(casado|soltero)");
        Matcher esCi = estadoCiv.matcher(esCiv);
        boolean error=false;
        if (esCi.matches()){
            error = true;
        } else {
            error = true;
            if (error)
            throw new DatoNoValido();
        }
    }
}
