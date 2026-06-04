
package sistemasolar;

import javax.swing.JOptionPane;


public class Planeta implements PlanetaAbs {
    
    //atributos
    
    private String nombre;
    private double tamano;
    private double distanciaSol;
    private int numeroLunas;
    private double densidad;
    private double gravedad;
    private String composicionAtmosferica;
    private int anillos;
    
    
    
    //constructor vacio
    
    public Planeta(){
        this.nombre="";
        this.tamano=0;
        this.distanciaSol=0;
        this. numeroLunas=0;
        this.densidad=0;
        this.gravedad=0;
        this.composicionAtmosferica="";
        this.anillos=0;
    }
    

    
    //constructor lleno

    public Planeta(String nombre, double tamano, double distanciaSol, int numeroLunas, double densidad, double gravedad, String composicionAtmosferica, int anillos) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.distanciaSol = distanciaSol;
        this.numeroLunas = numeroLunas;
        this.densidad = densidad;
        this.gravedad = gravedad;
        this.composicionAtmosferica = composicionAtmosferica;
        this.anillos = anillos;
        
        
    }
    
    //creacion de un constructor lleno con solo un atributo para llamarlo solo en otra clase
    public Planeta(String nombre) {
    this.nombre = nombre;
}
    
    
    //getters and setters

   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public int getNumeroLunas() {
        return numeroLunas;
    }

    public void setNumeroLunas(int numeroLunas) {
        this.numeroLunas = numeroLunas;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public String getComposicionAtmosferica() {
        return composicionAtmosferica;
    }

    public void setComposicionAtmosferica(String composicionAtmosferica) {
        this.composicionAtmosferica = composicionAtmosferica;
    }

    public int getAnillos() {
        return anillos;
    }

    public void setAnillos(int anillos) {
        this.anillos = anillos;
    }

    
    
    
    //metodos sobreescritos
    
    //metodo para comparar tamaños de planetas
    @Override
    public void compararTamano(){
        String planeta1= JOptionPane.showInputDialog("Digite el nombre del planeta 1:");
        String planeta2= JOptionPane.showInputDialog("Digite el nombre del planeta 2:");
        double tamano1= Double.parseDouble(JOptionPane.showInputDialog("Digite el tamano de " + planeta1));
        double tamano2= Double.parseDouble(JOptionPane.showInputDialog("Digite el tamano de " + planeta2));
        
        
        if (tamano1<tamano2){
            JOptionPane.showMessageDialog(null, planeta2 + " es mas grande que " + planeta1 + "\nTamaños: " + "\nPlaneta 1: " + tamano1 + " km "
                    + "\nPlaneta 2: " + tamano2+ " km ");
        }else if (tamano2<tamano1){
            JOptionPane.showMessageDialog(null, planeta1 + " es mas grande que " + planeta2 + "\nTamaños: " + "\nPlaneta 1: " + tamano1 + " km "
                    + "\nPlaneta 2: " + tamano2 + " km");
        }else{
            JOptionPane.showMessageDialog(null, "Ambos planetas miden lo mismo " + "\nTamaños: " + "\nPlaneta 1: " + tamano1 + " km "
                    + "\nPlaneta 2: " + tamano2 + " km" );
        }
    }
    
    // metodo para comparar cual planeta esta mas lejos del sol
    @Override
    public void compararDistanciaSol(){
        String planeta1= JOptionPane.showInputDialog("Digite el nombre del planeta 1:");
        String planeta2= JOptionPane.showInputDialog("Digite el nombre del planeta 2:");
        double distancia1= Double.parseDouble(JOptionPane.showInputDialog("Digite la distancia al sol de: " + planeta1));
        double distancia2= Double.parseDouble(JOptionPane.showInputDialog("Digite la distancia al sol de: " + planeta2));
        
        if (distancia1<distancia2){
            JOptionPane.showMessageDialog(null, planeta2 + " esta mas lejos del sol que " + planeta1 + "\nDistancias: " +"\n"
                    + planeta1 + " : " + distancia1 + " km " + "\n" + planeta2 + " : " + distancia2 + " km " );
        }else{
            JOptionPane.showMessageDialog(null, planeta1 + " esta mas lejos del sol que " + planeta2 + "\nDistancias: " + "\n"
                    + planeta1 + " : " + distancia1 + " km " + "\n" + planeta2 + " : " + distancia2 + " km ");
        }
      
        
        
    }
    
    
    //Formula kepler para calcularlo
    //T= raiz cuadrada de a elevado a la 3
    //T= periodo orbital (en años terrestres)
    //a = distancia media al Sol en unidades astronómicas (UA)
    
    //metodo para calcular cuanto dura el año de un planeta especifico
    @Override
    public void calcularAno() {
        String planeta = JOptionPane.showInputDialog("Digite el nombre del planeta que desea calcular su año");
        double distanciaSol = Double.parseDouble(JOptionPane.showInputDialog("Digite la distancia al sol en unidades astronomicas"));
        double resultado= Math.sqrt(Math.pow(distanciaSol,3));
        double dias= resultado*365;
        
        JOptionPane.showMessageDialog(null,planeta + " tarda " + resultado + " años " + " en dar una vuelta completa al sol"
        + "\nLo que se traduce en " + dias + " dias");
    }
    
    
    
   
    
    
    
    //toString
    
    @Override
    public String toString(){
        return "\nNombre: " + this.getNombre()
        +"\nTamano: " + this.getTamano() + "km de diametro"
                +"\nDistancia al sol: " + this.getDistanciaSol()+" millones de kilometros"
                +"\nNumero de lunas: " + this.getNumeroLunas()
                +"\nDensidad: " + this.getDensidad() +" g/cm^^3"
                +"\nGravedad: " + this.getGravedad() + " m/s^^2"
                +"\nComposicion atmosferica: " + this.getComposicionAtmosferica()
                +"\nAnillos: " + this.getAnillos();
    }

   
   

    
    
    
}
