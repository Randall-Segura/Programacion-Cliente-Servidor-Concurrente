/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraclase;

/**
 *
 * @author Randall Segura
 */
public class AyudanteChofer extends Chofer{
    
    
    //atributos
    
    private String estadoCivil;
    
    
    //constructor vacio
    
    public AyudanteChofer(){
        this.estadoCivil="";
    }
    
    
    //constructor lleno

    

    public AyudanteChofer(String nombre, int edad, int experiencia, String tipoLicencia, String estadoCivil) {
        super(nombre, edad, experiencia, tipoLicencia);
        this.estadoCivil = estadoCivil;
    }
    
    
    //getters and setters 

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    //toString
    @Override
    public String toString(){
        return super.toString()
                +"\nEstado Civil: " + this.getEstadoCivil();
    }
    
    
    
}
