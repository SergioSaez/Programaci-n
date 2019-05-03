
package Modelo.BD;


import Excepciones.AcontecimientoNoEncontrado;
import Modelo.UML.*;
import com.db4o.*;

public class AcontecimientoBD{
       
    private static Acontecimiento acontecimiento;
     
    public static void alta(Acontecimiento ac) throws Exception
    {
         GenericoBD.getCon().store(ac);
    }
    
    public static String listado() throws Exception{
        // Método que genera un String con los datos de todos los acontemientos
        ObjectSet resultado = GenericoBD.getCon().queryByExample(new Acontecimiento());
            

        String mensaje="";
        while (resultado.hasNext())
        {
            acontecimiento = (Acontecimiento) resultado.next();
                
            mensaje += acontecimiento.toString()+"\n";
        }
        return mensaje;
    }
    
    
    public static void borrar(Acontecimiento ac) throws Exception
    {
        GenericoBD.getCon().delete(ac);
    }
    
    public static Acontecimiento consultar(Acontecimiento ac) throws Exception{
        ObjectSet resultado = GenericoBD.getCon().queryByExample(ac);
        if (resultado.hasNext())
        {
            acontecimiento = (Acontecimiento) resultado.next();
        }
        else
            throw new AcontecimientoNoEncontrado();
                
        return acontecimiento;
    }
    
    public static void modificar(Acontecimiento ac) throws Exception
    {
       GenericoBD.getCon().store(ac);
    }
}
