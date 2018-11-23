package ejercicioarrays5;
import javax.swing.JOptionPane;
public class EjercicioArrays5 {
    public static void main(String[] args) {
        double [] monedas = new double [14];
        monedas [0] = (double) 200;
        monedas [1] = (double) 100; 
        monedas [2] = (double) 50;
        monedas [3] = (double) 20;
        monedas [4] = (double) 10;
        monedas [5] = (double) 5;
        monedas [6] = (double) 2;
        monedas [7] = (double) 1;
        monedas [8] = (double) 0.5;
        monedas [9] = (double) 0.2;
        monedas [10] = (double) 0.1;
        monedas [11] = (double) 0.05;
        monedas [12] = (double) 0.02;
        monedas [13] = (double) 0.01;
    String importe = JOptionPane.showInputDialog ("Introduce el valor de su compra en euros");
    Double imp = Double.parseDouble(importe);
    String pago = JOptionPane.showInputDialog("Introduce el importe de su pago");
    Double p = Double.parseDouble(pago);
    Double cambio = p-imp;
    JOptionPane.showMessageDialog(null, "Sus vueltas son de " + cambio + " euros");
    for(int x = 0; x<monedas.length; x++);
    }
}
