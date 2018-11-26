
package ejercicioarrays3;

import javax.swing.JOptionPane;

public class EjercicioArrays3 {

    public static void main(String[] args) {
        String respuesta = null;
        do{
        float[] arrayLitros = new float[12];
        for (int x = 0; x<arrayLitros.length; x++){
        arrayLitros [x] = Float.parseFloat(JOptionPane.showInputDialog("Introduce los litros de agua caídos durante un año"));
        
        }
        respuesta = JOptionPane.showInputDialog("¿Quieres continuar?");
        }while("no".equalsIgnoreCase(respuesta));
    }
}