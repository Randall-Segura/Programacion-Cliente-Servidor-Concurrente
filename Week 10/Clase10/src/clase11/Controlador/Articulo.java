package clase11.Controlador;

/**
 *
 * @author Usuario
 */
public class Articulo {

    
    //atributos
   private int codigo;
   private String descripcion;
   private float precio;
    
    //constructor vacio

    public Articulo() {
        this.codigo = 0;
        this.descripcion = "";
        this.precio = 0;
    }
    
    
    
    //constructor lleno

    public Articulo(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    // este constructor lleno es para buscar por codigo
    public Articulo(int codigo){
        this.codigo=codigo;
    }
    //getters and setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
   
   
}
