
package ejercicio2.pkg7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Ejercicio27 {

    public static void main(String[] args) {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
         String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
         LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
           
         fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
         LocalDate fechaDos = LocalDate.parse(fechaString, formatter);
         
         int contador = 0;
         while(fechaUno.isBefore(fechaDos))
         {
             if (fechaUno.getDayOfWeek()==DayOfWeek.SUNDAY)
                 contador++;
             fechaUno = fechaUno.plusDays(1);
         }
         JOptionPane.showMessageDialog(null, "Hay " + contador + " domingos");

    }
}