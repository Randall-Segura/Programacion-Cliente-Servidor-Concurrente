
package ejemplocomposicion;

/**
 aqui lo que se puede hacer es copiar todo el codigo de empresa pero nada mas le cambios la palabra empresa por persona en donde se requiera
 */
public class Persona {
    
    //atributos
    private String nombre;
    private Direccion direccion; //se llama a direccion, la clase que ya fue creada, a esto se le llama composicion
    
    //constructor vacio
    
    public Persona(){
        this.nombre="";           //no se inicializa direccion porque ya esta previamente inicializado 
    }
    
    
    //constructor lleno

    public Persona(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
      return "\nPersona: " + this.getNombre()
              +"\nDireccion: " + this.getDireccion();
    }
     
    
    
}
