/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraclase;


public class Bodeguero extends RRHH {
    
    //atributos
    
    private String tipoTrabajo;
    
    //constructor vacio
    
    public Bodeguero(){
        this.tipoTrabajo="";
    }
    
    
    //constructor lleno



    public Bodeguero(String nombre, int edad, int experiencia, String idioma, String tipoTrabajo) {
        super(nombre, edad, experiencia, idioma);
        this.tipoTrabajo = tipoTrabajo;
            
    }
    
    
    
    //getters and setters

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }
    
    
    //toString
    
    
    @Override
    public String toString(){
        return super.toString()
                +"\nTipo de trabajo: " + this.getTipoTrabajo();
    }
    
    
    
    
}
