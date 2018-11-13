/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarrays3;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class EjercicioArrays3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] arrayLitros = new float[10];
        for (int x = 0; x<arrayLitros.length; x++){
            arrayLitros [x] = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de la posición " + x));
        }
    }
    
}
