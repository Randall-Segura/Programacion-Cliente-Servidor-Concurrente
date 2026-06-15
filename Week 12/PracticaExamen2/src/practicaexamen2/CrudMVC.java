/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamen2;

import Controlador.CtrlPaquete;
import Modelo.Almacenes;
import Modelo.Cajas;
import Modelo.ConsultasPaquete;
import Vista.frmPaquete;

/**
 *
 * @author Randall Segura
 */
public class CrudMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cajas cajs= new Cajas();
        Almacenes alms= new Almacenes();
        ConsultasPaquete modC= new ConsultasPaquete();
        frmPaquete frm= new frmPaquete();
        
        
        CtrlPaquete ctrl = new CtrlPaquete(cajs,alms,modC,frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
    }
    
}
