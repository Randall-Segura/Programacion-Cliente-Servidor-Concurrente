
package interface2;


public class Animal {

    //atributos
    private String nombre;
    private String raza;

    //constructor lleno
    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    //getter and setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //toString
    @Override
    public String toString() {
        return "\nNombre: " + this.nombre
                + "\nRaza: " + this.getRaza();
    }

}
