
package practicaherencia;


public class Conductor extends Persona  {
    
    
    //atributos
    
    private String tipoLicencia;
    
    //constructor vacio
    
    
    public Conductor(){
        this.tipoLicencia="";
    }
    
    
    
    //constructor lleno

    

    public Conductor( String nombre, int edad, String tipoLicencia) {
        super(nombre, edad);
        this.tipoLicencia = tipoLicencia;
    }
    
    
    
    //getters and setters

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
    //toString
    
    
    @Override
    public String toString(){
        return super.toString()
                +"\nTipo de Licencia: " + this.getTipoLicencia();
    }
    
    
    
    
   
    
    
}
