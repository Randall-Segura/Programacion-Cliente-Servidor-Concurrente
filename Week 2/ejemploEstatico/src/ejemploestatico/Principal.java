
package ejemploestatico;

import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        
        Cuadrado.setLado(Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del lado: ")));
        JOptionPane.showMessageDialog(null,"El area del cuadrado es : " + Cuadrado.calcularArea());
        
    }
    
}
