/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec01;

/**
 *
 * @author Randall Segura
 */
public class Lec01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo equipo1= new Equipo("Real Madrid", "Madrid",1902,"estadio", 35);
        Equipo equipo2= new Equipo("Barcelona", "Barcelona",1910,"estadio", 41);
        
        System.out.println("Cantidad titulos Real Madrid: "+ equipo1.getCantTitulos());
        System.out.println("Cantidad titulos Barcelona: " + equipo2.getCantTitulos());
        
        equipo2.setCantTitulos(26);
        
        System.out.println(equipo1.toString());
        System.out.println(equipo2);
        
        Equipo equipo3= new Equipo();
        equipo3.setNombre("Saprissa");
        equipo3.setCiudad("Tibas");
        equipo3.setFundacion(1800);
        equipo3.setEstadio("Ricardo Saprissa");
        equipo3.setCantTitulos(25);
        System.out.println(equipo3);
    }
    
}
