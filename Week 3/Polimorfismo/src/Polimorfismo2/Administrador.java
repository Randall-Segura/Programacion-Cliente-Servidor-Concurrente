
package Polimorfismo2;


public class Administrador extends Usuario {
    
    //no va a tener atributos porque ya los trae de la clase usuario

    
    
    //constructor lleno
    
    public Administrador(String nombre, String correo) {
        super(nombre, correo);
    }
    
    
    
    
    @Override
    public void autenticar(){
        System.out.println("\nAutenticacion con privilegio de administrador");
    }
    
    
    
    
}
