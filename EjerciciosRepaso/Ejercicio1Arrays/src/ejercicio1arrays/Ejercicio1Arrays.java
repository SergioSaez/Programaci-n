package ejercicio1arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio1Arrays {

    public static void main(String[] args) {
        int [] arraynumeros = new int[10];
        arraynumeros[0] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 1 valor del array"));
        arraynumeros[1] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 2 valor del array"));
        arraynumeros[2] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 3 valor del array"));
        arraynumeros[3] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 4 valor del array"));
        arraynumeros[4] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 5 valor del array"));
        arraynumeros[5] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 6 valor del array"));
        arraynumeros[6] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 7 valor del array"));
        arraynumeros[7] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 8 valor del array"));
        arraynumeros[8] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 9 valor del array"));
        arraynumeros[9] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude el 10 valor del array"));
        
        int respuesta;
        
        do{
        respuesta = Integer.parseInt(JOptionPane.showInputDialog("1.- Mostrar el contenido de todas las posiciones" + "\n"
        + "2.- Mostrar el contenido de una posición concreta" +"\n"
        + "3.- Modificar el contenido de una posición concreta" + "\n"
        + "4.- Vaciar el contenido de una posición concreta." + "\n"
        + "5.- Calcular la suma y la media de todos los números" + "\n"
        + "6.- Ordenar los números de mayor a menor" + "\n"
        + "7.- Salir"));
        
                switch (respuesta){
                        case 1:
                                String cadena = "";
                                for(int x = 0; x < arraynumeros.length; x++)
                                        cadena += "Posicion: " + x + " " + "Contenido: " +arraynumeros[x] +"\n" ;
                                    
                                JOptionPane.showMessageDialog(null, cadena);
                        break;
                        case 2:
                                String opcion = JOptionPane.showInputDialog("Introduce la posicion del array que deseas extraer");
                                Integer op = Integer.parseInt(opcion);
                                op = op-1;
                                
                                JOptionPane.showMessageDialog(null, "El elemento de la posicion: " + (op+1) + " " + "es: " +arraynumeros[op]);
                        break;
                        case 3:
                                String opcion2 = JOptionPane.showInputDialog("Introduce la posicion del array que deseas modificar");
                                Integer op2 = Integer.parseInt(opcion2);
                                op2 = op2-1;
                                
                                arraynumeros[op2] =Integer.parseInt(JOptionPane.showInputDialog("Introduce el nuevo valor de la posición "  + (op2+1)+ " del array"));
                        break;
                        case 4:
                                String opcion3 = JOptionPane.showInputDialog("Introduce la posicion del array que deseas borrar");
                                Integer op3 = Integer.parseInt(opcion3);
                                op3 = op3-1;
                                
                                arraynumeros[op3] = 0;
                        break;
                        case 5:
                                int c4s = 0;
                                
                                for(int x = 0; x < arraynumeros.length; x++){
                                        c4s = c4s + arraynumeros[x] ;
                                }
                                JOptionPane.showMessageDialog(null, "La suma de todos los numeros es de: " + c4s + " y la media es de: " +(c4s/arraynumeros.length));
                        break;
                        case 6:
                                Arrays.sort(arraynumeros);
                                
                                JOptionPane.showMessageDialog(null,"Array ordenado");
                                /*
                                String cadena2 = "";
                                for(int x = arraynumeros.length; x > 0; x--)
                                        cadena2 += "Posicion: " + x + " " + "Contenido: " +arraynumeros[x] +"\n" ;
                                    
                                JOptionPane.showMessageDialog(null, cadena2);*/
                                
                        break;
                        case 7:
                                System.exit(0);
                        break;
                }  
                
            }while(respuesta !=7);{
            System.exit(0);
        }
    }
}