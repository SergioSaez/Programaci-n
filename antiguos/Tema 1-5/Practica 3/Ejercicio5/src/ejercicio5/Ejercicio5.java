
package ejercicio5;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args){
        boolean correcto;
        do{
            try {
            numAleatorio () ;
            System.out.println(numAleatorio());
            } catch (Exception ex){
            JOptionPane.showMessageDialog (null, "ERROR");
            }
            String numeroIntroducido;
            numeroIntroducido       = JOptionPane.showInputDialog("Introduce un número de 3 cifras");
        }
        while(correcto = true); 
    }
    public static int numAleatorio () throws Exception {
        int nroGenerado;
        return nroGenerado = ThreadLocalRandom.current().nextInt(100, 999 +1);
        
    }
    public static int jugar (){
        return 0;
    }
    
}
