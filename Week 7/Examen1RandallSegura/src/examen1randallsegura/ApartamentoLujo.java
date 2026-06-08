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
public  class ApartamentoLujo extends Apartamento implements Administrable {
    
    //atributos
    
    private String tipoLujo;
    private boolean tieneJacuzzi;
    private int cantidadBanos;
    
    
    //constructor vacio
    
    
    public ApartamentoLujo(){
        this.tipoLujo="";
        this.tieneJacuzzi=false;
        this.cantidadBanos=0;
    }
    
    
    //constructor lleno

    public ApartamentoLujo(int nApartamento, int nCuadrados, String tipo,String tipoLujo, boolean tieneJacuzzi, int cantidadBanos) {
        super(nApartamento,nCuadrados,tipo);
        this.tipoLujo = tipoLujo;
        this.tieneJacuzzi = tieneJacuzzi;
        this.cantidadBanos = cantidadBanos;
    }
    
    //getters and setters

    public String getTipoLujo() {
        return tipoLujo;
    }

    public void setTipoLujo(String tipoLujo) {
        this.tipoLujo = tipoLujo;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    public void setTieneJacuzzi(boolean tieneJacuzzi) {
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(int cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }
    
    
    //metodo sobreescrito 
    
    @Override
    public String calcularAlquiler(){
        double precio=85000;
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
                +"\nTipo de lujo: "+ this.getTipoLujo()
                +"\nTiene Jacuzzi: " + (this.isTieneJacuzzi()?"Si" : "No")
                +"\nCantidad de banos: " + this.getCantidadBanos()+
                "\nPrecio: " + calcularAlquiler();
    }

    @Override
    public String registrarApartamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
