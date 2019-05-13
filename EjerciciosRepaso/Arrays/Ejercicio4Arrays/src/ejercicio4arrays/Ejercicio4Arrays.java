package ejercicio4arrays;

import javax.swing.JOptionPane;

public class Ejercicio4Arrays {

    public static void main(String[] args) {
        
        int [] notas = new int[10];
        String [] nombres = new String [10];
        String [] valoracion = new String[4];
        
         for(int x = 0; x < notas.length; x++){
                notas[x] =  Integer.parseInt(JOptionPane.showInputDialog("Introcude la nota del "+ (x+1) +" alumno"));
                nombres [x] =  JOptionPane.showInputDialog("Introcude el nombre de el alumno cuya nota es un " + notas[x]);
         }
         
        valoracion [0] = "Suspenso";
        valoracion[1] = "Suficiente";
        valoracion [2] = "Bien";
        valoracion [3] = "Notable";
        valoracion [4] = "Sobresaliente";
        
        String cadena = "";
        for(int x = 0; x < notas.length; x++){
                if(notas[x] >= 0){
                        if(notas[x] < 5){
                                cadena += "Nombre: " + nombres[x] + " " + "Nota: " +valoracion[0]+"\n" ;
                        }else{
                                if (notas[x]>= 5){
                                    if (notas[x] <7){
                                        cadena += "Nombre: " + nombres[x] + " " + "Nota: " +valoracion[1]+"\n" ;}
                                }else
                                if (notas[x] >= 7){
                                    if (notas[x] <9){
                                        cadena += "Nombre: " + nombres[x] + " " + "Nota: " +valoracion[2]+"\n" ;}
                                }else
                                    if (notas[x] >= 9){
                                    if (notas[x] <10){
                                        cadena += "Nombre: " + nombres[x] + " " + "Nota: " +valoracion[3]+"\n" ;}
                }}}
        }
        System.out.println(cadena);
        
        
    }
}
