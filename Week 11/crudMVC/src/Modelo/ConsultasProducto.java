package Modelo;

import java.sql.*;



/*
Esta clase se encarga de interactucar con la base de datos, extiende Conexion, lo que permite usar el metodo getConexion para 
obtener conexion con la base de datos.
*/
public class ConsultasProducto extends Conexion {

    public boolean registrar(Producto pro) {
        /*
        PreparedStatement ps = null;
        Objeto que permite preparar una sentencia SQL con parametros (?) de forma segura (evita inyecciones SQL).
        */
        PreparedStatement ps = null;
        /*
        Connection con = getConexion();
        Se obtiene una conexion a la base de datos mediante el metodo getConexion(), (heredado de la clase Conexion).
        */
        Connection con = getConexion();

        /*
        String sql = "INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES (?,?,?,?)";
        Esto define la sentencia SQL que se va a ejecutar:
        Va a insertar datos en la tabla producto.
        Los signos de interrogacion son placeholders que seran reemplazados por los datos del producto.
        Este enfoque se usa para evitar inyecciones SQL y facilita el manejo de distintos tipos de datos.
        */
        String sql = "INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES (?,?,?,?)";

        try {
            /*
            ps = con.prepareStatement(sql);
            Se prepara la sentencia SQL con la conexion obtenida.
            ps ahora esta lista para asignarle los valores reales de los parametros.
            */
            
            ps = con.prepareStatement(sql);
            
            /*
            Seteo de parametros:
            Aqui se asignan los valores a los ? de la consulta en orden:
            1. El primer ? sera reemplazado por el valor del metodo pro.getCodigo().
            2. El segundo ? por pro.getNombre().
            3. El tercer ? por pro.getPrecio().
            4. El cuarto por pro.getCantidad().
            El orden debe coincidir exactamente con el de los campos definidos en la sentencia SQL.
            */
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getCantidad());
            
            /*
            ps.execute();
            Ejecuta la sentencia INSERT INTO  en la base de datos.
            return true;
            Si llega a este punto sin errores devuelve true indicando que se registro el producto con exito.
            */
            ps.execute();
            return true;
            
            /*
            catch (SQLException e):
            Si ocurre alguna excepcion SQL se captura.
            */
        } catch (SQLException e) {
            /*
             System.err.println(e);
            Se imprime el error SQL.
            */
            System.err.println(e);
            //Devuelve false indicando que la operacion fallo.
            return false;
            /*
            bloque finally siempre se ejecuta, ocurra o no la excepcion.
            */
        } finally {
            try {
                /*
                con.close();
                Se cierra la conexion con la base de datos para liberar recursos.
                */
                con.close();
                /*
                catch (SQLException e):
                Si al cerrar la conexion con la base de datos ocurre un error, se imprime el mensaje de error.
                */
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean modificar(Producto pro) {
         /*
        PreparedStatement ps = null;
        Objeto que permite preparar una sentencia SQL con parametros (?) de forma segura (evita inyecciones SQL).
        */
        PreparedStatement ps = null;
         /*
        Connection con = getConexion();
        Se obtiene una conexion a la base de datos mediante el metodo getConexion(), (heredado de la clase Conexion).
        */
        Connection con = getConexion();

        /*
        String sql = "UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=?";
        Consulta SQL para actualizar un producto.
        Usa ? como placeholder(espacios reservados) para evitar inyeciones sql.
        WHERE ID=? indica que solo se modificara el producto con ese id.
        */
        String sql = "UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=?";

        try {
            /*
            ps = con.prepareStatement(sql);
            Se prepara la sentencia SQL con la conexion obtenida.
            ps ahora esta lista para asignarle los valores reales de los parametros.
            */
            ps = con.prepareStatement(sql);
            /*
            Aqui se asignan los valores en el mismo orden que aparecen los ? en la consulta SQL.
            */
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getCantidad());
            /*
            ps.setInt(5, pro.getId());
            Este identifica el producto a cambiar.
            */
            ps.setInt(5, pro.getId());
            
            
            /*
            ps.execute();
            Ejecuta la sentencia UPDATE  en la base de datos.
            return true;
            Si llega a este punto sin errores devuelve true indicando que se modifico el producto con exito.
            */
            
            ps.execute();
            return true;
            
            //Captura la excepcion SQL.
        } catch (SQLException e) {
            //Imprime el error
            System.err.println(e);
            //Devuelve false indicando que la operacion fallo.
            return false;
            /*
            bloque finally siempre se ejecuta, ocurra o no la excepcion.
            */
        } finally {
            
            try {
                /*
                con.close();
                Se cierra la conexion con la base de datos para liberar recursos.
                */
                con.close();
                /*
                catch (SQLException e):
                Si al cerrar la conexion con la base de datos ocurre un error, se imprime el mensaje de error.
                */
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(Producto pro) {
        /*
        ps = con.prepareStatement(sql);
        Se prepara la sentencia SQL con la conexion obtenida.
        s ahora esta lista para asignarle los valores reales de los parametros.
        */
        PreparedStatement ps = null;
        /*
        Connection con = getConexion();
        Se obtiene una conexion a la base de datos mediante el metodo getConexion(), (heredado de la clase Conexion).
        */
        Connection con = getConexion();

        /*
        String sql = "DELETE FROM producto WHERE id=?";
        Aqui se define la sentencia SQL.
        DELETE FROM producto: Elimina un registro de la tabla producto.
        WHERE id=?: Solo eliminará el producto cuyo id coincida con el valor que luego se pasa al PreparedStatement.
        */
        String sql = "DELETE FROM producto WHERE id=?";

        try {
            /*
            ps = con.prepareStatement(sql);
            Se prepara la sentencia SQL con la conexion obtenida.
            ps ahora esta lista para asignarle los valores reales de los parametros.
            */
            ps = con.prepareStatement(sql);
            
            /*
            ps.setInt(1, pro.getId());
            Reemplaza el primer ? por id del producto.
            Por ejemplo , si el ID es 5, entonces la consulta real sera: DELETE FROM producto where id=5;
            */
            ps.setInt(1, pro.getId());
            /*
            ps.execute();
            Ejecuta la sentencia DELETE  en la base de datos.
            return true;
            Si llega a este punto sin errores devuelve true indicando que se elimino el producto con exito.
            */
            ps.execute();
            return true;
            //Captura la excepcion SQL e imprime el mensaje.
        } catch (SQLException e) {
            System.err.println(e);
            //Devuelve false indicando que la operacion fallo.
            return false;
            
            //Bloque finally siempre se ejecuta.
        } finally {
            try {
                //Se cierra la conexion con la base de datos para liberar recursos. 
                con.close();
                //Si ocurre un error a la hora de cerrar la conexion con la base de datos, se captura y se imprime el error.
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    

    public boolean buscar(Producto pro) {
        
        /*
        PreparedStatement ps = null;
        Objeto que permite preparar una sentencia SQL con parametros (?) de forma segura (evita inyecciones SQL).
        */
        PreparedStatement ps = null;
        /*
        ResultSet rs = null;
        Se utiliza para recibir el resultado de la busqueda. 
        Se usa para leer datos de una base de datos.
        */
        ResultSet rs = null;
        
        /*
        Connection con = getConexion();
        Se obtiene una conexion a la base de datos mediante el metodo getConexion(), (heredado de la clase Conexion).
        */
        Connection con = getConexion();

        /*
        String sql = "SELECT * FROM producto WHERE codigo=?";
        Sentencia SQL para buscar un producto con codigo especifico.
        El signo ? sera reemplazado por el valor del codigo. 
        */
        String sql = "SELECT * FROM producto WHERE codigo=?";

        try {
            /*
            ps = con.prepareStatement(sql);
            Se prepara la sentencia SQL con la conexion obtenida.
            ps ahora esta lista para asignarle los valores reales de los parametros.
            */
            ps = con.prepareStatement(sql);
            /*
            ps.setString(1, pro.getCodigo());
            Se asigna el valor del codigo del producto (pro.getCodigo()) al ?
            */
            ps.setString(1, pro.getCodigo());
            /*
            rs = ps.executeQuery();
            Se ejecuta la consulta y se guarda el resultado en rs.
            */
            rs = ps.executeQuery();

            /*
            if (rs.next()):
            Verifica si hay resultados, si los hay, el producto si fue encontado. 
            */
            if (rs.next()) {
                /*
                Rellenado del objeto Producto:
                Se extraen los valores de las columnas y se asignan al objeto Producto que llego como parametro.
                Se usa rs.getString() y luego se convierte al tipo de dato correspondiente si es necesario, si se usa rs.getInt() o
                rs.getDouble() directamente, tambien funciona pero sar getString() con parseo a veces permite manejar mejor nulos o errores
                personalizados. 
                */
                pro.setId(Integer.parseInt(rs.getString("id")));
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(Double.parseDouble(rs.getString("precio")));
                pro.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                /*
                return true:
                Si se encontro el producto y se lleno el objeto correctamente, retorna un true. 
                */
                return true;
            }
            //Si no hay ningun producto con ese codigo retorna false.
            return false;
            
            //Captura el error SQL e imprime el mensaje.
        } catch (SQLException e) {
            System.err.println(e);
            //Retorna false en caso de que ocurra un error, por lo tanto no encuentra nada. 
            return false;
            
            //Bloque finally siempre se ejecuta.
        } finally {
            try {
                //Se cierra la conexion con la base de datos para liberar recursos.
                con.close();
                
                //Si ocurre un error a la hora de cerrar la conexion con la base de datos, se captura e imprime. 
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
