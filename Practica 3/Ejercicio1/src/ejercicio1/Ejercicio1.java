package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        int sueldo = 0;
        String horas = JOptionPane.showInputDialog("Introduce el numero de horas trabajadas");
        int h = Integer.parseInt(horas);
        if(h<40){
            sueldo = h*10;
            JOptionPane.showMessageDialog(null, "El sueldo que va a obtener es de "+ sueldo + " euros");
        }
        else{
            sueldo = 40*10 + ((h-40)*15);
            JOptionPane.showMessageDialog(null, "El sueldo que va a obtener es de "+ sueldo + " euros");
        }
        
    }
}