package Modelo;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    //atributos
    private Connection con = null;
    private String base = "tienda";
    private String url = "jdbc:mysql://localhost:3306/" + base; //Direccion, puerto y nombre de la Base de Datos
    private String user = "root"; //Usuario de Acceso a MySQL
    private String password = ""; //Password del usuario

    
    //metodo
    public Connection getConexion() {

        try {
            /*
            Class.forName("com.mysql.jdbc.Driver");
            Esto carga el driver JDBC de MYSQL.
            JDBC significa Java DataBase Connectivity.
            Es obligatorio para que Java sepa como conectarse a MySQL.
            Es como decirle a Java: "Quiero usar MySQL, así que cargá el motor que sabe cómo hablar con él".
            */
            Class.forName("com.mysql.jdbc.Driver");
            /*
            con= DriverManager.getConnection(url,user,password):
            Aqui es donde se establece la conexion real.
            Usa los datos previamente definidos en los atributos.
            url: La direccion completa de la base de datos.
            user: El usuario de acceso.
            password: La contrasena.
            */
            con = DriverManager.getConnection(url, user, password);
            
            /*
            catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            Captura dos tipos de errores:
            ClassNotFoundException: Si el driver no esta disponible o mal escrito.
            SQLException: Si hay un error al conectarse a la base de datos(la base de datos no existe, usuario incorrecto...)
            Luego de esto se imprime el error.
            */
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        /*
        return con;
        Devuelve el objeto Connection, ya sea una conexion valida o null si hubo un error.
        Este objeto se puede usar en otras clases para ejecutar SQL (INSERT, UPDATE,SELECT,...).
        */
        return con;
    }
}
