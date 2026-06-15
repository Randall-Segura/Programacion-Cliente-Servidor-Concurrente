/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Bibliotecario;
import Modelo.ConsultasLibroBibliotecario;
import Modelo.ConsultasLogin;
import Modelo.Libro;
import Vista.frmGestionLibros;
import Vista.frmLoginBibliotecario;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class CtrlLoginBibliotecario implements ActionListener {
    
    //atributos
    
    private Bibliotecario modelo;
    private ConsultasLogin consultas;
    private frmLoginBibliotecario vista;
    
    
    //constructor lleno

    public CtrlLoginBibliotecario(Bibliotecario modelo, ConsultasLogin consultas, frmLoginBibliotecario vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnIngresarBibliotecario.addActionListener(this);
        this.vista.btnRegistrarBibliotecario.addActionListener(this);
    }
    
    
    public void limpiar(){
        vista.txtUsuarioBibliotecario.setText("");
        vista.txtContrasenaBibliotecario.setText("");
        vista.txtUsuarioBibliotecario.requestFocus();
    }
    
    @Override
     public void actionPerformed(ActionEvent e){
         if(e.getSource()==vista.btnIngresarBibliotecario){
             modelo.setUsuario(vista.txtUsuarioBibliotecario.getText());
             modelo.setContrasena(vista.txtContrasenaBibliotecario.getText());
             
             if(consultas.loginBibliotecario(modelo)){
                 JOptionPane.showMessageDialog(null,"Bienvenido al Sistema " + modelo.getUsuario());
                 limpiar();
                 
                 Libro libro= new Libro();
                 ConsultasLibroBibliotecario modLB= new ConsultasLibroBibliotecario();
                 frmGestionLibros frmGL= new frmGestionLibros();
                 
                 CtrlLibroBibliotecario ctrlG= new CtrlLibroBibliotecario(libro,modLB,frmGL);
                 frmGL.setVisible(true);
                 frmGL.setLocationRelativeTo(null);
                
                 
                         
             }else{
                 JOptionPane.showMessageDialog(null,"Datos Incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                 limpiar();
             }
         }
         
         
         if (e.getSource()==vista.btnRegistrarBibliotecario){
             modelo.setUsuario(vista.txtUsuarioBibliotecario.getText());
             modelo.setContrasena(vista.txtContrasenaBibliotecario.getText());
             
             if (consultas.registrarBibliotecario(modelo)){
                 JOptionPane.showMessageDialog(null,"Bibliotecario registrado con exito");
                 limpiar();
             }else{
                 JOptionPane.showMessageDialog(null,"Error al registrar el bibliotecario", "Error", JOptionPane.ERROR_MESSAGE);
                 limpiar();
             }
         }
     }
    
}
