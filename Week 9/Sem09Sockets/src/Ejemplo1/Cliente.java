package Ejemplo1;

import java.io.*;
import java.net.*;

public class Cliente {

    public static void main(String[] args) {

        /*
        Socket sc=null:
        Se declara una variable de tipo Socket, esta variable sera el canal de comunicacion del lado del cliente.
        Se inicializa en null por precaucion, por si ocurre un error y no se logra crear.
         */
        Socket sc = null;

        /*
        try:
        Inicia un bloque try porque la creacion de un socket puede fallar y si falla se lanza la excepcion (IOException)
         */
        try {

            /*
            sc = new Socket("127.0.0.1", 5432);
            Crea un nuevo Socket e intenta conectarse a:
            IP: 127.0.0.1 : Es la IP local, tambien llamada localhost o loopback,
            Significa que el cliente se va a conectar a un servidor que se esta ejecutando en la misma computadora.
            Puerto: 5432 : Es el numero de puerto donde el servidor esta escuchando, debe coincidir con el puerto que se uso en el ServerSocket.
             */
            sc = new Socket("127.0.0.1", 5432);
            /*
            catch (IOException e):
            Captura cualquier error que ocurra al crear el Socket, ejemplo:
            El servidor no esta encendido
            La IP esta mal
            El puerto esta ocupado o bloqueado
            En caso de que ocurra, sc siempre sera null
             */
        } catch (IOException e) {
            /*
            e.printStackTrace();
            Imprime el error que se dio.
             */
            e.printStackTrace();

        }

        /*
        while (true):
        El cliente entra en un bucle infinito
        Esto significa que este proceso se va a repetir para siempre, (aunque aqui realmente, se termina despues de cerrar el socket).
         */
        while (true) {
            
            /*
            try:
            Se intenta ejecutar el bloque protegido.
            Si ocurre un error, salta el catch.
            */
            try {
                
                /*
                DataInputStream dis = new DataInputStream(sc.getInputStream());
                sc.getInputStream obtiene el canal de entrada del Socket sc.
                DataInputStream envuelve el flujo para leer datos estructurados (por ejemplo, texto en UTF).
                Esto es el equivalente inverso al DataOutputStream:
                El servidor envia: DataOutputStream.
                El cliente recibe: DataInputStream.
                */
                DataInputStream dis = new DataInputStream(sc.getInputStream());
                
                /*
                System.out.println(dis.readUTF());
                dis.readUTF lee la cadena de texto codificada en UTF (la misma forma en que el servidor la envio con writeUTF).
                El texto se muestra en la consola con el System.out.println
                */
                System.out.println(dis.readUTF());
                
                /*
                dis.close():
                Cierra el DataInputStream().
                Libera recursos del flujo de entrada.
                Es buena practica cerrarlo cuando ya no se necesita.
                
                */
                dis.close();
                
                /*
                sc.close():
                Cierra el Socket del cliente.
                La conexion con el servidor se termina completamente.
                Despues de esto no se pueden enviar ni recibir mas datos por sc.
                */
                sc.close();
                /*
                catch (IOException)
                Captura cualquier error que ocurra al crear el Socket, ejemplo:
                El servidor no esta encendido
                La IP esta mal
                El puerto esta ocupado o bloqueado
                En caso de que ocurra, sc siempre sera null
                */
            } catch (IOException e) {
                /*
            e.printStackTrace();
            Imprime el error que se dio.
                 */
                e.printStackTrace();

            }
        }
    }
}
