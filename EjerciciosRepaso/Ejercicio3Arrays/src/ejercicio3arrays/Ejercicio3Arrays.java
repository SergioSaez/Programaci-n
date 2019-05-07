package ejercicio3arrays;

import javax.swing.JOptionPane;

public class Ejercicio3Arrays {

    public static void main(String[] args) {
        String [] abecedario = new String[27];
        
        abecedario[0] = "A";
        abecedario[1] = "B";
        abecedario[2] = "C";
        abecedario[3] = "D";
        abecedario[4] = "E";
        abecedario[5] = "F";
        abecedario[6] = "G";
        abecedario[7] = "H";
        abecedario[8] = "I";
        abecedario[9] = "J";
        abecedario[10] = "K";
        abecedario[11] = "L";
        abecedario[12] = "M";
        abecedario[13] = "N";
        abecedario[14] = "Ñ";
        abecedario[15] = "O";
        abecedario[16] = "P";
        abecedario[17] = "Q";
        abecedario[18] = "R";
        abecedario[19] = "S";
        abecedario[20] = "T";
        abecedario[21] = "U";
        abecedario[22] = "V";
        abecedario[23] = "W";
        abecedario[24] = "X";
        abecedario[25] = "Y";
        abecedario[26] = "Z";
        
        int posicion;
        String cadena = "";
        
        do{
                posicion = Integer.parseInt(JOptionPane.showInputDialog("Introcude la posicion de la letra en mayuscula que quieres introducir en la cadena"));

                if (posicion != -1){
                    
                    cadena += "" + abecedario[posicion-1];
                    
                }else{
                    
                        JOptionPane.showMessageDialog(null, cadena);
                        System.exit(0);
                        
                }
            }while (posicion != abecedario.length);{
        }
    }
}
