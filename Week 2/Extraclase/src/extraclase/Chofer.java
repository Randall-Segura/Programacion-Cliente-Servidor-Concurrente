
package extraclase;


public class Chofer extends Recepcionista {
    
    //atributos
    private String tipoLicencia;
    
    //constructor vacio
    
    public Chofer(){
        this.tipoLicencia="";
    }
    
    //constructor lleno

   

    public Chofer(String nombre, int edad, int experiencia, String tipoLicencia) {
        super(nombre, edad, experiencia);
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
