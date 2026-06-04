
package polimorfismo;


public class Triangulo extends Figuras {
    
    
    //atributos
    
    private double base;
    private double altura;
    
    //constructor lleno 
    
    public Triangulo(double base,double altura){
        super("Triangulo");
        this.base=base;
        this.altura=altura;
    }
    
    
    //metodos abstractos
    
    @Override
    public double getArea(){
        return (this.base*this.altura)/2;
    }
    
    
    @Override
    public double getPerimetro(){
        return this.base+this.base+this.base;
    }
    
    
    
    //toString 
    @Override
    public String toString(){
        return super.toString()
                +"\nArea: " + this.getArea()
                +"\nPerimetro: " + this.getPerimetro();
    }
    
}
