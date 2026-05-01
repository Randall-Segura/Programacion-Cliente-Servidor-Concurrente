
package lec01;


public class Principal {

    
    public static void main(String[] args) {
        
        
        Equipo equipo1= new Equipo("Real Madrid","Madrid",1902,"Estadio",35);
        Equipo equipo2= new Equipo("Barcelona", "Barcelona", 1900, "Estadio", 30);
        
        System.out.println("Cantitad de titulos del Real Madrid: " + equipo1.getCantTitulos());
        System.out.println("Cantidad de titulos del Barcelona: " + equipo2.getCantTitulos());
        
        
        equipo2.setCantTitulos(26);
        
        System.out.println(equipo1);
        System.out.println(equipo2);
        
        Equipo equipo3= new Equipo();
        equipo3.setNombre("Inter Miami");
        equipo3.setCiudad("Miami");
        equipo3.setFundacion(2020);
        equipo3.setEstadio("Miami");
        equipo3.setCantTitulos(5);
        
        System.out.println("Equipo 3 \n" + equipo3);
        
        
        
        
    }
    
}
