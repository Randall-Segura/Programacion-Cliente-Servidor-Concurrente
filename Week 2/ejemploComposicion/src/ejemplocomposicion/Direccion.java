/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocomposicion;

/**
 *
 * @author Randall Segura
 */
public class Direccion {
    
    //atributos
    private String calle;
    private String ciudad;
    private String pais;
    
    
    
    //constructor vacio
    
    public Direccion(){
        this.calle="";
        this.ciudad="";
        this.pais="";
    }
    
    

    //constructor lleno
    
    public Direccion(String calle, String ciudad, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    

    
    
    //getters and setters
    
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

  


    //toString, se estara haciendo manualmente esta vez para poder aprovechar el get, hay que tocar el bombillo para que se agregue el "override"

    @Override
    public String toString(){
        return "\nCalle: " + this.getCalle()
                +"\nCiudad: " + this.getCiudad()
                +"\nPais: " + this.getPais();
    }
    

    
    
    
    
}
