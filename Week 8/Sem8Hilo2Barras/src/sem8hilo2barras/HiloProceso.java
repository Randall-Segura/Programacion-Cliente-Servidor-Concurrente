
package sem8hilo2barras;

import java.util.Random;
import javax.swing.*; //se trae todo el importe de la libreria swing


public class HiloProceso extends Thread {   //extiende de thread
    
    //atributos
    
    private JProgressBar barra;
    private JLabel duracion,ganador;
    private int tiempo;
    private String corredor;
    
    
    /*constructor lleno, se seleccionan los del lado derecho, se pone tiempo como JLabel en el parametro y no se pone duracion 
    en el parametro del constructor, sino que la duracion se iguala al tiempo 
    
    */
    public HiloProceso(JProgressBar barra, JLabel ganador, JLabel tiempo, String corredor) {
        this.barra = barra;
        this.ganador = ganador;
        this.duracion = tiempo;
        this.corredor = corredor;
    }
    
    
    
    
    //metodos 
    
    private void contabilizarPorSegundos(){
        try{
            //genera un numero aleatorio entre 0 y 14, sumandole 1 se obtiene hasta 15
           int segundos= 1 + new Random().nextInt(15); 
           
           /* this.tiempo es el contador total de tiempo el corredor, se suma la cantidad de segundos generada
           asi se acumula cuanto tarda el corredor en llegar a la meta
           */
           this.tiempo+=segundos;
           
           /* Thread.sleep detiene el hilo, multiplica segundos por 10 para que la espera sea visible, pero no tan larga como segundos reales
           Por ejemplo si segundos=5, entonces sleep(5*10) = 50 ms de pausa
           Asi se simula que cada paso tarda mas o menos tiempo, como si el corredor fuera mas lento o rapido de manera aleatoria
           */
           Thread.sleep(segundos*10);
           
           //repinta la barra de progreso
           this.barra.repaint(); 
           
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    
    @Override
    public void run(){
        /*
        Este es el bucle que se repite 100 veces, cada iteracion representa un paso en la carrera.
        i es el valor del avance → va de 0 a 99
        */
        for (int i = 0; i < 100; i++) {
            /*
            this.barra.setValue(i) cambia el valor de la barra de progreso (JProgressBar) al valor actual de i
            Visualmente, la barra se llena paso a paso hasta llegar al 100%
            */
            this.barra.setValue(i);
            
            
            /*
            Llama al metodo que:
            Simula cuanto tiempo tardo este paso (Random)
            Pausa el hilo un momento (Thread.sleep())
            Suma el tiempo total acumulado
            Actualiza la barra
            Y de esa manera cada paso avanza de manera irregular, haciendo que cada corredor sea diferente
            */
            this.contabilizarPorSegundos();
            
            
        }
        
        /*
        Cuando el bucle termina (el corredor llega a la meta):
        Convierte el tiempo total (int) a texto.
        Actualiza el JLabel duracion para mostrar cuánto tardó este corredor.
        El usuario ve en pantalla algo como “132”, según el tiempo acumulado.
        */
        this.duracion.setText(String.valueOf(this.tiempo));
        
        /*
        
        
        Verifica si ya hay un ganador.
        getText().isEmpty() significa: “¿El texto del JLabel ganador está vacío?”
        Si sí está vacío:
        Este hilo se declara ganador.
        Escribe en el JLabel quién ganó.
        Solo el primer hilo que termine y entre a esta parte lo hace primero.
        Los otros hilos, cuando lleguen, ya encontrarán el texto ocupado y no cambiarán el ganador.
        */
        if (this.ganador.getText().isEmpty()){
            this.ganador.setText("El ganador es el corredor  " + this.corredor);
        }
    }
    
    
}
