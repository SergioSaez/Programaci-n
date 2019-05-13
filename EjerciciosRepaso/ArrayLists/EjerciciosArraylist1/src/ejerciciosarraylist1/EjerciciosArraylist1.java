package ejerciciosarraylist1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EjerciciosArraylist1 {

    public static void main(String[] args) {
        ArrayList <String> palabras =new ArrayList();
        int respuesta = 0;
        String cadena = "";
        
        do{
        respuesta= (Integer.parseInt(JOptionPane.showInputDialog("Elige la opcion que quieres" + "\n" 
                                                                                                      + "1.- Rellenar el ArrayList" + "\n" 
                                                                                                      + "2.- Mostrar los datos tecleados en orden inverso")));
        if (respuesta == 1)
        palabras.add(JOptionPane.showInputDialog("Introduce el mensaje o palabra que quieras"));
        else{
            for(int x = palabras.size()-1; x >= 0; x--){
                cadena += "" + palabras.get(x) + ", ";
            }
            JOptionPane.showMessageDialog(null, cadena);
        }
        
        } while ( respuesta == 1 );{
    
        }
    }

    
}
