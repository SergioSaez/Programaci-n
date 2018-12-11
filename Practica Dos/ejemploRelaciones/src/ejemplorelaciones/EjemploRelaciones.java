/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorelaciones;

/**
 *
 * @author usuario
 */
public class EjemploRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Pepe",40);
        
        Coche c1 = new Coche("1111bbb");
        Coche c2 = new Coche("2222ccc");
        
        p.añadirCoche(c2);
        p.añadirCoche(c1);
        
        
    }
    
}
