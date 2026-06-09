
package sem8hilo3tienda;


public class Tienda {
    
    //metodo
    
    public void usarVestidor(int idCliente){  //recibe idCliente
        /*genera el tiempo que dura en el vestidor el cliente:
          Math.random() genera un número decimal entre 0.0 y 1.0.
          Multiplicarlo por 10000 → da un número entre 0 y 9999.9999.
          (long) convierte a milisegundos (valor entero).
          Así, cada cliente dura entre 0 y 10 segundos probándose ropa.
        */
        long tiempoVestidor= (long) (Math.random()*10000);
        
        try{
            
            System.out.println("El cliente " + idCliente + " acaba de entrar al vestidor");
            Thread.sleep(tiempoVestidor); //tiempo que dura el cliente probandose la ropa
            System.out.println("El cliente " + idCliente + " ha terminado en un tiempo de " + tiempoVestidor);
            
        }catch(InterruptedException e){
            System.out.println("Hubo un problema probandose la ropa");
        }
    }
}
