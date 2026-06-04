
package interface2;


public class Perro extends Animal implements Mascota {

    //constructor lleno
    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }

    //metodos sobreescritos
    @Override
    public String hacerSonido() {
        return "Guau";
    }

    @Override
    public String dormir() {
        return "Perro Dormido";
    }

    //toString
    @Override
    public String toString() {
        return super.toString()
                + "\n" + hacerSonido()
                + "\n" + dormir();
    }

}
