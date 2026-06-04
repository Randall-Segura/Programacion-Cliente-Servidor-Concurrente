
package polimorfismo;


public class Circulo extends Figuras {
    
     //atributos
    
    private double radio;
    
    //constructor lleno 
    
    public Circulo(double radio){
        super("Circulo");
        this.radio=radio;
    }
    
    
    //metodos abstractos
    
    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.radio,2);
    }
    
    
    @Override
    public double getPerimetro(){
        return 2* Math.PI * this.radio;
    }
    
    
    
    //toString 
    @Override
    public String toString(){
        return super.toString()
                +"\nArea: " + this.getArea()
                +"\nPerimetro: " + this.getPerimetro();
    }
    
}
