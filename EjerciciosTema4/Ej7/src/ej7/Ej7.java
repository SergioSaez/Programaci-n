package ej7;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ej7 {

    public static void main(String[] args) {
         
        int [] cod = new int [10];
        cod [0] = 10;
        cod [1] = 23;
        cod [2] = 30;
        cod [3] = 47;
        cod [4] = 55;
        cod [5] = 65;
        cod [6] = 135;
        cod [7] = 256;
        cod [8] = 526;
        cod [9] = 663;
        int [] cantidad = new int [10];
        int continuar;
        do{
            int codIn = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el codigo del producto"));
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el nº de productos vendidos"));
            int position = Arrays.binarySearch(cod, codIn);
            cantidad[position] += num;
            continuar = JOptionPane.showConfirmDialog(null, "Quieres introducir más datos?");
        }while(continuar == 0);
        JOptionPane.showMessageDialog(null, Arrays.toString(cod) + "\n\n" + Arrays.toString(cantidad));
    }
}