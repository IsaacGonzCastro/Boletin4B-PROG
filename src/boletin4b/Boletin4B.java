
package boletin4b;

import javax.swing.JOptionPane;

public class Boletin4B {

    public static void main(String[] args) {
   float consumoMedio,consumoEuros;
   float kM, lI;
   float vMed, pGas;
   kM = Float.parseFloat(JOptionPane.showInputDialog("Introduce Kilometros :"));
   lI = Float.parseFloat(JOptionPane.showInputDialog("introduce litros :"));
   pGas = Float.parseFloat(JOptionPane.showInputDialog("Introduce precio Gasolina :"));
   vMed = Float.parseFloat(JOptionPane.showInputDialog("Introduce tiempo en Horas :"));
   Consumo consumo1 = new Consumo ();
   JOptionPane.showMessageDialog (null,"Consumo Medio ="+ consumo1.consumoMedio(kM, lI));
   Consumo consumo2 = new Consumo ();
   JOptionPane.showMessageDialog(null,"Consumo Euros = "+ consumo2.consumoEuros(pGas,lI));
   Consumo consumo3 = new Consumo ();
   JOptionPane.showMessageDialog(null,"Velocidad Media = "+ consumo3.getvMed(vMed, kM));
    
    }
    
}
