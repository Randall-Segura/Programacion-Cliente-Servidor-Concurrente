
package practicaherencia;


public class Principal {

    
    public static void main(String[] args) {
        
        Conductor c1= new Conductor("Randall",19,"b1");
        System.out.println("\n-----Conductor-----");
        System.out.println(c1);
        
        
        
        
        Taxista t1= new Taxista("Valeria",19,"b1",5);
        System.out.println("\n-----Taxista-----" );
        System.out.println(t1);
       
        
    }
    
}
