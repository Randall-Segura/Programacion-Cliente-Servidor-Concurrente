
package sistemasolar;


public class CuerpoCeleste extends Planeta { //clase hija de planeta, hereda de planeta
    
    
    //atributos
    
    private String tipoCuerpoCeleste;

    //constructor vacio
    
    public CuerpoCeleste(){
        this.tipoCuerpoCeleste="";
    }
    
    
    //constructor lleno
    

     public CuerpoCeleste(String tipoCuerpoCeleste, String nombre) {
        super(nombre);
        this.tipoCuerpoCeleste = tipoCuerpoCeleste;
    }
    
   
    
    //getters 
     
     public String getTipoCuerpoCeleste() {
        return tipoCuerpoCeleste;
    }

    

    
    
    //toString
     
    @Override
     public String toString(){
         return  "\nNombre: " + this.getNombre()
                 +"\nTipo de cuerpo celeste: " + this.getTipoCuerpoCeleste();
     }

    
   
    

    

}
