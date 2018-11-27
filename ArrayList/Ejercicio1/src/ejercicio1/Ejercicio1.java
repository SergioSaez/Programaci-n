
package ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList();
        //lista.add(JOptionPane.showInputDialog("Introduce un numero"));
        /*String continuar =JOptionPane.showInputDialog("Quieres continuar? (s, n)");
        if("n".equalsIgnoreCase(continuar));
            System.exit(0); */
        String eleccion = JOptionPane.showInputDialog("1. Visualizar el valor máximo y el mínimo" + "\n" +
        "2. Solicitar un número y buscarlo. Muestra un mensaje indicando si lo has encontrado o no" + "\n" +
        "3. Solicitar un número, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error" + "\n" +
        "4. Convertir el arrayList en un array." + "\n" + 
        "5. Si no esta vacío, mostrar el número de elementos que contiene" + "\n" +
        "6. Insertar un nuevo elemento por el ﬁnal" + "\n" + 
        "7. Insertar un nuevo elemento en la posici´on que te indique el usuario" + "\n" +
        "8. Borrar un elemento de una posici´on concreta" + "\n" +
        "9. Calcular la suma y la media aritmética de los valores contenidos" + "\n" +
        "10. Finalizar.");
        int el = Integer.parseInt(eleccion);
        do{
        if(el == 1){
        
        }
        if(el == 2){
        String numero = JOptionPane.showInputDialog("Introduce el numero que quieres buscar");
        int nb = Integer.parseInt(numero);
        lista.contains(nb);
        //TODO terminar de ver si lo contiene
        }
        if(el == 3){}
        if(el == 4){}
        if(el == 5){}
        if(el == 6){}
        if(el == 7){}
        if(el == 8){}
        if(el == 9){}
        }while(el != 10);
        if(el == 10)
        System.exit(0);
        
    }
}
