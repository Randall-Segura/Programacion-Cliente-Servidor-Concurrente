/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1randallsegura;

/**
 *
 * @author Randall Segura
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("---Apartamento de Lujo---");
        ApartamentoLujo AL1= new ApartamentoLujo(1,200,"Clase alta","VIP",true,2);
        System.out.println(AL1);
        
        
        System.out.println("\n---Apartamento Estandar---");
        ApartamentoEstandar  AE1= new ApartamentoEstandar(2, 100, "Normal", 1, false, false);
        System.out.println(AE1);
        
        
        System.out.println("\n---Registro de apartamentos---");
        ComplejoResidencial CR1= new ComplejoResidencial("Jicaro Verde");
        System.out.println(CR1);
        
    }
    
}
