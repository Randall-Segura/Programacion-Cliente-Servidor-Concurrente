
package ejemploestatico;


public class Cuadrado {
    
    //atributos
    private static int lado;
    private static int area;
    
    
    //constructor vacio, no se pone la palabra this porque estamos usando static
    public Cuadrado(){
        Cuadrado.lado=0;
        Cuadrado.area=0;
    }

    
    
    //en este ejemplo no es necesario utilizar un constructor lleno, de todas maneras no va a dejar insertarlo
    
    
    
    
    
    //getters and setters, pero este se hizo con refactor, se le da get lado y set lado
    public static int getLado() {
        return lado;
    }

    
    public static void setLado(int aLado) {
        lado = aLado;
    }
    
    
    //metodo estatico
    public static int calcularArea(){
        area= lado*lado;
        return area;
    }
    
}
