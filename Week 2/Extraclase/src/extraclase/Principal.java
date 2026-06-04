
package extraclase;


public class Principal {

    
    public static void main(String[] args) {
        
        System.out.println("\n-----Recepcionista-----");
        Recepcionista r1= new Recepcionista("Randall", 19,5);
        System.out.println(r1);
        
        
        System.out.println("\n-----Chofer-----");
        Chofer c1= new Chofer("Carlos",54,20,"b1");
        System.out.println(c1);
        
        
        System.out.println("\n-----Recursos Humanos-----");
        RRHH R1= new RRHH("Maria", 36, 10, "espanol");
        System.out.println(R1);
        
        
        System.out.println("\n-----Bodeguero-----");
        Bodeguero b1= new Bodeguero("Xinia", 54, 20, "espanol", "acomodo");
        System.out.println(b1);
        
        
        System.out.println("\n-----Gerente General-----");
        GerenteGeneral g1= new GerenteGeneral("Randall", 52, 20,"Ingles",1000000);
        System.out.println(g1);
        
        
        
        System.out.println("\n-----Oficial de Seguridad-----");
        OficialSeguridad o1= new OficialSeguridad("Esteban",61,30, 8);
        System.out.println(o1);
        
        
        
        
        System.out.println("\n-----Ayudante de Chofer-----");
        AyudanteChofer A1= new AyudanteChofer("Michael", 39,10,"b1","Casado");
        System.out.println(A1);
        
        
        
        
    }
    
}
