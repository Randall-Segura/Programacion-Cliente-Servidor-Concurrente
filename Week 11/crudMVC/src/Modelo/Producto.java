package Modelo;

/**
 *
 * @author Usuario
 */
public class Producto {

    //atibutos
    private int id;
    private String codigo;
    private String nombre;
    private Double precio;
    private int cantidad;
    
    
    //constructor vacio

    public Producto() {
        this.id = 0;
        this.codigo = "";
        this.nombre = "";
        this.precio = 0.0d;
        this.cantidad = 0;
    }
    
    
    //constructor lleno

    public Producto(int id, String codigo, String nombre, Double precio, int cantidad) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    
    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
    
}
