
package extraclase;


public class OficialSeguridad extends Recepcionista {
    
    
    //atributos 
    
    private int horasLaboradas;
    
    //constructor vacio
    
    
    public OficialSeguridad(){
        
    }
    
    
    //constructor lleno

    

    public OficialSeguridad(String nombre, int edad, int experiencia, int horasLaboradas) {
        super(nombre, edad, experiencia);
        this.horasLaboradas = horasLaboradas;
    }
    
    
    //getters and setters

    public int getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(int horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }
    
    
    //toString
    
    @Override
    public String toString(){
        return super.toString()
             +"\nHoras laboradas: " +this.getHorasLaboradas();
        
    }
    
           
    
    
  
    
}
