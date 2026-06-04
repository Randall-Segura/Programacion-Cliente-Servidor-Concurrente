
package sistemasolar;


public class PlanetaGaseoso extends Planeta{   //clase hija de planeta, hereda de planeta
    
    //atributos
    
    
    private String composicionPrincipal;
    private double velocidadViento;
    private double profundidadAtmosferica;
    private boolean tieneNucleoSolido;
    
    //constructor vacio
    
    public PlanetaGaseoso(){
        this.composicionPrincipal="";
        this.velocidadViento=0;
        this.profundidadAtmosferica=0;
        this.tieneNucleoSolido=false;
    }
    
    //constructor lleno

    public PlanetaGaseoso(String nombre,String composicionPrincipal, double velocidadViento, double profundidadAtmosferica, boolean tieneNucleoSolido) {
        super(nombre);
        this.composicionPrincipal = composicionPrincipal;
        this.velocidadViento = velocidadViento;
        this.profundidadAtmosferica = profundidadAtmosferica;
        this.tieneNucleoSolido = tieneNucleoSolido;
    }
    
    
    //getters and setters 

    public String getComposicionPrincipal() {
        return composicionPrincipal;
    }

    public double getVelocidadViento() {
        return velocidadViento;
    }

    public double getProfundidadAtmosferica() {
        return profundidadAtmosferica;
    }

    public boolean isTieneNucleoSolido() {
        return tieneNucleoSolido;
    }
    
    //toString
    
    @Override
    public String toString(){
        return  "\nNombre: " + this.getNombre()
                +"\nComposicion principal: " + this.getComposicionPrincipal()
                +"\nVelocidad del viento: " + this.getVelocidadViento() + " km/h"
                +"\nProfundidad atmosferica: " + this.getProfundidadAtmosferica() + " km"
                +"\nTiene nucleo solido: " + (this.isTieneNucleoSolido()? "Si" : "No");
    }
    
    
    
    
}
