/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Randall Segura
 */
public class Juguete {
    
    
    //atributos
    
    private int id;
    private int codigo;
    private String descripcion;
    private String tipo;
    private double precio;
    
    
    //constructor vacio

    public Juguete() {
        this.id = 0;
        this.codigo=0;
        this.descripcion = "";
        this.tipo = "";
        this.precio = 0;
    }
    
    
    //constructor lleno

    public Juguete(int id, int codigo, String descripcion, String tipo, double precio) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
    }

    
    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
}
