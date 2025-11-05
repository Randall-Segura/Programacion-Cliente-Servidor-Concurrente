/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraclase;


public class GerenteGeneral extends RRHH {
    
    //atributos
    
    private int dineroGanado;
    
    
    //constructor vacio
    
    public GerenteGeneral(){
        this.dineroGanado=0;
    }
    
    
    //constructor lleno

    

    public GerenteGeneral(String nombre, int edad, int experiencia, String idioma, int dineroGanado) {
        super(nombre, edad, experiencia, idioma);
        this.dineroGanado = dineroGanado;
    }
    
    
    //getters and setters 

    public int getDineroGanado() {
        return dineroGanado;
    }

    public void setDineroGanado(int dineroGanado) {
        this.dineroGanado = dineroGanado;
    }
    
    //toString
    
    @Override
    public String toString(){
        return super.toString()
                +"\nDinero ganado: " + this.getDineroGanado();
    }
    
    
    
}
