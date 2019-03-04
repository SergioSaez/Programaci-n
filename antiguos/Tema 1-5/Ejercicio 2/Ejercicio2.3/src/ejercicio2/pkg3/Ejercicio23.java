package ejercicio2.pkg3;

import javax.swing.JOptionPane;

public class Ejercicio23 {

    public static void main(String[] args) {
        String Mensaje= javax.swing.JOptionPane.showInputDialog("Teclea un mensaje");
        char Letra= javax.swing.JOptionPane.showInputDialog("Introduce letra que quieres que se cuente").charAt(0);
        int contador = 0;
        for(int x=0;x<Mensaje.length();x++) {
            if (Mensaje.charAt(x) == Letra){
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "El caracter " + Letra + " aparece " + contador + " veces en el mensaje: " + Mensaje);
    }
}
