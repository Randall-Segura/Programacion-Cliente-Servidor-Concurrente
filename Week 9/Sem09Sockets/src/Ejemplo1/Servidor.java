package Ejemplo1;

import java.io.*;
import java.net.*;


public class Servidor {

    
    public static void main(String[] args) {
        
        
        
        /*
        ServerSocket s= null;
        Se declara una variable llamada s de tipo ServerSocket, se le asigna null, es decir, no apunta a ningun objeto todavia.
        Esto se hace porque la creacion real del ServerSocket se intenta dentro del try.
        Si ocurre un error al crear el ServerSocket, la variable s seguira siendo null.
        
        */
        ServerSocket s = null;
        
        /*
        Try:
        Intenta crear un ServerSocket que escuche en el puerto 5432.
        */
        try {
            
            /*
            s= new ServerSocket(5432):
            Se reserva un puerto de red en el sistema operativo para que el servidor pueda aceptar conexiones entrantes por ese puerto.
            Si otro programa ya esta usando el mismo puerto, o si no se tiene permisos suficientes, Java lanza la excepcion (IOException e).
            */
            s = new ServerSocket(5432);
            
            /*
            catch (IOException e):
            Captura la excepcion en caso de que el puerto de red este en uso o no se tenga los permisos suficientes.
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
        Es un bucle infinito que significa que el servidor nunca se detiene, siempre esta esperando clientes.
        Sin el bucle while, el servidor solo aceptaria un cliente una unica vez, enviaria el mensaje y todo termina ahi.
        */
        while (true) {
            
            /*
            try:
            El try protege la parte del codigo que puede lanzar errores de entrada/salida (IOException).
            Por ejemplo: si se interrumpe la red, si se cae la conexion o si falla el socket. 
            */
            try {
                
                /*
                Socket s1= s.accept():
                s.accept() es una llamada bloqueante, el servidor se queda esperando hasta que un cliente se conecte al ServerSocket.
                Cuando un cliente se conecta, accept() crea un nuevo objeto Socket, en este caso llamado s1.
                Este Socket s1 es la conexion unica entre el servidor y ese cliente especifico.
                Cada cliente que llegue tendra su propio Socket, el ServerSocket solo se encarga de recibirlos.
                */
                Socket s1 = s.accept();
                
                /*
                DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
                El Socket s1 tiene dos canales:
                InputStream que es para recibir los datos del cliente.
                OutputStream que es para enviar datos al cliente.
                Aca se usa s1.getOutputStream para obtener el canal de salida.
                Despues se empaqueta ese canal con DataOutputStream para enviar los datos de forma mas facil y ordenada.
                DataOutputStream tiene metodos como writeUTF para escribir texto en formato UTF, writeUTF convierte el texto (String) a bytes, despues
                esos bytes viajan por la red de forma correcta y del otro lado, el cliente usa readUTF para leer esos bytes y reconvertirlos a texto,
                por ejemplo la letra A se guarda como un byte: 01000001


                */
                DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
                
                /*
                dos.writeUTF():
                Usa el DataOutputStream para enviar un mensaje de texto al cliente.
                Esto es lo que el cliente vera cuando reciba la conexion
                */
                dos.writeUTF("Hola! soy el server y me conecte");
                
                
                
                /*
                dos.close():
                Cierra el DataOutputStream, es importante hacerlo porque libera recursos del sistema y se asegura de que todo el mensaje llegue completo
                antes de cerrar.
                */
                dos.close();
                
                /*
                s1.close():
                Cierra la conexion Socket entre el servidor y el cliente.
                Despues de esto, ya no se puede enviar ni recibir nada por este socket.
                El servidor va a volver arriba al while (true) y esperara al siguiente cliente.
                Por ejemplo: es como colgar el telefono despues de terminar una conversacion para esperar a que llegue una nueva llamada.
                */
                s1.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

}
