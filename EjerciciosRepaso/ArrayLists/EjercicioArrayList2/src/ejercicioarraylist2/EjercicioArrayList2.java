package ejercicioarraylist2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjercicioArrayList2 {

    public static void main(String[] args) {
        ArrayList <String> numeros =new ArrayList();
        int numero;
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("1.- Agregar numero" + "\n"
        + "2.- Buscar un numero" +"\n"
        + "3.- Modificar un número" + "\n"
        + "4.- Eliminar un número" + "\n"
        + "5.- Insertar un numero en una posición" + "\n"));
        
        switch (numero) {
                case 1:
                    numeros.add(JOptionPane.showInputDialog("Introduce el numero quieras"));
                break;
                case 2:
                    int buscar = (Integer.parseInt(JOptionPane.showInputDialog("¿Que numero deseas buscar?")));
                    for (int x = 0; x <numeros.size()-1; x++){
                        if(numeros.contains(buscar))
                        JOptionPane.showInputDialog("El numero " + buscar + " esta en la posición: " + x);
                        else{
                        JOptionPane.showInputDialog("El numero " + buscar + " no existe en el ArrayList");
                        }
                    }
                break;
                case 3:
                    int modificar = (Integer.parseInt(JOptionPane.showInputDialog("¿Que numero deseas buscar?")));
                    for (int x = 0; x <numeros.size()-1; x++){
                        if(numeros.contains(modificar)){
                        numeros.set(x, JOptionPane.showInputDialog("Introduce el numero"));
                        }else{
                        JOptionPane.showInputDialog("El numero " + modificar + " no existe en el ArrayList");
                        }
                    }
                break;
                case 4:
                    int eliminar = (Integer.parseInt(JOptionPane.showInputDialog("¿Que numero deseas eliminar?")));
                    for (int x = 0; x <numeros.size()-1; x++){
                        if(numeros.contains(eliminar))
                            numeros.remove(x);
                        else{
                        JOptionPane.showInputDialog("El numero " + eliminar + " no existe en el ArrayList");
                        }
                        JOptionPane.showInputDialog("El numero " + eliminar + " ha sido eliminado");
                    }
                break;
                case 5: 
                    
                    
                break;
        
        }
    }
    
}
