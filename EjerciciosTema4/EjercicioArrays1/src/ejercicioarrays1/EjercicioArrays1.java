package ejercicioarrays1;

import javax.swing.JOptionPane;

public class EjercicioArrays1 {

    public static void main(String[] args) {
        float[] arrayNumeros = new float[10];
        for (int x = 0; x<arrayNumeros.length; x++){
            arrayNumeros [x] = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de la posición " + x));
        }
        /*for (float elemento : arrayNumeros)
        {
            JOptionPane.showMessageDialog(null, elemento);
        }*/
        float minimo = arrayNumeros [0];
        float maximo = arrayNumeros [0];
        for (int x=1; x<arrayNumeros.length; x++){
        if (arrayNumeros [x]<minimo)
            minimo = arrayNumeros[x];
        else
            if (arrayNumeros [x]>maximo)
            maximo = arrayNumeros[x];
        }
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + maximo + " y el numero menor es: " + minimo); 
    }
}
