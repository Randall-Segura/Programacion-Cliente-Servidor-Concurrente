/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocomposicion;

/**
 *
 * @author Randall Segura
 */
public class Empresa {
    
    //atributos
    private String nombre;
    private Direccion direccion; //se llama a direccion, la clase que ya fue creada, a esto se le llama composicion
    
    //constructor vacio
    
    public Empresa(){
        this.nombre="";            //no se inicializa direccion porque ya esta previamente inicializado
    }
    
    
    //constructor lleno

    public Empresa(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
      return "\nEmpresa: " + this.getNombre()
              +"\nDireccion: " + this.getDireccion();
    }
    
}
