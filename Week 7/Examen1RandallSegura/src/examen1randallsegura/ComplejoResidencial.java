/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1randallsegura;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public  class ComplejoResidencial implements Administrable {
    
    //atributos
    
    private String nombreComplejo;
    
    
    //constructor vacio
    
    public ComplejoResidencial(){
        this.nombreComplejo="";
        
    }
    
    //constructor lleno

    public ComplejoResidencial(String nombreComplejo) {
        this.nombreComplejo = nombreComplejo;
    }
    
    //getter and setters

    public String getNombreComplejo() {
        return nombreComplejo;
    }

    public void setNombreComplejo(String nombreComplejo) {
        this.nombreComplejo = nombreComplejo;
    }
    
    //metodo sobreescrito
    
    @Override
    public String registrarApartamento(){
        int cantidadApartamentos=0;
        int cantidadLujo=0;
        int cantidadEstandar=0;
        int precioLujo=85000;
        int precioEstandar=40000;
        int totalLujo=0;
        int totalEstandar;
        int resultado=0;
        cantidadApartamentos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de apartamentos"));
        
        cantidadLujo=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de apartamentos estandar"));
        totalLujo= cantidadLujo*precioLujo;
        
        cantidadEstandar=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de apartamentos estandar"));
        totalEstandar=cantidadEstandar*precioEstandar;
        
        resultado=totalEstandar + totalLujo;
        return "La cantidad de apartamentos es de: " + cantidadApartamentos + "\nIngresos esperados: " + resultado;
        
        
        
    }
    
    
    //toString
    
    
    @Override
    public String toString(){
       return "\nNombre de complejo: " + this.getNombreComplejo()
               +"\nCantidad de apartamentos: " + registrarApartamento();
       
    }

    @Override
    public String calcularAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
}
