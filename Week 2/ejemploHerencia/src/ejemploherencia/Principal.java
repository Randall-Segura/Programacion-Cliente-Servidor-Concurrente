
package ejemploherencia;


public class Principal {

    
    public static void main(String[] args) {
        
        System.out.println("\n-----Conductor-----");  
        Conductor c1= new Conductor("Randall",19,"b1");
        System.out.println(c1);
        
        System.out.println("\n-----Taxista-----");
        Taxista t1= new Taxista("Valeria",19,"b1",1);
        System.out.println(t1);
            
                
  
    }
    
}
