/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class JuegoDados implements Juego{     //implements se utiliza porque yo estoy implementando la interfaz Juego
    
    
    //atributos
    
    private int dado1,dado2;
    private String jugador1,jugador2;
    
    
    //constructor vacio

    public JuegoDados() {
        this.dado1=0;
        this.dado2=0;
        this.jugador1="";
        this.jugador2="";
    }

    
    
    //constructor lleno 
    public JuegoDados(int dado1, int dado2, String jugador1, String jugador2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    
    
    //metodo sobreescrito
    
    @Override
    public void iniciar(){
        jugador1=JOptionPane.showInputDialog("Digite el nombre del jugador 1: ");
        jugador2=JOptionPane.showInputDialog("Digite el nombre del jugador 2: ");
    }
    
    @Override
    public void jugar(){
        dado1= (int) (Math.random()*6)+1;       
        dado2= (int) (Math.random()*6)+1;       
        JOptionPane.showMessageDialog(null,"El jugador 1 obtuvo: " + dado1 + "\nEl jugador 2 obtuvo: " + dado2);
    }
    
    
    @Override
    public void finalizar(){
        if (dado1>dado2){
            JOptionPane.showMessageDialog(null,"Ha ganado " + jugador1 + " ,el jugador 1 con un puntaje de " + dado1);
        }else if(dado2>dado1){
            JOptionPane.showMessageDialog(null,"Ha ganado " + jugador2 + " ,el jugador 2 con un puntaje de " + dado2);  
        }else{
            JOptionPane.showMessageDialog(null,"Ha sido un empate entre " + jugador1 + " y " + jugador2 + "Dado 1: " + dado1 + "Dado2: " + dado2);
        }
    }
    
}
