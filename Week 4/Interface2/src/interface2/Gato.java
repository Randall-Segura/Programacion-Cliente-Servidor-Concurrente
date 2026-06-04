
package interface2;


public class Gato extends Animal implements Mascota {

    //constructor lleno
    public Gato(String nombre, String raza) {
        super(nombre, raza);
    }

    //metodos sobreescritos
    @Override
    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public String dormir() {
        return "Gato dormido";
    }

    //toString
    @Override
    public String toString() {
        return super.toString()
                + "\n" + hacerSonido()
                + "\n" + dormir();
    }

}
