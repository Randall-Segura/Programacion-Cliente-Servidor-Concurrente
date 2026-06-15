/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Randall Segura
 */
public class Cajas {
    
    //atributos
    
    private int idCaj;
    private int numReferencia;
    private String contenido;
    private int precio;
    private int almacen;
    
    
    //constructor vacio

    public Cajas() {
        this.idCaj=0;
        this.numReferencia = 0;
        this.contenido = "";
        this.precio = 0;
        this.almacen = 0;
    }
    
    
    //constructor lleno

    public Cajas(int idCaj,int numReferencia, String contenido, int precio, int almacen) {
        this.idCaj=idCaj;
        this.numReferencia = numReferencia;
        this.contenido = contenido;
        this.precio = precio;
        this.almacen = almacen;
    }
    
    //getters and setters

    public int getIdCaj() {
        return idCaj;
    }

    public void setIdCaj(int idCaj) {
        this.idCaj = idCaj;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAlmacen() {
        return almacen;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }

   
   
    
    
            
    
    
}
