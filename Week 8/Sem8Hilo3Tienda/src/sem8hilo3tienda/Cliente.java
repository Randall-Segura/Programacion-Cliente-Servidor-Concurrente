
package sem8hilo3tienda;

import java.util.concurrent.*; // le ponemos el * para que se traiga todo de la libreria 

/**
 *
 * @author Randall Segura
 */
public class Cliente implements Runnable {  //se le pone implements Runnable, indica que cliente no es un hilo por si solo, sino que define una tarea
    
    //atributos
    
    int idCliente;  //ID del cliente individual
    Tienda tienda;  //referencia a la tienda (para llamar usarVestidor)
    static int numVestidores=5; //numero total de vestidores disponibles
    static Semaphore semaforo= new Semaphore(numVestidores); //objeto semaforo con 5 permisos, es decir 5 vestidores
    
    
    //constructor lleno

    public Cliente(int idCliente, Tienda tienda) {
        this.idCliente = idCliente;
        this.tienda = tienda;
    }
    
    //metodos
    
    @Override
    public void run(){
        try{
            
            
            /*
            semaforo.acquire
            El cliente pide permiso para usar un vestidor
            Semaphore es como un portero:
            Si hay permisos disponibles (vestidores libres), deja pasar.
            Si NO hay permisos (todos ocupados), el hilo se bloquea y espera a que se libere uno.
            Esto asegura que nunca entren más clientes que vestidores.
            */
            semaforo.acquire(); 
            
            
            /*
            this.tienda.usarVestidor(idCliente)
            Cuando el cliente obtiene su permiso, usa el vestidor:
            Llama al método usarVestidor(...) de la clase Tienda.
            Ahí duerme el hilo simulando el tiempo probándose ropa.
            */
            this.tienda.usarVestidor(idCliente);
            
            
        }catch(InterruptedException e){
            System.out.println("Hilo interrumpido");
            
        }
        
        /*
        semaforo.release()
        Cuando el cliente termina de usar el vestidor, libera su espacio:
        Dice: “Ya terminé, este vestidor está libre para otro cliente.”
        Si hay hilos esperando en acquire(), alguno de ellos entra.
        */
        semaforo.release();
    }
        
    
}
