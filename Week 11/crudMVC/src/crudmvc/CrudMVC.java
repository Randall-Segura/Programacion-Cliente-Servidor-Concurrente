package crudmvc;

import Controlador.CtrlProducto;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;

//CrudMVC, frmProducto, CtrlProducto, Conexion, ConsultasProducto, Producto
public class CrudMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Producto mod= new Producto();
        Crea una instancia del Producto.
        Aqui se crea el objeto que va a recibir y manejar los datos del formulario.
        */
        Producto mod= new Producto();
        /*
        ConsultasProducto modC= new ConsultasProducto();
        Crea una instancia de la clase encargada de la logica de base de datos.
        modC tiene metodos como registrar,modificar,eliminar,buscar.
        */
        ConsultasProducto modC= new ConsultasProducto();
        /*
        frmProducto frm= new frmProducto();
        Crea una instacia de la ventana grafica(vista) del formulario de productos.
        */
        frmProducto frm= new frmProducto();
        
        
        /*
        CtrlProducto ctrl= new CtrlProducto(mod,modC,frm):
        Aqui se esta usando el controlador del MVC.
        CtrlProducto recibe tres cosas:
        mod: el modelo.
        modC: la clase que consulta la base de datos.
        frm: la vista.
        El controlador es quien une todo y coordina la interaccion entre los componentes
        */
        CtrlProducto ctrl= new CtrlProducto(mod,modC,frm);
        /*
        ctrl.iniciar();
        Llama al metodo iniciar() del controlador.
        Este metodo:
        Cambia el titulo de la ventana.
        Centra la ventana en la pantalla.
        Oculta el campo txtId.
        */
        ctrl.iniciar();
        /*
        frm.setVisible(true);
        Finalmente, se muestra la interfaz grafica al usuario. 
        */
        frm.setVisible(true);
       
    }

}
