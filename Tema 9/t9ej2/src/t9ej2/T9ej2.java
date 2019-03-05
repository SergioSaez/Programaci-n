package t9ej2;

import Modelo.DbConnection;
import vista.*;

public class T9ej2 {
private static DbConnection bdcon;
private static Ventana1 v1;
private static VentanaAlta va;

    public static void main(String[] args) {
    try
        {
        bdcon = new DbConnection();
        bdcon.conectar();
        
        v1 = new Ventana1();
        v1.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println("Problemas en el main");
        }
    }
}
