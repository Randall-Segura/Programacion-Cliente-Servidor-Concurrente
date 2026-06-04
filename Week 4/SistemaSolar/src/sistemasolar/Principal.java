
package sistemasolar;

import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        
        
        //creacion de una coleccion de planetas
        Planeta p[]= new Planeta[8];
        p[0]= new Planeta("Mercurio",4.879,57.9,0,5.43,3.7,"0",0);
        p[1]= new Planeta("Venus",12.104,108.2,0,5.24,8.87,"CO2",0);
        p[2]= new Planeta("Tierra",12.742,149.6,1,5.51,9.8,"N2",0);
        p[3]= new Planeta("Marte",6.779,227.9,2,3.93,3.71,"CO2",0);
        p[4]= new Planeta("Jupiter",139.820,778.3,95,1.33,24.79,"H2",4);
        p[5]= new Planeta("Saturno",116.460,1.429,146,0.69,10.44,"H2",7);
        p[6]= new Planeta("Urano", 50.724,2.871,27,1.27,8.69,"H2",13);
        p[7]= new Planeta("Neptuno",49.244,4.498,14,1.64,11.15,"H2",5);
        
        //impresion de la coleccion
        System.out.println("Sistema Solar");
        for (int i = 0; i < p.length; i++) {
            System.out.println("\n----------" +p[i] + "\n----------");
            
        }
        
        
        //creacion de coleccion de planetas rocosos
        System.out.println("\nPlanetas Rocosos: ");
        PlanetaRocoso pr[]= new PlanetaRocoso[4];
        pr[0]= new PlanetaRocoso("Mercurio",false, "Roca",false,false);
        pr[1]= new PlanetaRocoso("Venus",false, "Basalto y volcanes",true,true);
        pr[2]= new PlanetaRocoso("Tierra",true,"Rocas y agua", true,true);
        pr[3]= new PlanetaRocoso("Marte", true,"Polvo, rocas y crateres", true,true);
        
        //impresion de planetas rocosos
        for (int i = 0; i < pr.length; i++) {
            System.out.println("\n----------" + pr[i] + "\n----------");
            
        }
        
        //creacion de coleccion de planetas gaseosos
        System.out.println("\nPlanetas Gaseosos:");
        PlanetaGaseoso pg[]= new PlanetaGaseoso[4];
        pg[0]= new PlanetaGaseoso("Jupiter", "Hidrogeno", 620, 3000, true);
        pg[1]= new PlanetaGaseoso("Saturno","Hidrogeno",1800,1000,true);
        pg[2]= new PlanetaGaseoso("Urano", "Hidrogeno y Helio",900,8000,true);
        pg[3]= new PlanetaGaseoso("Neptuno", "Hidrogeno y Metano",2100,7000,true);
        
        //impresion de planetas gaseosos
        for (int i = 0; i < pg.length; i++) {
            System.out.println("\n----------" + pg[i] + "\n----------");
            
        }
        
        //creacion de coleccion de cuerpos celestes
        System.out.println("\nCuerpos Celestes: ");
        CuerpoCeleste cp[]= new CuerpoCeleste[5];
        cp[0]= new CuerpoCeleste("Sol", "Estrella");
        cp[1]= new CuerpoCeleste("Pluton", "Planeta enano");
        cp[2]= new CuerpoCeleste("Ceres", "Planeta enano");
        cp[3]= new CuerpoCeleste("Luna", "Satelite natural");
        cp[4]= new CuerpoCeleste("Titan", "Satelite natural");
        
        //impresion de cuerpos celestes
        for (int i = 0; i < cp.length; i++) {
            System.out.println("\n----------" + cp[i] + "\n----------");
            
        }
        
        
        //instanciacion de objeto
        Planeta j= new Planeta();
        
        
        //creacion de menu para mostrar metodos
        int menu=0;
        while (menu!=4){
         menu=Integer.parseInt(JOptionPane.showInputDialog("Digite alguna opcion: " + "\n1-Comparar tamaños de planetas"     //menu
                                                              +"\n2-Comparar distancia al sol" 
                                                              +"\n3-Calcular año de planeta"
                                                              +"\n4-Salir"));
        switch (menu){
            
            case 1:
                j.compararTamano();
                break;
            case 2:
                j.compararDistanciaSol();
                break;
            case 3: 
                j.calcularAno();
                break;
            case 4:
                System.exit(0);  //salir del sistema
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite unicamente las opciones 1-4");         //opcion no valida
                break;
        }
       }
        
    }
    
}
