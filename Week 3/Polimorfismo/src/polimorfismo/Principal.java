
package polimorfismo;

import javax.swing.JOptionPane;


public class Principal {
static Object opciones[]={"Cuadrado", "Triangulo", "Circulo","Mostrar","Salir"};  //esto es para la forma 2, se crea un objeto estatico con las opciones del programa
static Figuras f[]= new Figuras[3];  // se crea un arreglo estatico y se pone el tamano del arreglo

    
    public static void main(String[] args) {
        
        //Forma 1
        /*
       Figuras f[]= new Figuras[4];
       f[0]= new Cuadrado(12);           //como parametro se le pone la medida del lado, altura,base, radio...etc
       f[1]= new Circulo(3);
       f[2]= new Circulo(8);
       f[3]=new Triangulo(10,4);
       
       
       for (int i=0;i<f.length;i++){
        System.out.println("--------\n"
        +f[i]
        +"\n--------");
        
        
          
                
                
    }*/
        
        //Forma 2
        
        Object op; // Se usa cuando no sabes de antemano qué tipo de dato vas a guardar, o cuando quieres guardar cualquier tipo de 
        //dato (texto, número, objeto, arreglo, etc.). Tambien se usa object porque como se va a desplegar un menu, java devuelve un Object, porque las opciones
        //pueden ser de cualquier tipo como String por ejemplo, o cualquier otro tipo de dato
        do{
            op=JOptionPane.showInputDialog(null,"Seleccione la opcion deseada: ", "Elegir", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            
            if (op.equals("Cuadrado")){
                double lado= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado: "));
                f[0]= new Cuadrado(lado);
            }else if (op.equals("Triangulo")) {
                double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura:"));
                f[1] = new Triangulo(base, altura);
            } else if (op.equals("Circulo")) {
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio:"));
                f[2] = new Circulo(radio);
           } else if (op.equals("Salir")) {
                System.exit(0);
            }else if (op.equals("Mostrar")){
                mostrar();
            }    
                    
        }while (op!= "Salir");
        
        
        
    }
    
    
    public static void mostrar(){
        for (int i = 0; i < f.length; i++) {
            System.out.println("\n----------"+f[i]+ "\n----------");
            
        }
    }
    
}
