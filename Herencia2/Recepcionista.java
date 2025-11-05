
package extraclase;

public class Recepcionista extends Persona {
    
    
    //atributos
    private int experiencia;
    
    
    //constructor vacio
    
    public Recepcionista(){
        this.experiencia=0;
    }
    
    
    //constructor lleno

    

    public Recepcionista(String nombre, int edad, int experiencia) {
        super(nombre, edad);
        this.experiencia = experiencia;
    }
    
    //getters and setters

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    //toString 
    
    @Override
    public String toString(){
        return super.toString()
                +"\nExperiencia: " + this.getExperiencia();
    }
           
    
    
    
}
