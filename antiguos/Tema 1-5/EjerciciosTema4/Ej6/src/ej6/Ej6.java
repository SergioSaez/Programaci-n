/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        int [] diaArray = new int[5];
        int [] codigoArray = new int[5];
        int [] faltasArray = new int[5];
        
        for(int i = 0; i < diaArray.length; i++){
            
            String codigo = JOptionPane.showInputDialog(null, "Introduce un codigo de alumno");
            int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un día"));
            int faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número de faltas"));
            
            if(!Arrays.toString(codigoArray).contains(codigo)){
                codigoArray[i] = Integer.parseInt(codigo);
                diaArray[i] = dia;
                faltasArray[i] = faltas;
            }
        }
        int continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir más datos?");
    }
}
