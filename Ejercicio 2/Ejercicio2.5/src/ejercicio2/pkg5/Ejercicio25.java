package ejercicio2.pkg5;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Ejercicio25 {

    public static void main(String[] args) throws ParseException { 
        try{
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaUno = formatter.parse(fechaString);
            Long milisegundos = fechaUno.getTime() - (86400000*100);
            Long dias = milisegundos / 86400000;
            JOptionPane.showMessageDialog(null, "100 dias mas tarde es: " + dias + " dias");
        }
        catch(HeadlessException | ParseException e){
            JOptionPane.showMessageDialog(null, "¡¡ERROR!!");
        }
    }
    
}
