/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec01;

/**
 *
 * @author Randall Segura
 */
public class Equipo {
    
    //atributos, se deben hacer manualmente 
    private String nombre;
    private String ciudad;
    private int fundacion;
    private String estadio;
    private int cantTitulos;
    
    
    //los siguiente seran los metodos de la clase
    
    
    //constructor por defecto, este se debe de hacer manualmente 
    public Equipo(){
        this.nombre="";
        this.ciudad="";
        this.fundacion=0;
        this.estadio="";
        this.cantTitulos=0;
    }
    //constructor lleno con parametros, este se puede hacer automaticamente, click derecho, insert code, constructor
    public Equipo(String nombre, String ciudad, int fundacion, String estadio, int cantTitulos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.estadio = estadio;
        this.cantTitulos = cantTitulos;
    }

    
    
    //getter and setter, este se hace automaticamente, click derecho, insert code, getters and setters, seleccionar la casilla de encapsulamiento
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

    
    
    
    /* toString se debe poner para que cuando se ejecute el codigo, no salgan las posiciones de la memoria cuando se desea imprimir algo, se hace porque en el
    principal, nosotros utilizamos el toString, entonces obligatoriamente debemos hacer esto, este se puede hacer automaticamente, click derecho, insert code,
    to string 
    */
    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", fundacion=" + fundacion + ", estadio=" + estadio + ", cantTitulos=" + cantTitulos + '}';
    }
    
    
    
    
}
