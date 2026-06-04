
package Set;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        System.out.println("----Set de Frutas----");
        Set <String> frutas = new HashSet();          //creacion de hashSet
        frutas.add("uvas");                           //añadir frutas
        frutas.add("manzanas");
        frutas.add("peras");
        
        frutas.add(JOptionPane.showInputDialog("Ingrese una nueva fruta: "). toLowerCase());     //ingreso de fruta nueva
        
        for (String f: frutas) {                                          //impresion de frutas
            System.out.print(f+  " / ");
        }
        
        
        String eliminar= JOptionPane.showInputDialog("Ingrese la fruta a eliminar: ").toLowerCase();  // eliminar fruta
        frutas.remove(eliminar);
        
        System.out.println();
       for (String f: frutas){
           System.out.print(  f + " / ");
       }
        
        
    }
    
}
