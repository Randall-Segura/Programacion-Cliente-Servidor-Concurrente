/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem08hilo1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Randall Segura
 */
public class Principal extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal p = new Principal();
        p.start();
    }
    
    
    @Override
    public void run(){
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Este codigo esta corriendo en un hilo");
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
    
}
