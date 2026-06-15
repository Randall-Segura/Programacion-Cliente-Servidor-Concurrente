/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecadigital;

import Controlador.CtrlLoginBibliotecario;
import Controlador.CtrlLoginUsuario;
import Modelo.Bibliotecario;
import Modelo.ConsultasLogin;
import Modelo.Usuario;
import Vista.frmLoginBibliotecario;
import Vista.frmLoginUsuario;
import Vista.frmLoginUsuarios;
import java.awt.event.*;

/**
 *
 * @author Randall Segura
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     //Inicio de sesion
     
     frmLoginUsuarios frmLU = new frmLoginUsuarios();
     frmLU.setVisible(true);
     frmLU.setLocationRelativeTo(null);
     
     
     //Boton de usuario
     
     frmLU.btnUsuarios.addActionListener(new ActionListener (){
       @Override
       public void actionPerformed(ActionEvent e){
           Usuario modU= new Usuario();
           ConsultasLogin modCU= new ConsultasLogin();
           frmLoginUsuario frmU= new frmLoginUsuario();
           
           CtrlLoginUsuario ctrlU= new CtrlLoginUsuario(modU,modCU,frmU);
           frmU.setVisible(true);
           frmU.setLocationRelativeTo(null);
       } 
    });
     
     //Boton bibliotecario
     
     frmLU.btnBibliotecario.addActionListener(new ActionListener(){
         
         @Override
         public void actionPerformed(ActionEvent e){
             Bibliotecario modB = new Bibliotecario();
             ConsultasLogin modCB= new ConsultasLogin();
             frmLoginBibliotecario frmB= new frmLoginBibliotecario();
             
             CtrlLoginBibliotecario ctrlB= new CtrlLoginBibliotecario(modB,modCB, frmB);
             frmB.setVisible(true);
             frmB.setLocationRelativeTo(null);
         }
         
         
     });

    }

}
