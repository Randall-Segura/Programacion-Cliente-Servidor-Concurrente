package Controlador;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


//CRUD: create,read,update,delete
/*
 Esta clase CtrlProducto se encarga de:
Recibir las acciones de la vista(frmProducto).
Tomar los datos desde los campos del formulario.
Llamar a los metodos del modelo(Producto) y a las consultas de base de datos(ConsultasProducto).
Actualizar la vista segun lo que pase (mostrar mensajes, limpiar campos, etc).
 
 */
public class CtrlProducto implements ActionListener {
    
    //atributos
    
    /*
    private final Producto modelo;
    Un modelo (Producto): representa el objeto a manipular (con getters y setters).
    */
    private final Producto modelo;
    /*
    private final ConsultasProducto consultas;
    Un objeto de logica de negocio/ base de datos(ConsultasProducto).
    */
    private final ConsultasProducto consultas;
    /*
    private final frmProducto vista;
    Una vista grafica (frmProducto) que contiene los botones y los campos de texto.
    */
    private final frmProducto vista;
    
    
    
    //constructor lleno

    public CtrlProducto(Producto modelo, ConsultasProducto consultas, frmProducto vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        /*
        Registro de botones con ActionListener:
        Registrar un boton con ActionListener significa que se esta vinculando un boton con el codigo que debe ejecutarse cuando se le hace click.
        Un ActionListener es una interfaz que permite decirle al programa:
        "Cuando el usuario haga click en este boton (u otro componente), quiero que se ejecute cierto codigo".
        
        */
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
    }
    
    //metodos
    
    
    //El proposito de este metodo es preparar la ventana (vista) para el usuario cuando la aplicacion inicia.
    public void iniciar(){
        /*
        vista.setTitle("Productos");
        Le agrega el titulo a la ventana.
        */
        vista.setTitle("Productos");
        /*
        vista.setLocationRelativeTo(null);
        Coloca la ventana en el medio de la pantalla.
        */
        vista.setLocationRelativeTo(null);
        /*
        vista.txtId.setVisible(false);
        Aqui se oculta el campo de texto del id.
        Se oculta porque normalmente el id es autogenerado por la base de datos (como AUTO_INCREMENT en MySQL).
        El usuario no necesita ni debe modificar el id, por eso se oculta.
        */
        vista.txtId.setVisible(false);
        
    }
    
