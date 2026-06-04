
package semn4excepciones;

import javax.swing.JOptionPane;


public class Rutinas {                                   //orden: try,catch
    
    
    //programa que solo recibe numeros pares, si ingresa un impar muestra el error
    
    
    public void ejemplo1(){
        
        int n= Integer.parseInt(JOptionPane.showInputDialog("Digite un valor: "));
        
        try{
            
            if(n%2==0){
                JOptionPane.showMessageDialog(null,"El numero ingresado es par\n" + n + " es valido");
            }else{
            throw new Exception("Error, el numero ingresado es impar");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            ejemplo1();
        }
        
    }
    
    
    //validar que solo se ingresen numeros
    
//    public void ejemplo2(){
//        int total=0,n1=0,n2=0;
//        boolean esNum=false;
//        while(!esNum){
//            try{
//                n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
//                n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
//                esNum=true;
//            }catch(NumberFormatException e){
//                JOptionPane.showMessageDialog(null,"No se permiten letras");
//                
//            }catch (Exception e){
//                JOptionPane.showMessageDialog(null, "Palabra reservada, no se puede usar");
//                System.out.println(e.getMessage());
//            }finally{
//                total=n1+n2;
//            }
//            JOptionPane.showMessageDialog(null,"La sumatoria es: "+ total);
//            
//        }
//    }
    
}
