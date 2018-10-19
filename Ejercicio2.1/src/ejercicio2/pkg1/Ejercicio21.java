/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg1;

/**
 *
 * @author Sergio
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String saludo = "Hola tu";
        int contador = 0;
        for(int x=0;x<saludo.length();x++) {
        if ((saludo.charAt(x)=='a') || (saludo.charAt(x)=='e') || (saludo.charAt(x)=='i') || (saludo.charAt(x)=='o') || (saludo.charAt(x)=='u')){
        contador++;
        }
        }
    System.out.println("La palabra " + saludo + " contiene " + contador + " vocales");
    }
}
