/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo3;

import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        int puerto=12345:
        Define el numero de puerto donde el servidor escuchara.
        12345 es un puerto mayor a 1024, seguro para pruebas.
        */      
        int puerto = 12345;

        /*
        try (ServerSocket serverSocket = new ServerSocket(puerto)):
        Este es un bloque try-with-resources:
        para abrir recursos (Sockets, flujos de datos) que implementan AutoCloseable.
        Cuando se sale del bloque (porque termina normalmente o por excepción), Java los cierra automáticamente.
        Así evitas olvidarte de cerrar:
        El Socket (la conexión).
        El DataInputStream y DataOutputStream (los canales de datos).
        Bloque try-catch que despues el catch captura errores en caso de que se presenten.
        Se crea un ServerSocket en el puerto 12345 (o el que se desee poner en la variable puerto).
        */
        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            /*
            JOptionPane.showMessageDialog(null, "Servidor iniciando en el puerto " + puerto);
            Imprime el mensaje de informacion diciendo en que puerto esta iniciando el servidor.
            */
            JOptionPane.showMessageDialog(null, "Servidor iniciando en el puerto " + puerto);

            /*
            while (true):
            Es un bucle infinito que hace que el servidor nunca deje de escuchar y siempre este listo para aceptar nuevos clientes.
            Es importante porque si el servidor aceptara solo 1 cliente y se cerrara, seria inutil, con el bucle,
            cuando termina de aceptar un cliente, vuelve a esperar otro.
            */
            while (true) {
                
                /*
                Socket socketCliente = serverSocket.accept();
                Cuando un cliente llega al puerto, se le asigna un Socket 
                */
                Socket SocketCliente = serverSocket.accept();
                
                /*
                JOptionPane.showMessageDialog(null, "Cliente conectado: "+ socketCliente.getInetAddress());
                Muestra un mensaje cuando un cliente se conecta con la IP del cliente que acaba de conectarse.
                La parte de SocketCliente.getInetAdress devuelve la direccion IP del cliente y es util para monitorear quien se conecto y de donde.
                */
                JOptionPane.showMessageDialog(null, "Cliente conectado: "+ SocketCliente.getInetAddress());
                
                /*
                new HiloAtencionCliente(SocketCliente).start();
                Aqui esta la parte concurrente:
                Se crea un nuevo objeto HiloAtencionCliente, pasandole el Socket de ese cliente.
                Llama a .start() que ejecuta el metodo run del hilo en segundo plano
                Significa que:
                Cada cliente tiene su propio hilo.
                El while no se bloquea esperando que se termine el hilo.
                El servido vuelve a accept() para recibir otro cliente.
                De esta manera se pueden tener 10,20,100 clientes conectados al mismo tiempo, sin que se bloqueen entre si.
                */
                new HiloAtencionCliente(SocketCliente).start();
            }
            
            // El catch imprime cualquier excepcion que se presente. 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
