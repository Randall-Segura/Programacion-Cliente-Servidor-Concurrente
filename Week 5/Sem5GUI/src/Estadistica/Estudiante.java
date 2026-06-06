
package Estadistica;

public class Estudiante {
    
    //atributos
    
    private int cantH,cantM,cantCasado,cantViudo,cantDivorciado,cantSoltero,cantUnionLibre;
    
    
    
    //constructor vacio

    public Estudiante() {
        this.cantH = 0;
        this.cantM = 0;
        this.cantCasado = 0;
        this.cantViudo =0;
        this.cantDivorciado = 0;
        this.cantSoltero = 0;
        this.cantUnionLibre =0;
    }
    
    //constructor lleno 

    public Estudiante(int cantH, int cantM, int cantCasado, int cantViudo, int cantDivorciado, int cantSoltero, int cantUnionLibre) {
        this.cantH = cantH;
        this.cantM = cantM;
        this.cantCasado = cantCasado;
        this.cantViudo = cantViudo;
        this.cantDivorciado = cantDivorciado;
        this.cantSoltero = cantSoltero;
        this.cantUnionLibre = cantUnionLibre;
    }
    
    
   //getters and setters , aqui en los setters, quitamos el parametro y le ponemos ++, para que cada vez que se de un setter, se incremente

    public int getCantH() {
        return cantH;
    }

    public void setCantH() {
        this.cantH++;
    }

    public int getCantM() {
        return cantM;
    }

    public void setCantM() {
        this.cantM++;
    }

    public int getCantCasado() {
        return cantCasado;
    }

    public void setCantCasado() {
        this.cantCasado++;
    }

    public int getCantViudo() {
        return cantViudo;
    }

    public void setCantViudo() {
        this.cantViudo++ ;
    }

    public int getCantDivorciado() {
        return cantDivorciado;
    }

    public void setCantDivorciado() {
        this.cantDivorciado++;
    }

    public int getCantSoltero() {
        return cantSoltero;
    }

    public void setCantSoltero() {
        this.cantSoltero++;
    }

    public int getCantUnionLibre() {
        return cantUnionLibre;
    }

    public void setCantUnionLibre() {
        this.cantUnionLibre++;
    }
    
    
    //metodo string para el boton ver estadistica
    
    public String verEstadistica(){
        return "Cantidad de mujeres: " + this.getCantM()
                +"\nCantidad de hombre: " + this.getCantH()
                +"\n\n      ***Estado civil***   \n\n"
                +"\nSolteros: " + this.getCantSoltero()
                +"\nCasados: " + this.getCantCasado()
                +"\nDivorciados: " + this.getCantDivorciado()
                +"\nViudos: " + this.getCantViudo()
                +"\nUnion libre: " + this.getCantUnionLibre();
    }
    
    
    
    //metodo para llevar el conteo
    
    public void realizarConteo(String genero, String estado){
        if (genero.contentEquals("H")){  //si en el radio button se elige hombre
            this.setCantH(); //se incrementan los hombres
        }else{
            this.setCantM(); //sino, se incrementan las mujeres
        }
        
        
        switch (estado){
            
            case "Soltero":
                setCantSoltero();
                break;
            case "Divorciado":
                setCantDivorciado();
                break;
            case "Casado":
                setCantCasado();
                break;
            case "Viudo":
                setCantViudo();
                break;
            case "Union libre":
                setCantUnionLibre();
                break;
                
            
        }
        
    }
    
    
           
           
    
    
    
    
}
