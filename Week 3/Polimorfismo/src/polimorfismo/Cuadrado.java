
package polimorfismo;


public class Cuadrado extends Figuras{
    
    //atributos
    
    private double lado;
    
    //constructor lleno 
    
    public Cuadrado(double lado){
        super("Cuadrado");       // se puede hacer automatico nada mas que hay que agregar esta linea para ponerle el super y el nombre
        this.lado=lado;
    }
    
    
    //metodos abstractos
    
    @Override
    public double getArea(){
        return this.lado*this.lado;
    }
    
    
    @Override
    public double getPerimetro(){
        return this.lado*4;
    }
    
    
    
    //toString 
    @Override
    public String toString(){
        return super.toString()
                +"\nArea: " + this.getArea()
                +"\nPerimetro: " + this.getPerimetro();
    }
    
}
