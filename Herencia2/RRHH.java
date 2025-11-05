/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraclase;


 
public class RRHH extends Recepcionista{
    
    //atributos
    
    private String idioma;
    
    //constructor vacio
    
    public RRHH(){
        this.idioma="";
    }
    
    
    //constructor lleno

    

    public RRHH( String nombre, int edad, int experiencia, String idioma) {
        super(nombre, edad, experiencia);
        this.idioma = idioma;
    }
    
    
    //getters and setters 

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    //toString
    
    @Override
    public String toString(){
        return super.toString()
                +"\nIdioma:" + this.getIdioma();
    }
    
    
    
    
    
}
