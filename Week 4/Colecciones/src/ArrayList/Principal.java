
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {

        String elemento = "";         // elemento: se usa para acumular los nombres y luego mostrarlos.
        ArrayList <String> nombre= new ArrayList<>();   //declaracion de array de tipo String

        for (int i = 0; i < 5; i++) {                              //ciclo para pedir 5 nombres
            nombre.add(JOptionPane.showInputDialog("Digite un nombre: "));

        }
        
        //anadir un elemento a la posicion 2 
        nombre.add(2,"prueba");
        
        //imprimir el array, se ocupa un iterador
        
        Iterator<String> nombreIt= nombre.iterator();     //declaracion del iterador
        while(nombreIt.hasNext()){ // este while se ejecuta mientras queden elementos por recorrer                         
            elemento+= nombreIt.next() + " / "; //elemento guarda los nombres
        }
        JOptionPane.showMessageDialog(null,elemento);
    }

}
