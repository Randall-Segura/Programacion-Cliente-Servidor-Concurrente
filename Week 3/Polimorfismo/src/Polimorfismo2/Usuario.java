
package Polimorfismo2;


public abstract class Usuario {
    
    //atributos
    
    private String nombre;
    private String correo;
    
    //constructor vacio
    
    public Usuario(){
        this.nombre="";
        this.correo="";
    }
    
    
    //constructor lleno

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    
    
    //getters and setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    //metodo abstracto
    public abstract void autenticar();
    
    
    //toString
    
    @Override
    public String toString(){
        return "\nNombre: " + this.getNombre()
                +"\nCorreo: " + this.getCorreo();
    }

    
    
    
}
