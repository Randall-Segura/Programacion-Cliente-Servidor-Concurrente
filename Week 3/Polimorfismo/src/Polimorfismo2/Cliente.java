
package Polimorfismo2;


public class Cliente extends Usuario {
    
     //no va a tener atributos porque ya los trae de la clase usuario
    
    //constructor lleno
    
    public Cliente(String nombre, String correo) {
        super(nombre, correo);
    }
    
    
    @Override
    public void autenticar(){
        System.out.println("\nAutenticacion con privilegio de cliente estandar");
    }
    
}
