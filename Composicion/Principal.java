
package ejemplocomposicion;


public class Principal {

    
    public static void main(String[] args) {
        
       Direccion d1= new Direccion("Calle 3", "Aserri", "Costa Rica");
       Direccion d2= new Direccion("Calle 2", "Desamparados", "Costa Rica");
        
       Persona p1= new Persona("Maria Mora", d1);
       
       Empresa emp1= new Empresa("Coseli", d2);
       
       
        System.out.println(p1);
        System.out.println(emp1);
       
    }
    
}
