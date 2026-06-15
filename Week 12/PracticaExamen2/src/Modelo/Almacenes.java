/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Randall Segura
 */
public class Almacenes {
    
    //atributos
    
    private int idAlm;
    private int codigo;
    private String lugar;
    private int capacidad;
    
    
    //constructor vacio

    public Almacenes() {
        this.idAlm=0;
        this.codigo = 0;
        this.lugar = "";
        this.capacidad = 0;
    }
    
    
    //constructor lleno

    public Almacenes(int idAlm,int codigo, String lugar, int capacidad) {
        this.idAlm=idAlm;
        this.codigo = codigo;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }
    
    
    //getters and setters

    public int getIdAlm() {
        return idAlm;
    }

    public void setIdAlm(int idAlm) {
        this.idAlm = idAlm;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
    
}
