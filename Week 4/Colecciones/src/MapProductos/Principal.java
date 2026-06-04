
package MapProductos;

import java.util.HashMap;
import java.util.Map;


public class Principal {

    
    public static void main(String[] args) {
        
        Map<String, Producto> hashMap= new HashMap<>();
        Producto tec= new Producto("PC00123", "Mouse", 3700);
        Producto toc= new Producto("PC00130", "Monitor",90000);
        hashMap.put("PC00130",toc);
        hashMap.put("PC00123", tec);
        hashMap.put("PC00124", new Producto("PC00124", "Silla Gamer", 145000));
        hashMap.put("PC00125", new Producto("PC00125", "Teclado", 45000));
        hashMap.put("PC00126", new Producto("PC00126", "Ram DDR4", 14500));
        
        
        //preguntamos si existe un producto en la referencia x
        
        if (hashMap.containsKey("PC00127")){
            System.out.println("El map contiene la referencia");
        }else{
            System.out.println("El map no contiene la referencia");
        }
        
        //si contiene un producto
        
        if (hashMap.containsValue(tec)){
            System.out.println("El map contiene el objeto");
        }else{
            System.out.println("El map no contiene el objeto");
        }
        
        

        for (String mapa: hashMap.keySet()) {
            System.out.println(hashMap.get(mapa));
            
        }
       
        
        
    }
    
}
