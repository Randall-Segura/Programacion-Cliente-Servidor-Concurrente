
package sistemasolar;


public class PlanetaRocoso extends Planeta {   //clase hija de planeta, hereda de planeta
    
    //atributos
    
   private boolean tieneAgua;
   private String tipoSuperficie;
   private boolean tieneAtmosfera;
   private boolean tieneActividadGeologica;
   
   //constructor vacio
   
   
   public PlanetaRocoso(){
       this.tieneAgua=false;
       this.tipoSuperficie="";
       this.tieneAtmosfera=false;
       this.tieneActividadGeologica=false;
   }
   
   //constructor lleno

    
    

    public PlanetaRocoso(String nombre,boolean tieneAgua, String tipoSuperficie, boolean tieneAtmosfera, boolean tieneActividadGeologica) {
        super(nombre);
        this.tieneAgua = tieneAgua;
        this.tipoSuperficie = tipoSuperficie;
        this.tieneAtmosfera = tieneAtmosfera;
        this.tieneActividadGeologica = tieneActividadGeologica;
    }
   
   //geters and setters

    public boolean isTieneAgua() {
        return tieneAgua;
    }

    public String getTipoSuperficie() {
        return tipoSuperficie;
    }

    public boolean isTieneAtmosfera() {
        return tieneAtmosfera;
    }

    public boolean isTieneActividadGeologica() {
        return tieneActividadGeologica;
    }
    
    //toString
    
   @Override
    public String toString() {

        return "\nNombre: " + this.getNombre()
                + "\nTiene agua: " + (this.isTieneAgua() ? "Si" : "No")
                + "\nTipo de Superficie: " + this.getTipoSuperficie()
                + "\nTiene atmosfera: " + (this.isTieneAtmosfera() ? "Si" : "No")
                + "\nTiene actividad geologica: " + (this.isTieneActividadGeologica() ? "Si" : "No");
    }
   
   
    
    
    
}
