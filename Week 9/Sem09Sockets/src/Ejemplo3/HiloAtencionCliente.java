package Ejemplo3;

import java.io.*;
import java.net.*;

/**
 *
 * @author Usuario
 */
public class HiloAtencionCliente extends Thread {

    //atributos
    private Socket socketCliente;

    //constructor lleno 
    public HiloAtencionCliente(Socket socketCliente) {
        this.socketCliente = socketCliente;
    }
    
    //metodo 

    @Override
    public void run() {
        /*
        try:
        Es un bloque try with resources.
        Abre recursos que necesitan cerrarse: entrada y salida.
        Cuando el bloque termina (de forma normal o por excepcion), Java cierra ambos recursos automaticamente. 
        Esto evita que queden canales abiertos como Sockets colgados, puertos bloqueados...
        
        DataInputStream entrada = new DataInputStream(socketCliente.getInputStream():
        Obtiene el flujo de entrada (InputStream) del Socket de este cliente (SocketCliente).
        Este es el canal por donde llegan los bytes que envia el cliente,
        
        */
        try (DataInputStream entrada = new DataInputStream(socketCliente.getInputStream());
                
                /*
                DataOutputStream salida = new DataOutputStream(socketCliente.getOutputStream())):
                Obtiene el flujo de salida (OutputStream) del Socket de este cliente
                Este es el canal por donde se envian los bytes de respuesta al cliente
                */
                DataOutputStream salida = new DataOutputStream(socketCliente.getOutputStream())) {
            /*
            String msjCliente:
            Declara una variable para guardar cada mensaje recibido del cliente, se usa dentro del while para ir recibiendo mensaje por mensaje 
            */
            String msjCliente;
            
            /*
            while ((msjCliente = entrada.readUTF()) != null):
            Se lee el mensaje del cliente que fue enviado con formato UTF.
            Asigna el mensaje a la variable msjCliente.
            Se pone != null porque la intencion es "mientras se reciban mensajes, sigue escuchando".
            */
            while ((msjCliente = entrada.readUTF()) != null) {
                /*
                System.out.println("Mensaje recibido: " + msjCliente);
                Se imprime en la consola del servidor lo que mando el cliente, asi se sabe que mando el cliente.
                */
                System.out.println("Mensaje recibido: " + msjCliente);
                /*
                salida.writeUTF("Echo: " + msjCliente);
                Envia una respuesta al cliente usando DataOutputStream
                */
                salida.writeUTF("Echo: " + msjCliente);
            }
            //El catch captura la excepcion que se pueda dar y la imprime.
        } catch (IOException e) {
            e.printStackTrace();
            
            /*
            finally:
            Es un bloque que se ejecuta siempre:
            Si el try termina normal o si ocurre una excepcion y entra en el catch.
            Aqui se asegura que el Socket se cierre pase lo que pase evitando puertos ocupados, conexiones colgadas y perdidas de recursos.
            */
        } finally {
            /*
            try { socketCliente.close(); 
            Se intenta cerrar la conexion del cliente (SocketCliente).
            Cuando se llama a .close(), se cierra el Socket, el InputStream y el OutputStream, el sistema operativo libera el puerto
            y los recursos. 
            Se pone un try catch dentro del finally porque close() tambien puede dar una excepcion si algo sale mal,
            como por ejemplo si ya el Socket estaba cerrado. 
            */
            try {
                socketCliente.close();
                //el catch captura la excepcion y la imprime. 
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            /*
            System.out.println("Cliente desconectado...");
            Imprime en la consola del servidor cuando el cliente se desconecta.
            Sirve para :
            Confirmar que el hilo termino su trabajo.
            Saber que ese cliente ya no esta activo.
            Monitorear conexiones. 
            */
            System.out.println("Cliente desconectado...");
        }
    }
}
