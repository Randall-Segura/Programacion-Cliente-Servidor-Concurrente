
package polimorfismo;

//esta es la clase padre, de esta van a heredar todas las demas


public abstract class Figuras {
    
    //atributos
    
    private String nombre;
    
    
    //constructor vacio
    
    public Figuras(){
        this.nombre="";
        
    }
    
    
    
    //constructor lleno 

    public Figuras(String nombre) {
        this.nombre = nombre;
       
    }
    
    
    //getter and setter
    //aqui se puede hacer con refactor y seleccionar unicamente el get y el set del nombre 

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    //creacion de metodos abstractos
    public abstract double getArea(); 
    public abstract double getPerimetro(); 
    
    
    //toString 

    @Override
    public String toString() {
        return "\nNombre: " + this.getNombre();
    }
    
    
        
    
    
    
}
