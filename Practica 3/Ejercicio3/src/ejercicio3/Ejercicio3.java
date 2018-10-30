
package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        String Opcion = JOptionPane.showInputDialog("1.- Sumar dos numeros /2.- Restar dos numeros /3.-Visualizar la tabla de multiplicar de un numero /4.- Visualizar el cociente y el resto de una division /5-Salir del programa.");
        int OP = Integer.parseInt(Opcion);
        do{
         switch(OP){
             case 1:
                String numero1 = JOptionPane.showInputDialog("Introduce el primer numero");
                int ns1 = Integer.parseInt(numero1);
                String numero2 = JOptionPane.showInputDialog("Introduce el segundo numero");
                int ns2 = Integer.parseInt(numero2);
                int suma = ns1 + ns2;
                JOptionPane.showMessageDialog(null, "La suma total es de: " + suma);
             break;
             case 2:
                String num1 = JOptionPane.showInputDialog("Introduce el primer numero");
                int nr1 = Integer.parseInt(num1);
                String num2 = JOptionPane.showInputDialog("Introduce el segundo numero");
                int nr2 = Integer.parseInt(num2);
                int resta = nr1 - nr2;
                JOptionPane.showMessageDialog(null, "La suma total es de: " + resta);
             break;
             case 3: 
                 
             break;
             case 4: 
                 
             break;
             default: System.out.println("El numero introducido no coincide con ninguna opción");
        }
    }while(OP = 5);
                
        }
}
