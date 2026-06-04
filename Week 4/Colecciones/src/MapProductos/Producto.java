
package MapProductos;
import java.util.Objects;


public class Producto implements Comparable<Producto> {
    
    //atributos
    
    private String referencia;
    private String nombre;
    private float precio;
    
    //constructor lleno

    public Producto(String referencia, String nombre, float precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //getter and setters

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    //metodo hashCode, se usan en estructuras como HashMap, HashSet, para ubicar eficientemente objetos
    @Override
    public int hashCode(){
        return Objects.hash(referencia,nombre,precio);
    }
    
    
    //metodo compareTo, se utiliza para el orden natural de objetos
    @Override
    public int compareTo(Producto o){
        return Float.compare(precio,o.getPrecio());
    }

    
    
    //toString
    @Override
    public String toString() {
        return "Producto{" + "referencia=" + referencia + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
}