    /*
    public void limpiar():
    Este metodo sirve para limpiar los campos de texto y el requestFocus para poner el cursos en el txtCodigo.
    */
    public void limpiar(){
        vista.txtId.setText("");
        vista.txtCodigo.setText("");
        vista.txtNombre.setText("");
        vista.txtPrecio.setText("");
        vista.txtCantidad.setText("");
        vista.txtCodigo.requestFocus();
    }
    
    
    /*
    public void actionPerformed(ActionEvent e):
    Un actionPerformed(ActionEvent e) es un metodo que se ejecuta automaticamente cada vez que el usuario hace click en 
    un boton que esta registrado con addActionListener(this).
    El parametro e contiene informacion sobre cual boton fue presionado.
    */
    @Override
    public void actionPerformed(ActionEvent e){
        
        //boton guardar
        
        /*
        if(e.getSource()==vista.btnGuardar):
        Verifica si el boton presionado fue btnGuardar.
        */
        if(e.getSource()==vista.btnGuardar){
            
            /*
            Toma los datos que el usuario escribio en los campos de texto.
            Luego lo asigna al objeto modelo, que representa un producto.
            */
            modelo.setCodigo(vista.txtCodigo.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            modelo.setCantidad(Integer.parseInt(vista.txtCantidad.getText()));
            
            /*
            if(consultas.registrar(modelo)):
            Se llama al metodo registrar(modelo), que intenta guardar el producto en la base de datos.
            */
            if(consultas.registrar(modelo)){
                //Si devuelve true, se imprime mensaje en pantalla.
                JOptionPane.showMessageDialog(null,"Registro guardado");
                //Se limpia la ventana.
                limpiar();
            }else{
                //Si devuelve false, se imprime un mensaje en pantalla.
                JOptionPane.showMessageDialog(null,"Error al guardar");
                //Se limpia la ventana. 
                limpiar();
            }
            
        }
        
        //boton modificar
        
        /*
        if(e.getSource()==vista.btnModificar):
        Verifica si el boton presionado fue btnModificar.
        */
        if(e.getSource()==vista.btnModificar){
            /*
            Estas lineas leen los datos que el usuario escribio en el formulario y los asigna al objeto Producto (modelo).
            */
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            modelo.setCodigo(vista.txtCodigo.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            modelo.setCantidad(Integer.parseInt(vista.txtCantidad.getText()));
            /*
            if(consultas.modificar(modelo)):
            Se llama al metodo modificar(modelo), que intenta actualizar el producto en la base de datos.
            */
            if(consultas.modificar(modelo)){
                //Si la modificacion fue exitosa, se muestra un mensaje en pantalla.
                JOptionPane.showMessageDialog(null,"Registro modificado");
                //Se limpia la ventana.
                limpiar();
            }else{
                //Si la modificacion no fue exitosa, se muestra un mensaje en pantalla.
                JOptionPane.showMessageDialog(null,"Error al modificar");
                //Se limpia la ventana. 
                limpiar();
            }
            
        }
        
        //boton eliminar
        /*
        if(e.getSource()==vista.btnEliminar):
        Verifica si el boton presionado fue btnEliminar
        */
        if(e.getSource()==vista.btnEliminar){
            /*
            modelo.setId(Integer.parseInt(vista.txtId.getText())):
            Aqui se lee el campo oculto txtId, que contiene el id del producto cargado anteriormete por ejemplo al hacer una busqueda.
            */
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            /*
            if(consultas.eliminar(modelo)):
            Se llama al metodo consultas.eliminar(modelo), que hace un DELETE en la base de datos usando ese id.
            */
            if(consultas.eliminar(modelo)){
                //Si la eliminacion fue exitosa, se muestra un mensaje en pantalla.
                JOptionPane.showMessageDialog(null,"Registro eliminado");
                //Se limpia la ventana
                limpiar();
            }else{
                //Si la eliminacion no fue exitosa, se imprime un mensaje en pantalla.
                JOptionPane.showMessageDialog(null,"Error al eliminar");
                //Se limpia la ventana. 
                limpiar();
            }
            
        }
        
        //boton buscar
        /*
        if(e.getSource()==vista.btnBuscar):
        Verifica si el boton presionado fue btnBuscar.
        */
        if(e.getSource()==vista.btnBuscar){
            /*
            modelo.setCodigo(vista.txtCodigo.getText());
            Obtiene el texto que el usuario escribio en el campo de codigo (txtCodigo) y se lo asigna al objeto modelo.
            El sistema usara ese codigo para buscar en la base de datos.
            */
            modelo.setCodigo(vista.txtCodigo.getText());
            /*
            if(consultas.buscar(modelo)):
            Se llama al metodo consultas.buscar(modelo) de la clase ConsultasProducto.
            Este metodo consulta la base de datos para ver si existe un producto con ese codigo.
            */
            if(consultas.buscar(modelo)){
                /*
                Si se encontro el producto:
                Estos comandos llenan los campos de texto del formulario con todos los datos obtenidos del objeto modelo.
                txtId se llena aunque este oculto, para que el programa sepa cual es el id del producto, importante para modificar o eliminar.
                */
                vista.txtId.setText(String.valueOf(modelo.getId()));
                vista.txtCodigo.setText(modelo.getCodigo());
                vista.txtNombre.setText(modelo.getNombre());
                vista.txtPrecio.setText(String.valueOf(modelo.getPrecio()));
                vista.txtCantidad.setText(String.valueOf(modelo.getCantidad()));
            }else{
                //Si no se encontro muestra un mensaje en pantalla.
                JOptionPane.showMessageDialog(null,"No se encontro el registro");
                //Se limpia la ventana.
                limpiar();
            }
            
        }
        
        
        //boton limpiar
        
        //Si el boton presionado fue btnLimpiar, se limpia la ventana.
        if(e.getSource()==vista.btnLimpiar){
            limpiar();
        }
        
    }
    
    

  
}
