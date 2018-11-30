package ejercicio1;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList();
        String continuar = null;
        int contador = 0;
        try{
        do{
            lista.add(Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero")));
            continuar =JOptionPane.showInputDialog("Quieres continuar? (si, no)");
            }while("si".equalsIgnoreCase(continuar));
            if("no".equalsIgnoreCase(continuar))
                contador ++;
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Lo introducido no es un número");
        }catch(HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error");
        }
        if(contador == 1){
        String eleccion = JOptionPane.showInputDialog("1. Visualizar el valor máximo y el mínimo" + "\n" +
            "2. Solicitar un número y buscarlo. Muestra un mensaje indicando si lo has encontrado o no" + "\n" +
            "3. Solicitar un número, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error" + "\n" +
            "4. Convertir el arrayList en un array." + "\n" + 
            "5. Si no esta vacío, mostrar el número de elementos que contiene" + "\n" +
            "6. Insertar un nuevo elemento por el ﬁnal" + "\n" + 
            "7. Insertar un nuevo elemento en la posición que te indique el usuario" + "\n" +
            "8. Borrar un elemento de una posición concreta" + "\n" +
            "9. Calcular la suma y la media aritmética de los valores contenidos" + "\n" +
            "10. Finalizar.");
        int el = Integer.parseInt(eleccion);
        if (el < 0 || el > 10) {
            JOptionPane.showMessageDialog(null, "El número introducido no es una de las opciones");
        } else {
        }
        if(el == 1){
            double minimo = 1000000;
            double maximo = 0;
            for (int x= 1; x<lista.size(); x++){
                if (lista.get(x) < minimo)
                    minimo = lista.get(x);
                else{}
                if (lista.get(x) > maximo)
                    maximo = lista.get(x);
                else{}
            }
                JOptionPane.showMessageDialog(null, "El numero mayor es el " + maximo + " y el numero menor es el " + minimo);
        }
        //TODO pone el mismo al mayor y al menor
        if(el == 2){
            String numero2 = JOptionPane.showInputDialog("Introduce el numero que quieres buscar");
            double n2 = Double.parseDouble(numero2);
            if (lista.contains(n2))
                JOptionPane.showMessageDialog(null, "El numero se encuentra en la lista");
            else
                JOptionPane.showMessageDialog(null, "El numero no se encuentra en la lista");
        }
        if(el == 3){
            try{
            String numero3 = JOptionPane.showInputDialog("Introduce el numero que quieres buscar y borrar");
            double n3 = Double.parseDouble(numero3);
            lista.remove (n3);
            JOptionPane.showMessageDialog(null, "El numero " + n3 + " ha sido borrado");
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Lo introducido no es un número");
                }
                catch (HeadlessException ex){
                    JOptionPane.showMessageDialog(null, "El número introducido no existe en el ArrayList");
                }
        }
        if(el == 4){
            Object [] array = lista.toArray ();
        }
        if(el == 5){
            //TODO "Si no esta vacío, mostrar el número de elementos que contiene"
        }
        if(el == 6){
            String numero6 = JOptionPane.showInputDialog("Introduce el numero que deseas introducir en la última posición");
            double n6 = Double.parseDouble(numero6);
            lista.add(n6);
        }
        if(el == 7){
            String numeropos = JOptionPane.showInputDialog("Introduce la posición en la que deseas introducir un número");
            int npo = Integer.parseInt(numeropos);
            String numero7 = JOptionPane.showInputDialog("Introduce el numero que deseas introducir en esa posición");
            double n7 = Double.parseDouble(numero7);
            lista.add(npo, n7);
        }
        if(el == 8){
            String numero8 = JOptionPane.showInputDialog("Introduce la posición que deseas borrar");
            int n8 = Integer.parseInt(numero8);
            lista.remove (n8);
        }
        if(el == 9){
            //TODO "Calcular la suma y la media aritmética de los valores contenidos" 
        }
        if(el == 10)
            
        System.exit(0);
        } 
    }
}
