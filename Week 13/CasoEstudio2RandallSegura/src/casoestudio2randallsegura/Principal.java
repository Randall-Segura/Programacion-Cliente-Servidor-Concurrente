/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2randallsegura;

import Controlador.CtrlJuguete;
import Modelo.ConsultasJuguete;
import Modelo.Juguete;
import Vista.frmJuguete;

/**
 *
 * @author Randall Segura
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juguete mod= new Juguete();
    ConsultasJuguete modC= new ConsultasJuguete();
    frmJuguete frm= new frmJuguete();
    
    
    CtrlJuguete ctrl = new CtrlJuguete(mod,modC,frm);
    ctrl.iniciar();
    frm.setVisible(true);
    
    
    
    
    
    }
    
    
    
    
}
