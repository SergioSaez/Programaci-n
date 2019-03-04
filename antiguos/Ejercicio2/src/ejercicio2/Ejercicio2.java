package ejercicio2;

import Clases.Persona;
import Vista.Ventana1;
import Vista.Ventana2;
import java.util.ArrayList;

public class Ejercicio2 {
private static Ventana1 v;
private static Ventana2 v2;
private static ArrayList <Persona> listaPersonas;
    
public static void main(String[] args) {
        
        listaPersonas = new ArrayList<Persona>();
        v = new Ventana1 ();
        v.setVisible (true);
}
public static void salir1(){
        v.dispose();
        v2 = new Ventana2 (generarListado());
        v2.setVisible (true);
}
public static void salir2(){
        v.dispose();
        System.exit (0);
    }
    public static String generarListado (){
        String datos = "";
        //for (int x=0; x< listaPersonas.size(); x+1){}
        return null;
        
    }
    public static void altaPersona(String nombre, String apellidos, String DNI) {
        listaPersonas.add(new Persona (nombre, apellidos, DNI));
    }

}
