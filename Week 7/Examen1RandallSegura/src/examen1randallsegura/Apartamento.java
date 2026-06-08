/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1randallsegura;

/**
 *
 * @author Randall Segura
 */
public class Apartamento {
    
    //atributos
    
    private int nApartamento;
    private int mCuadrados;
    private String tipo;
    
    
    //constructor vacio

    public Apartamento() {
        this.nApartamento = 0;
        this.mCuadrados = 0;
        this.tipo = "";
    }
    
    
    //constructor lleno

    public Apartamento(int nApartamento, int mCuadrados, String tipo) {
        this.nApartamento = nApartamento;
        this.mCuadrados = mCuadrados;
        this.tipo = tipo;
    }
    
    
    //getters and setters

    public int getnApartamento() {
        return nApartamento;
    }

    public void setnApartamento(int nApartamento) {
        this.nApartamento = nApartamento;
    }

    public int getmCuadrados() {
        return mCuadrados;
    }

    public void setmCuadrados(int mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //to String
    
    
    @Override
    public String toString(){
        return "\nNumero de apartamento: " + this.getnApartamento()
                +"\nMetros cuadrados: " + this.getmCuadrados()
                +"\nTipo de apartamento: " + this.getTipo();
    }
    
}
