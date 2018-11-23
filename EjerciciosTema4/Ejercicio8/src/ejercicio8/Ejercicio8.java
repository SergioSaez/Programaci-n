package ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        int [][] matriz = new int [10] [10];
        int contador =0;
        String continuar = null;
        do{
        try{
            String val1 = JOptionPane.showInputDialog ("Introduce el numero de la fila (entre 0 y 10)");
            int v1=Integer.parseInt(val1);
            if(v1 > 10 || v1 < 0){
                JOptionPane.showMessageDialog(null, "El numero introducido es menor que 0 o mayor que 10");
                System.exit(0);
            }
            else{}
            String val2 = JOptionPane.showInputDialog ("Introduce el numero de la columna (entre 0 y 10)");
            int v2=Integer.parseInt(val2);
            if(v2 > 10 || v1 < 0){
                JOptionPane.showMessageDialog(null, "El numero introducido es menor que 0 o mayor que 10");
                System.exit(0);
            }
            else{}
            String val3 = JOptionPane.showInputDialog("Introduce el valor que quieres que este en ese lugar");
            int v3=Integer.parseInt(val3);
            matriz [v1][v2] = v3;
            contador ++;
        }
        catch(Exception ex){ 
            JOptionPane.showMessageDialog(null, "Error");
        }
        continuar = JOptionPane.showInputDialog("Quieres continuar?");
        }while(contador <= 5 || continuar== "no");
    }  
}
