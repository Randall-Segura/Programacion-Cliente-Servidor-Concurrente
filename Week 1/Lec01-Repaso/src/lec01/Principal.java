
package lec01;

/**
 *
 * @author Randall Segura
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Equipo equipo1= new Equipo("Real Madrid", "Madrid", 1902,"Estadio", 35);
        Equipo equipo2= new Equipo("Barcelona", "Barcelona", 1900,"Estadio", 30);
        
        System.out.println("Cantidad de titulos del Real Madrid: " + equipo1.getCantTitulos());
        System.out.println("Cantidad de titulos del Barcelona: "+ equipo2.getCantTitulos());
        
        
        //Si se desea modificar algun atributo, se utliza SET por ejemplo:
        
        equipo2.setCantTitulos(26);
        
        System.out.println(equipo1.toString()); //el toString lo que hace es traer TODOS los datos del objeto que se haya llamado sin embargo si no se usa el
        System.out.println(equipo2);            // toString aqui en el principal como en el equipo2, no pasa nada, pero si es obligatorio poner el toStrong en la 
                                                //clase del equipo para que no nos imprima el espacio en memoria de donde estan guardados los datos
            
                                                
        /*Por otro lado, tambien se puede crear un equipo vacio, sin parametros dentro de los parentesis, pero nosotros se los tenemos que poner manualmente
          como se ve a continuacion 
        */   
        
        Equipo equipo3= new Equipo();
        equipo3.setNombre("Saprissa");
        equipo3.setCiudad("Tibas");
        equipo3.setFundacion(1800);
        equipo3.setEstadio("Ricardo Saprissa");
        equipo3.setCantTitulos(25);
        System.out.println("Equipo 3 \n" + equipo3);
    }
    
}
