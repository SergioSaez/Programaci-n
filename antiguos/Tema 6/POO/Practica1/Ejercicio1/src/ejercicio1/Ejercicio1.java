package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            double r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de la circunferencia en cm"));
            circunferencia c = new Circunferencia ();
            c.setRadio(r);
        DecimalFormat df = new DecimalFornat ("# .00");
        JOptionPane.showMessageDialog(null, "Los datos de la circunferencia son: \n"
                + "\n\n Longitud: " + df.format(c.getLongitud()+
                + "\n Area: "+ df.format(c.getArea())+ 
                + "\n Volumen: " + df.format(c.getVolumen());
        }
    }
    
        /*
        int radio;
        int circunferencia;
        int area;
        int volumen;
        double pi = 3.141592;
        
        radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio de la circunferencia en cm"));
        
        circunferencia = (int) (2 * pi * radio);
        area = (int) (pi * radio * radio);
        volumen = (int) (4 * pi * radio * radio * radio / 3);
        
        JOptionPane.showMessageDialog(null, "La longitud de la circunferencia es de " + circunferencia + " cm");
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es de " + area + " cm");
        JOptionPane.showMessageDialog(null, "El volumen de la circunferencia es de " + volumen + " cm cúbicos");
    */
    
    public class circunferencia{
        public double radio;
        
        public circunferencia(int radio) {
            this.radio = radio;
        }

        public int getRadio() {
            return (int) radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }
        
        public double getLongitud(){
            return 2*Math.PI * radio;
        }
        public double getArea(){
            return Math.PI * Math.pow(getRadio(),2);
        }
        public double getVolumen(){
            return 4 * Math.PI * Math.pow (radio, 3) / 3;
        }
    }
}
