
package sem8hilo3tienda;
import java.util.concurrent.*;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear la instancia de tienda para que todos los hilos vayan a la misma tienda
        Tienda tienda= new Tienda();
        
        /*
        ExecutorService es una herramienta de alto nivel para gestionar hilos.
        Executors.newFixedThreadPool(5) crea un pool de hilos fijo de tamaño 5.
        Significa que puede ejecutar hasta 5 tareas (clientes) en paralelo.
        Si llegan más tareas, quedan en una cola de espera.
        */
        ExecutorService ejecutor= Executors.newFixedThreadPool(5);
        
        /*crear los clientes
        execute le dice al ExecutorService : por favor, ejecuta este cliente usando un hilo del pool, si hay hilos disponibles, se ejecuta
        inmediatamente, si todos los hilos estan ocupados, la tarea se pone en una cola y espera
        i es el id del cliente(0,1,2,10...)
        tienda es el objeto compartido que todos usan
        */
        for (int i = 0; i < 25; i++) {
            ejecutor.execute(new Cliente(i,tienda));
            
        }
        
        /*
        ejecutor.shutdown*() le dice al ExecutorService, “No aceptarás más tareas nuevas, pero termina las que ya tienes.”
        */
        ejecutor.shutdown();
        
        /*
        isTerminated() devuelve true solo cuando TODAS las tareas del pool terminaron.
        El main se queda esperando aquí hasta que todos los clientes salgan del vestidor y liberen el permiso.
        Cuando termina el programa finaliza de manera limpia
        */
        while (!ejecutor.isTerminated());
    }
    
}
