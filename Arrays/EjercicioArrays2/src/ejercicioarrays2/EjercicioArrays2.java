package ejercicioarrays2;

import javax.swing.JOptionPane;

public class EjercicioArrays2 {

    public static void main(String[] args) {
        String[] arrayMeses = new String[1];
        int contador = 0;
        for (int x = 0; x<arrayMeses.length; x++){
            arrayMeses [x] = JOptionPane.showInputDialog("Introduce un mes");
        }
        /*for (String elemento : arrayMeses)
        {
            JOptionPane.showMessageDialog(null, elemento);
        }*/
        if ("enero".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
        }
        else
            if ("febrero".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
        }
        else
                if ("marzo".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
        }
        else
                    if ("abril".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
        }
        else
        if ("mayo".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
        }
        else
            if ("junio".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
        }
        else
                if ("julio".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
        }
        else
                    if ("agosto".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
        }
        else
                        if ("septiembre".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
        }
        else
                            if ("octubre".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
                            }
        else
                                if ("noviembre".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
                                }
        else
                                    if ("diciembre".equalsIgnoreCase(arrayMeses[0])){
        contador ++;
                                    }
        
        if(contador == 1)
            JOptionPane.showMessageDialog(null, "El mes introducido es correcto");
        else
            JOptionPane.showMessageDialog(null, "El mes introducido no es correcto");
    }   
}
