package clase11.Modelo;

import clase11.Controlador.Articulo;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

/**
 *
 * @author Usuario
 */
public class DatosArticulo {
    
    //metodos
    
    
    public void insertar(Articulo arti){
        try{
            
            /*
             ConectarBD con= new ConectarBD();
            Crea una nueva conexion a la base de datos usando ConectarBD.
            */
            ConectarBD con= new ConectarBD();
            
            /*
            PreparedStatement misql=con.crearPreparedStatement("INSERT INTO articulo VALUES(?,?,?)");
            Se crea un PreparedStatement usando el metodo PreparedStatement() que se definio anteriormente. 
            El SQL "INSERT INTO articulo VALUES(?,?,?)" indica que se va a insertar un nuevo registro en la tabla articulo con tres columnas.
            Los ? son placeholders(marcadores de posicion) que se van a reemplazar con los valores reales mas adelate. 
            */
            PreparedStatement misql=con.crearPreparedStatement("INSERT INTO articulo VALUES(?,?,?)");
            /*
            misql.setInt(1,arti.getCodigo());
            Reemplaza el primer ? por el valor de arti.getCodigo().
            Usa setInt() porque se espera un número entero para el campo codigo.
            */
            misql.setInt(1,arti.getCodigo());
            /*
            misql.setString(2,arti.getDescripcion());
            Reemplaza el segundo ? por el valor de arti.getDescripcion().
            Usa setString() porque descripcion es un texto.
            */
            misql.setString(2,arti.getDescripcion());
            /*
            Reemplaza el tercer ? por el valor de arti.getPrecio().
            Usa setFloat() porque precio es un número decimal (tipo float).
            */
            misql.setFloat(3,arti.getPrecio());
            
            /*
            misql.executeUpdate();
            Ejecuta el comando SQL(INSERT) ya con los valores asignados.
            executeUpdate() se usa para sentencias que modifican la base de datos como INSERT, UPDATE, DELETE.
            Si la operacion fue exitosa, se inserta el nuevo articulo en la tabla.
            */
            misql.executeUpdate();
            
            /*
            con.cerrarConexion();
            Cierra la conexion con la base de datos utilizando el metodo cerrarConexion() de la clase ConectarBD.
            Esto libera los recursos asociados y evita errores o bloques futuros.
            */
            con.cerrarConexion();
            
        }catch(SQLException e){
            /*
            Logger.getLogger(DatosArticulo.class.getName()).log(Level.SEVERE,null,e);
            Se imprime el error detallado en consola o en un log.
            Esto permite identificar y depurar errores facilmente, como si el articulo ya existe o si el servidor esta apagado. 
            */
            Logger.getLogger(DatosArticulo.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    /*
    public ArrayList<Articulo> todosArticulos():
    Este método consulta todos los registros de la tabla articulo en la base de datos, y los devuelve en una lista de objetos Articulo.
    */
    public ArrayList<Articulo> todosArticulos(){
        /*
        ArrayList<Articulo> miListaArticulo= new ArrayList<>();
        Se crea una lista vacia donde se guardaran los articulos obtenidos de la base de datos. 
        */
        ArrayList<Articulo> miListaArticulo= new ArrayList<>();
        
        try{
            //Crear la conexion con la base de datos.
            ConectarBD con= new ConectarBD();
            
            /*
            Statement st=con.crearStatement();
            Se crea un Statement que es un objeto para ejecutar SQL.
            En este caso no se necesita PreparedStatement porque no hay parámetros, pero se podría usar para mayor seguridad y uniformidad.
            */
            Statement st=con.crearStatement();
            
            /*
            ResultSet rs=st.executeQuery("SELECT * FROM articulo");
            Se ejecuta la consulta SQL y se guarda el resultado en un ResultSet.
            El ResultSet es una tabla virtual donde cada fila corresponde a un articulo en la base de datos. 
            */
            ResultSet rs=st.executeQuery("SELECT * FROM articulo");
            /*
            while(rs.next()){
                Articulo arti= new Articulo(
                rs.getInt("codigo"),
                rs.getString("descripcion"),
                rs.getFloat("precio"));
                miListaArticulo.add(arti);
            }
            Se recorre cada fila del ResultSet.
            Por cada fila, se crea un objeto Articulo con los datos leidos desde la base (usando los nombres de la columna).
            El articulo se agrega a la lista. 
            */
            while(rs.next()){
                Articulo arti= new Articulo(
                rs.getInt("codigo"),
                rs.getString("descripcion"),
                rs.getFloat("precio"));
                miListaArticulo.add(arti);
            }
            
            
            /*
            rs.close();
            Se cierra el ResultSet
            con.cerrarConexion();
            Luego se cierra la conexion con la base de datos (muy buena practica).
            */
            rs.close();
            con.cerrarConexion();
            
        }catch(SQLException e){
            /*
            Logger.getLogger(DatosArticulo.class.getName()).log(Level.SEVERE,null,e);
            Se imprime el error detallado en consola o en un log.
            Esto permite identificar y depurar errores facilmente, como si el articulo ya existe o si el servidor esta apagado. 
            */
            Logger.getLogger(DatosArticulo.class.getName()).log(Level.SEVERE,null,e);
        }
        /*
        return miListaArticulo:
        Finalmente, se devuelve la lista completa de articulos. 
        */
        return miListaArticulo;
    }
    
    
    
    
    /*
    public ArrayList<Articulo> BuscarArticuloDescripcion(String descripcion):
    Este metodo busca en la base de datos todos los articulos cuya descripcion contenga una palabra o frase especifica (ignorando si esta al principio,
    medio o fin), y devuelve los resultados como una lista de objetos Articulo. 
    */
    public ArrayList<Articulo> BuscarArticuloDescripcion(String descripcion){
        /*
        ArrayList<Articulo> miListaArticulo= new ArrayList<>();
        Crea una lista vacia donde se iran almacenando los articulos que coincidan con la busqueda.
        */
        ArrayList<Articulo> miListaArticulo= new ArrayList<>();
        
        try{
            //crear la conexion con la base de datos
            ConectarBD con= new ConectarBD();
            
            /*
            PreparedStatement misql=con.crearPreparedStatement("SELECT * FROM articulo WHERE descripcion like ?");
            Crea un PreparedStatement con una consulta SQL.
            El uso de LIKE ? permite hacer busquedas parciales sobre el campo descripcion.
            El signo de interrogacion se reemplazara luego con un valor que incluya comodines %.
            */
            PreparedStatement misql=con.crearPreparedStatement("SELECT * FROM articulo WHERE descripcion like ?");
            
            /*
            descripcion='%' + descripcion +'%';
            Esta line modifica el texto que se va a buscar, envolviendolo entre los comodines %.
            % en SQL significa "cualquier cosa". Por ejemplo:
            'mesa' → buscaria solo "mesa".
            %mesa% → encontraria "mesa de madera", "la mesa", "mesada", etc.
            */
            descripcion='%' + descripcion +'%';
            
            /*
            misql.setString(1,descripcion);
            Asigna el valor de descripcion (ya con %...%) al primer ? de la consulta. 
            Usa setString() porque el campo descripcion en la tabla es de tipo texto. 
            */
            misql.setString(1,descripcion);
            /*
            ResultSet rs=misql.executeQuery();
            Ejecuta la consulta y guarda los datos en un ResultSet.
            */
            ResultSet rs=misql.executeQuery();
            /*
            while(rs.next()){
                Articulo arti= new Articulo(
                rs.getInt("codigo"),
                rs.getString("descripcion"),
                rs.getFloat("precio"));
                miListaArticulo.add(arti);
            Se recorre cada fila del ResultSet.
            Se crea un objeto Articulo con los datos leidos desde la base.
            Se agrega ese objeto a la lista miListaArticulo. 
            */
            while(rs.next()){
                Articulo arti= new Articulo(
                rs.getInt("codigo"),
                rs.getString("descripcion"),
                rs.getFloat("precio"));
                miListaArticulo.add(arti);
            }
            
            
            /*
            rs.close();
            Se cierra el ResultSet.
            con.cerrarConexion();
            Se cierra la conexion a la base de datos, muy importante para liberar recursos.
            */
            rs.close();
            con.cerrarConexion();
            
        }catch(SQLException e){
            
            /*
            Logger.getLogger(DatosArticulo.class.getName()).log(Level.SEVERE,null,e);
            Captura cualquier error que pueda ocurrir durante la ejecución y lo registra en el log.
            Esto evita que el programa se caiga y permite identificar errores (por ejemplo: si la base de datos está caída, hay errores en la tabla, etc.).
            */
            Logger.getLogger(DatosArticulo.class.getName()).log(Level.SEVERE,null,e);
        }
        
        /*
        return miListaArticulo:
        Devuelve la lista con todos los articulos que coincidieron parcialmente con la descripcion buscada.
        */
        return miListaArticulo;
    }
   
    
    
    /*
    
    */
    public void eliminarArticulo(Articulo arti) {
        try {
            ConectarBD con = new ConectarBD();
            //2- creamos la sentencia
            PreparedStatement ps = null;
            String sql = "DELETE FROM articulo WHERE codigo=?";
            ps = con.crearPreparedStatement(sql);
            ps.setInt(1, arti.getCodigo());
            ps.execute();
            con.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(DatosArticulo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
