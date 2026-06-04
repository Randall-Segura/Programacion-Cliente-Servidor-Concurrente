
package Polimorfismo2;


public class Principal {

   
    public static void main(String[] args) {
        
        
        Usuario us[]= new Usuario[3];
        us[0]= new Administrador("Juana Lopez", "ja@empresa.com");
        us[1]= new Cliente("Hector Ramirez", "ramirez@gmail.com");
        us[2]= new Empleado("Elena Gomez", "ele@empresa.com");
        
        
        for (int i = 0; i < us.length; i++) {
            us[i].autenticar();
            System.out.println(us[i]);
            
        }
        
    }
    
}
