package ejerciciopalindromo;

import javax.swing.JOptionPane;

public class EjercicioPalindromo {

    public static void main(String[] args) {
    String cadena= javax.swing.JOptionPane.showInputDialog("Teclea el mensaje que deseas saber si es un palindromo");
    boolean palindromo = fpalindromo(cadena);
    if (palindromo)
        JOptionPane.showMessageDialog(null, "La cadena " + cadena + " si es un palindromo");
    else
        JOptionPane.showMessageDialog(null, "La cadena " + cadena + " no es un palindromo");
    }
    public static boolean fpalindromo (String cadena){
       int x = 0;
       int y = cadena.length () -1;
    while ( x<y && cadena.charAt(x) == cadena.charAt (y)){
        x++;
        y--;
    }
    if (x < y)
        return false;
    else
        return true;
    }
    
}
