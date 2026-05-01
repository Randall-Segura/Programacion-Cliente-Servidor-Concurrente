
package lec01;


public class Equipo {
    
    //atributos
    
    private String nombre;
    private String ciudad;
    private int fundacion;
    private String estadio;
    private int cantTitulos;
    
    
    //constructor vacio
    
    
    public Equipo(){
        this.nombre="";
        this.ciudad="";
        this.fundacion=0;
        this.estadio="";
        this.cantTitulos=0;
        
    }
    
    
    //constructor lleno

    public Equipo(String nombre, String ciudad, int fundacion, String estadio, int cantTitulos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.estadio = estadio;
        this.cantTitulos = cantTitulos;
    }
    
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getCantTitulos() {
        return cantTitulos;
    }

    public void setCantTitulos(int cantTitulos) {
        this.cantTitulos = cantTitulos;
    }
    
    
    //toString

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", fundacion=" + fundacion + ", estadio=" + estadio + ", cantTitulos=" + cantTitulos + '}';
    }

    
    
    
}
