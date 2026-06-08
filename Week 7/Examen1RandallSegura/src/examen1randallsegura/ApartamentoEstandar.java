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
public class ApartamentoEstandar extends Apartamento implements Administrable {
    
    //atributos
    
    private int cantHabitaciones;
    private boolean tieneParqueo;
    private boolean tieneBalcon;
    
    
    //constructor vacio
    
    public ApartamentoEstandar(){
        this.cantHabitaciones=0;
        this.tieneParqueo=false;
        this.tieneBalcon=false;
        
    }
    
    //constructor lleno

    public ApartamentoEstandar(int nApartamento, int nCuadrados, String tipo,int cantHabitaciones, boolean tieneParqueo, boolean tieneBalcon) {
        super(nApartamento,nCuadrados,tipo);
        this.cantHabitaciones = cantHabitaciones;
        this.tieneParqueo = tieneParqueo;
        this.tieneBalcon = tieneBalcon;
    }
    
    //getters and setters

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isTieneParqueo() {
        return tieneParqueo;
    }

    public void setTieneParqueo(boolean tieneParqueo) {
        this.tieneParqueo = tieneParqueo;
    }

    public boolean isTieneBalcon() {
        return tieneBalcon;
    }

    public void setTieneBalcon(boolean tieneBalcon) {
        this.tieneBalcon = tieneBalcon;
        
        
        
        
    }
    
    
    
    //metodo sobreescrito
    
    @Override
    public String calcularAlquiler(){
        double precio=40000;
        int diasAlquilados=0;
        
        
        try{
            
        diasAlquilados=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de dias que se va a hospedar"));
        double resultado= precio*diasAlquilados;
        if (diasAlquilados<=0){
            throw new NumberFormatException("Digite una cantidad de dias mayor a 0");
        }
            
        return "El total a pagar es de: " + resultado;
            
        }catch(NumberFormatException e ){
            JOptionPane.showMessageDialog(null,e.getMessage());
            return "";
        }
        
        
        
    }
    
    
    
    //toString
    
    @Override
    public String toString(){
        return super.toString()
                +"\nCantidad de habitaciones: " + this.getCantHabitaciones()
                +"\nTiene parqueo: " + (this.isTieneParqueo()?"Si" : "No")
                +"\nTiene balcon: " + (this.isTieneBalcon()?"Si" : "No")
                +"\nPrecio: " + calcularAlquiler();
    }

    @Override
    public String registrarApartamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
