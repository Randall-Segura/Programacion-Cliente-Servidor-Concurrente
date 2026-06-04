
package interface2;


public class Principal {

    
    public static void main(String[] args) {
        
        
       Animal a[]= new Animal[4];
       a[0]= new Gato("Felix", "Persa");
       a[1]= new Gato("Cleo", "Angora");
       a[2]= new Perro("Sally", "Doberman");
       a[3]= new Perro("Paquita", "Chihuahua");
       
       
       
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "\n----------");
            
        }
       
    }
    
    
}
