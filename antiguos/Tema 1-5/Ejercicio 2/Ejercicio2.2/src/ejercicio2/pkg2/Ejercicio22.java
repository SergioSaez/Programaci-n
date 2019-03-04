/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String Mensaje= javax.swing.JOptionPane.showInputDialog("Teclea el mensaje que deseas invertir");
    invertirMensaje (Mensaje);
    }
    public static void invertirMensaje (String Mensaje){
    if (Mensaje.length() == 1)
        JOptionPane.showMessageDialog(null, Mensaje);
    else{
    StringBuilder cadenaInvertida = new StringBuilder ();
    String cadenaInvertida2 = "";
    for (int y = Mensaje.length() - 1; y >= 0; y--){
        cadenaInvertida.append(Mensaje.charAt(y));
        cadenaInvertida2 = cadenaInvertida2 + Mensaje.charAt(y);
    }
    JOptionPane.showMessageDialog(null, "La cadena invertida es: "+ cadenaInvertida);
        }
    }
}
