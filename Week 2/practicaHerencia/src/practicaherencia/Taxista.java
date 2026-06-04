
package practicaherencia;


public class Taxista extends Conductor{
    
    
    //atributos
    
    private int experiencia;
    
    //constructor vacio
    
    public Taxista(){
        this.experiencia=0;
    }
    
    
    
    //constructor lleno

    

    public Taxista(String nombre, int edad, String tipoLicencia, int experiencia) {
        super(nombre, edad, tipoLicencia);
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
