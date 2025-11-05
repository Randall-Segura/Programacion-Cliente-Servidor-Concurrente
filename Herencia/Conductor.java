
package ejemploherencia;

//como la clase conductor va a heredar de persona, se debe de poner el "extends Persona"
public class Conductor extends Persona{
    
    
    //atributos
    
    private String tipoLicencia;
    
    //constructor vacio
    
    public Conductor(){
        this.tipoLicencia="";
        
    }
    
    
    /*constructor lleno, se debe de eliminar el primer constructor que nos genera, y se deja el segundo, o cuando se genera el constructor, podemos seleccionar 
    unicamente la casilla de abajo de la columna de la izquierda y despues le agregamos el atributo de la clase hija, despues de los atributos de la clase padre, y
    tambien habria que agregarle la parte de this.tipoLicencia= tipoLicencia;
     */
    public Conductor(String nombre, int edad,String tipoLicencia) {          //siempre es buena practica poner los atributos en orden, es decir primero se pone entre
        super(nombre, edad);                                                 //los parentesis los atributos de la clase padre y despues ya se ponen los de la clase hija
        this.tipoLicencia = tipoLicencia;
    }

    
    //getters and setters
    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"\nTipo de Licencia: " + this.getTipoLicencia();
        
    }
    
    
}
