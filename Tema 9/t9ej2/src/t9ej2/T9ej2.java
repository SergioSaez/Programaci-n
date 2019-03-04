/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9ej2;
import Modelo.DbConnection;
import Vista.*;
/**
 *
 * @author Sergio
 */
public class T9ej2 {
private static DbConnection bdcon;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try
        {
        // Ya no hay ArrayList inventados o creados
        // Ahora hay una base de datos
        bdcon = new DbConnection();
        bdcon.conectar();
        }
    
        catch(Exception e)
        {
            System.out.println("Problemas en el main");
        }
    }
}
