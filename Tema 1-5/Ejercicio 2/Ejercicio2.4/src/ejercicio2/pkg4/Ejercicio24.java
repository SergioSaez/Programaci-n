package ejercicio2.pkg4;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Ejercicio24 {

    public static void main(String[] args) throws ParseException {
        try{
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
            SimpleDateFormat formatter;
            formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaUno = formatter.parse(fechaString);
            
            fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
            Date fechaDos = formatter.parse(fechaString);
            
            Long milisegundos = fechaUno.getTime() - fechaDos.getTime();
            
            Long dias = milisegundos / 86400000;
            JOptionPane.showMessageDialog(null, "La diferencia es de " + dias + " dias");
        }
        catch(HeadlessException | ParseException e){
            JOptionPane.showMessageDialog(null, "¡¡ERROR!!");
        }
    }
}

