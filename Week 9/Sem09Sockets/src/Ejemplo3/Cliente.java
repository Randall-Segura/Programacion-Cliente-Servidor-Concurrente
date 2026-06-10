package Ejemplo3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        String host = "localhost";
        Se crea la variable host que guarda la direccion IP o nombre del servidor al que el cliente se esta intentanco conectar.
        localhost es un alias que siempre apunta hacia la misma maquina, es como decirle al cliente: conectate a un servidor que
        esta corriendo en esta misma computadora. 
        */
        String host = "localhost";
        
        /*
        int puerto = 12345:
        Es una variable que guarda el numero de puerto en el que el servidor esta escuchando.
        */
        int puerto = 12345;
        
       
        /*
        try (Socket socketCliente = new Socket(host, puerto); 
        Este es un bloque try-with-resources:
        para abrir recursos (Sockets, flujos de datos) que implementan AutoCloseable.
        Cuando se sale del bloque (porque termina normalmente o por excepción), Java los cierra automáticamente.
        Así evitas olvidarte de cerrar:
        El Socket (la conexión).
        El DataInputStream y DataOutputStream (los canales de datos).
        Se crea un nuvo socket para el cliente y se conecta a la IP y al puerto.
        */
        try (Socket SocketCliente = new Socket(host, puerto); 
                
                /*
                DataInputStream entrada = new DataInputStream(socketCliente.getInputStream()); 
                Obtiene el canal de entrada (InputStream) del Socket.
                Permite leer datos primitivos como int, double o tambien texto con readUTF().
                */
                DataInputStream entrada = new DataInputStream(SocketCliente.getInputStream()); 
                
                /*
                DataOutputStream salida = new DataOutputStream(socketCliente.getOutputStream())):
                Obtiene el canal de salida (OutputStream) del Socket.
                Permite enviar datos primitivos como int,double o texto con writeUTF().
                */
                DataOutputStream salida = new DataOutputStream(SocketCliente.getOutputStream())) {
            
            /*
            String msj:
            Se declara una variable que guardara el mensaje que el usuario escriba para enviarlo al servidor.
            Debe estar dentro del try porque es donde se usa salida.
            */
            String msj;
            /*
            while (true):
            Es un bucle infinito que se rompe hasta que se desee salir o se le de al boton de cancel.
            El ciclo mantiene al cliente enviando mensajes uno tras otro.
            */
            while (true) {
                
                /*
                msj = JOptionPane.showInputDialog("Escriba un mensaje o 'salir' para terminar:");
                Se le pide al cliente que digite un mensaje para enviarlo al servidor o bien que salga con "salir".
                */
                msj = JOptionPane.showInputDialog("Escriba un mensaje o 'salir' para terminar:");
                /*
                if (msj == null || msj.equalsIgnoreCase("salir")) {
                    break;
                Si el usuario presiono cancel en la ventana o escribio salir, el programa se termina.
                */
                if (msj == null || msj.equalsIgnoreCase("salir")) {
                    break;
                }
                /*
                salida.writeUTF(msj);
                Se envia el mensaje del cliente al servidor en formato UTF
                */
                salida.writeUTF(msj);
                
                /*
                String respuesta=entrada.readUTF();
                Se espera una respuesta del servidor.
                
                */
                String respuesta=entrada.readUTF();
                /*
                JOptionPane.showMessageDialog(null,"Respuesta del servidor: "+respuesta);
                Se muestra la respuesta del servidor.
                */
                JOptionPane.showMessageDialog(null,"Respuesta del servidor: "+respuesta);
            }
            
            //El catch captura las posibles excepciones que se puedan dar. 
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
