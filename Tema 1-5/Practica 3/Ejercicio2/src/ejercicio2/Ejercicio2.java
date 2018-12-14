
package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {


    public static void main(String[] args) {
            int AptoSQL = JOptionPane.showConfirmDialog(null, "¿Apto en SQL?",null,JOptionPane.YES_NO_OPTION);
            int AptoCobol = JOptionPane.showConfirmDialog(null, "¿Apto en Cobol?",null,JOptionPane.YES_NO_OPTION);
            int AptoVisual = JOptionPane.showConfirmDialog(null, "¿Apto en Visual.net?",null,JOptionPane.YES_NO_OPTION);
            int AptoJava = JOptionPane.showConfirmDialog(null, "¿Apto en Java?",null,JOptionPane.YES_NO_OPTION);
          
            if(AptoVisual == 0 && AptoSQL == 0 && AptoCobol == 0 && AptoJava == 0)
                JOptionPane.showMessageDialog(null, "Sobresaliente");
            else
                if((AptoSQL == 0 && AptoCobol == 0) && (AptoVisual == 0 || AptoJava == 0))
                    JOptionPane.showMessageDialog(null, "Notable");
                else
                    if(AptoSQL == 0 && AptoCobol == 0 )
                        JOptionPane.showMessageDialog(null, "Bien");
                    else
                        if((AptoSQL == 0) && (AptoJava == 0 || AptoVisual == 0))
                            JOptionPane.showMessageDialog(null, "Suficiente");
                        else
                            if ((AptoCobol == 0) && (AptoJava == 0 || AptoVisual == 0))
                                JOptionPane.showMessageDialog(null, "Suficiente");
                            else
                                JOptionPane.showMessageDialog(null, "Insuficiente");
    }    
}
