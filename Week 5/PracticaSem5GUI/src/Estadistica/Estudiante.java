package Estadistica;

public class Estudiante {

    //atributos
    private int cantH, cantM, cantSolteros, cantCasados, cantDivorciados, cantViudos, cantUnionLibre;

    //constructor vacio
    public Estudiante() {
        this.cantH = 0;
        this.cantM = 0;
        this.cantSolteros = 0;
        this.cantCasados = 0;
        this.cantDivorciados = 0;
        this.cantViudos = 0;
        this.cantUnionLibre = 0;
    }

    //constructor lleno
    public Estudiante(int cantH, int cantM, int cantSolteros, int cantCasados, int cantDivorciados, int cantViudos, int cantUnionLibre) {
        this.cantH = cantH;
        this.cantM = cantM;
        this.cantSolteros = cantSolteros;
        this.cantCasados = cantCasados;
        this.cantDivorciados = cantDivorciados;
        this.cantViudos = cantViudos;
        this.cantUnionLibre = cantUnionLibre;
    }

    //gettters and setters
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

    public int getCantSolteros() {
        return cantSolteros;
    }

    public void setCantSolteros() {
        this.cantSolteros++;
    }

    public int getCantCasados() {
        return cantCasados;
    }

    public void setCantCasados() {
        this.cantCasados++;
    }

    public int getCantDivorciados() {
        return cantDivorciados;
    }

    public void setCantDivorciados() {
        this.cantDivorciados++;
    }

    public int getCantViudos() {
        return cantViudos;
    }

    public void setCantViudos() {
        this.cantViudos++;
    }

    public int getCantUnionLibre() {
        return cantUnionLibre;
    }

    public void setCantUnionLibre() {
        this.cantUnionLibre++;
    }

    //metodo String para el boton ver estadistica
    public String verEstadistica() {
        return "Cantidad de hombres: " + this.getCantH()
                + "\nCantidad de mujeres: " + this.getCantM()
                + "\n\n   ***Estado Civil***  \n\n"
                + "\nCantidad de solteros: " + this.getCantSolteros()
                + "\nCantidad de casados: " + this.getCantCasados()
                + "\nCantidad de divorciados: " + this.getCantDivorciados()
                + "\nCantidad de viudos: " + this.getCantViudos()
                + "\nCantidad de union libre: " + this.getCantUnionLibre();

    }

    //metodo para llevar el conteo
    public void realizarConteo(String genero, String estado) {

        if (genero.contentEquals("H")) {
            this.setCantH();
        } else {
            this.setCantM();

        }

        switch (estado) {
            case "Soltero":
                setCantSolteros();
                break;
            case "Casado":
                setCantCasados();
                break;
            case "Divorciado":
                setCantDivorciados();
                break;
            case "Viudo":
                setCantViudos();
                break;
            case "Union libre":
                setCantUnionLibre();
                break;
        }

    }

}
