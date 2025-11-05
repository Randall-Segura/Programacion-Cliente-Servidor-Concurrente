
package ejemploherencia;


public class Persona {
    
    
    //atributos
    private String nombre;
    private int edad;
    
    
    //constructor vacio
    
    
    public Persona(){
        this.nombre="";
        this.edad=0;
        
    }
    
    //constuctor lleno

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //toString
    
    @Override
    public String toString(){
        return "\nNombre: " + this.getNombre()
                +"\nEdad: " + this.getEdad();
    }
    
    
    
    
    
    
    
    
}
