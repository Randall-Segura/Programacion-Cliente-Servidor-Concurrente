package clase11.Modelo;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class ConectarBD {
   //atributos
    
    /*
    private Connection conexion=null; 
    Almacena la conexion activa a la base de datos.
    */
    private Connection conexion=null; 
    /*
    private String servidor="localhost:3306";
    Direccion y puerto del servidor de MySQL, localhost:3306 significa que la base esta en la propia computadora y usa el pueto 3306, 
    por defecto en MySQL.
    */
    private String servidor="localhost:3306";
    /*
    private String database="cslinventario";
    Nombre de la base de datos a la que se requiere conectar.
    */
    private String database="cslinventario";
    /*
    private String usuario="root";
    private String password="";
    Credenciales de acceso a MySQL
    */
    private String usuario="root";
    private String password="";
    /*
    private String url="";
    Sera construida para que Java sepa a que base conectarse. 
    */
    private String url="";
    
    
    //constructor vacio
    public ConectarBD(){
        
        try{
            /*
            Class.forName("com.mysql.jdbc.Driver");
            Esto carga el driver JDBC de MYSQL.
            JDBC significa Java DataBase Connectivity.
            Es obligatorio para que Java sepa como conectarse a MySQL.
            Es como decirle a Java: "Quiero usar MySQL, así que cargá el motor que sabe cómo hablar con él".
            */
            
            Class.forName("com.mysql.jdbc.Driver");
            /*
            url= "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            Aqui se arma la URL de conexion completa:
            "jdbc:mysql://": Protocolo para usar JDBC con MySQL.
            servidor: Direccion del servidor de MySQL (la propia computadora y puerto por defecto).
            database: Es la variable que dentro contiene el nombre de la base de datos.
            ?autoReconnect=true: Si se cae la conexion con la base de datos, intenta conectarse de nuevo automaticamente.
            &useSSL=false: Desactiva advertencias por no usar conexion segura (SSL) en local, le dice al driver jdbc: no quiero usar comunicacion 
            cifrada (SSL) entre mi aplicacion y la base de datos.
            */
            url= "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            /*
            conexion=DriverManager.getConnection(url,usuario,password);
            Establece la conexion real entre Java y la base de datos MySQL, usando la url que ya se creo, junto con un nombre de usuario y contrasena.
            DriverManager.getConnection: abre la conexion con la base de datos.
            url:Define a que base de datos, en que lugar y con que opciones.
            usuario y password: Credenciales para entrar la base de datos.
            Y todo esto devuelve un objeto Connection para poder interactuar con la base de datos mediante sentencias SQL como consultas,
            inserciones, actualizaciones y eliminaciones. 
            */
            conexion=DriverManager.getConnection(url,usuario,password);
            /*
            System.out.println("Conexion con la base de datos " + url + "...ok");
            Muestra un mensaje en consola si la conexion a la base de datos fue exitosa. 
            */
            System.out.println("Conexion con la base de datos " + url + "...ok");
            /*
            SQLException e:
            Es una clase de excepcion de Java que representa errores relacionados con la base de datos.
            Puede ocurrir cuando:
            -El servidor de MySQL esta apagado.
            -El nombre de la base de datos esta mal.
            -El usuario o contrasena son incorrectos.
            -La url esta mal construida.
            -Hay problemas de red. 
            */
        }catch(SQLException e){
            System.out.println(e.getMessage());
            /*
            ClassNotFoundException e:
            Es una excepcion de Java que ocurre cuando el programa intenta cargar una clase que no existe o no se encuentra en tiempo de ejecucion.
            Captura el error si el driver JDBC de MySQL no se encuentra en el proyecto.
            Despues imprime el nombre de la clase que no se pudo cargar. 
            */
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    //constructor lleno
    /*
    public ConectarBD(String servidor, String database, String usuario, String password)
    Al constructor lleno se le deben de pasar estos 4 parametros, servidor, database, usuario y password.
    */
    public ConectarBD(String servidor, String database, String usuario, String password){
        
        try{
            /*
            this.servidor=servidor;
            this.database=database;
            Estos dos parametros se inicializan como normalmente se harian en un constructor lleno.
            */
            this.servidor=servidor;
            this.database=database;
            /*
            Class.forName("com.mysql.jdbc.Driver");
            Esto carga el driver JDBC de MYSQL.
            JDBC significa Java DataBase Connectivity.
            Es obligatorio para que Java sepa como conectarse a MySQL.
            */
            Class.forName("com.mysql.jdbc.Driver");
            /*
            url= "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            Aqui se arma la URL de conexion completa:
            "jdbc:mysql://": Protocolo para usar JDBC con MySQL.
            servidor: Direccion del servidor de MySQL (la propia computadora y puerto por defecto).
            database: Es la variable que dentro contiene el nombre de la base de datos.
            ?autoReconnect=true: Si se cae la conexion con la base de datos, intenta conectarse de nuevo automaticamente.
            &useSSL=false: Desactiva advertencias por no usar conexion segura (SSL) en local, le dice al driver jdbc: no quiero usar comunicacion 
            cifrada (SSL) entre mi aplicacion y la base de datos
            */
            url= "jdbc:mysql://" + servidor + "/" + database + "?autoReconnect=true&useSSL=false";
            /*
            conexion=DriverManager.getConnection(url,usuario,password);
            Establece la conexion real entre Java y la base de datos MySQL, usando la url que ya se creo, junto con un nombre de usuario y contrasena.
            DriverManager.getConnection: abre la conexion con la base de datos.
            url:Define a que base de datos, en que lugar y con que opciones.
            usuario y password: Credenciales para entrar la base de datos.
            Y todo esto devuelve un objeto Connection para poder interactuar con la base de datos mediante sentencias SQL como consultas,
            inserciones, actualizaciones y eliminaciones. 
            */
            conexion=DriverManager.getConnection(url,usuario,password);
            /*
            System.out.println("Conexion con la base de datos " + url + "...ok");
            Muestra un mensaje en consola si la conexion a la base de datos fue exitosa. 
            */
            System.out.println("Conexion con la base de datos " + url + "...ok");
            
            
            /*
            SQLException e:
            Es una clase de excepcion de Java que representa errores relacionados con la base de datos.
            Puede ocurrir cuando:
            -El servidor de MySQL esta apagado.
            -El nombre de la base de datos esta mal.
            -El usuario o contrasena son incorrectos.
            -La url esta mal construida.
            -Hay problemas de red. 
            */   
        }catch(SQLException e){
            System.out.println(e.getMessage());
            /*
            ClassNotFoundException e:
            Es una excepcion de Java que ocurre cuando el programa intenta cargar una clase que no existe o no se encuentra en tiempo de ejecucion.
            Captura el error si el driver JDBC de MySQL no se encuentra en el proyecto.
            Despues imprime el nombre de la clase que no se pudo cargar. 
            */
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    //metodos
    
    
    /*
    public PreparedStatement crearPreparedStatement(String sql) throws SQLException:
    PreparedStatement: Es un objeto que permite ejecutar sentencias SQL con parametros, de forma segura y eficiente. Se usa para 
    INSERT, UPDATE, DELETE, SELECT... 
    throws SQLException: Indica que el metodo puede lanzar una excepcion si algo falla al preparar la sentencia por ejemplo si la conexion esta cerrada
    o el SQL tiene errores. 
    return conexion.prepareStatement(sql): Se devuelve un objeto PreparedStatement.
    Conexion: Es el atributo privado de tipo Connection, que representa la conexion activa a la base de datos. 
    .prepareStatement es un metodo del objeto Connection que precompila la sentencia SQL en el servidor de la base de datos, devuelve un objeto 
    PreparedStatement que luego se puede usar para:
    Asignar valores a los ?
    Ejecutar la consulta con .executeQuery() o  .executeUpdate().
    */
    public PreparedStatement crearPreparedStatement(String sql) throws SQLException{
        return conexion.prepareStatement(sql);
    }
    
    /*
    public Statement crearStatement()throws SQLException:
    Statement es una clase de java.sql que permite ejecutar sentencias SQL estaticas, es decir, sentencias sin parametros.
    Se usa para ejecutar consultas (SELECT) y actualizaciones(INSERT,UPDATE,DELETE).
    throws SQLException: Indica que el metodo puede lanzar una excepcion si algo falla al preparar la sentencia por ejemplo si la conexion esta cerrada
    o el SQL tiene errores. 
    return conexion.createStatemente():
    conexion es el atributo de tipo Connection, que representa la conexion activa con la base de dato.
    .createStatement() es un método de la clase Connection que:
    Crea un nuevo objeto Statement.
    Este objeto se puede usar para ejecutar SQL directamente como texto plano (sin parámetros).
    */
    
    public Statement crearStatement()throws SQLException{
        return conexion.createStatement();
    }
    
    /*
     public Connection getConexion()
        return conexion;
    Devuelve un valor del atributo privado conexion, que es un objeto de tipo Connection.
    Es util cuando otra clase necesita trabajr directamente con la conexion, por ejemplo, para crear su propio PreparedStatemente, Statement o transacciones.
    
    */
    
    public Connection getConexion(){
        return conexion;
    }
    
    
    /*
    Este metodo tiene como objetivo cerrar la conexion activa a la base de datos y luego dejarla en null para liberar recursos y evitar errores
    si alguien intenta usarla luego. 
    */
    public Connection cerrarConexion(){
        try{
            conexion.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        conexion=null;
        return conexion;
    }
    

}
