package ejercicio2arrays;

import javax.swing.JOptionPane;

public class Ejercicio2Arrays {

    public static void main(String[] args) {
        int valores = Integer.parseInt(JOptionPane.showInputDialog("Introcude el numero de valores que quieres que tenga el array"));
        
        int [] arraynumeros = new int[valores];
        int [] digitofinal = new int[valores];
        
        for(int x = 0; x < arraynumeros.length; x++)
        arraynumeros[x] = (int) (Math.random()*300+1);
        
        Character respuesta = JOptionPane.showInputDialog("En que numero quieres que acaben los numeros que se muestren de el array").charAt(0);
        String cadena = "";
                for(int y = 0; y < arraynumeros.length; y++){
                    String nro = "" + arraynumeros[y];
                    
                        if(nro.charAt(nro.length()-1) == respuesta){
                                digitofinal [y] = arraynumeros[y]; 
                                //Al usar y cuando no sea igual saldra un 0
                        }
        
        }
                        String cadena2 = "";
                                for(int q = 0; q < arraynumeros.length; q++)
                                        cadena2 += "Posicion: " + q + " " + "Contenido: " +arraynumeros[q] +"\n" ;
                                    
                                JOptionPane.showMessageDialog(null, cadena2);
                                
                        String cadenad = "";
                                for(int z = 0; z < digitofinal.length; z++)
                                        cadenad +="Posicion: " + z + " " + "Contenido: " +digitofinal[z] +"\n" ;
                                    
                                JOptionPane.showMessageDialog(null, cadenad);
    }
}
