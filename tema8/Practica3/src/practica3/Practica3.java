package practica3;

import VistasPractica3.Ventana1;
import java.util.ArrayList;

public class Practica3 {
    private static ArrayList <Persona> ListaPersonas;
    
    private static Ventana1 v; 
    
    public static void main(String[] args) {
        ListaPersonas = new ArrayList<Persona>();
        
        v = new Ventana1 ();
        v.setVisible(true);
        
    }
    public static void terminar(){
        v.dispose();
        System.exit(0);
    }
}
