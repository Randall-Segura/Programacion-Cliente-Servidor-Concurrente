/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConsultasLibro;
import Modelo.ConsultasLogin;

import Modelo.Libro;
import Modelo.Usuario;
import Vista.frmBusquedaLibros;
import Vista.frmLoginUsuario;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class CtrlLoginUsuario implements ActionListener {

    //atributos
    private Usuario modelo;
    private ConsultasLogin consultas;
    private frmLoginUsuario vista;

    //constructor lleno
    public CtrlLoginUsuario(Usuario modelo, ConsultasLogin consultas, frmLoginUsuario vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnIngresarUsuario.addActionListener(this);
        this.vista.btnRegistrarUsuario.addActionListener(this);

    }

    public void limpiar() {
        vista.txtUsuarioUsuario.setText("");
        vista.txtContrasenaUsuario.setText("");
        vista.txtUsuarioUsuario.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIngresarUsuario) {
            modelo.setUsuario(vista.txtUsuarioUsuario.getText());
            modelo.setContrasena(vista.txtContrasenaUsuario.getText());

            if (consultas.loginUsuario(modelo)) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + modelo.getUsuario());
                limpiar();
                
                Libro libro= new Libro();
                ConsultasLibro consultasLibro= new ConsultasLibro();
                
                frmBusquedaLibros frmBL= new frmBusquedaLibros();
                CtrlBusquedaLibro ctrlBusqueda= new CtrlBusquedaLibro(libro,consultasLibro, frmBL);
                frmBL.setVisible(true);
                frmBL.setLocationRelativeTo(null);
                
            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }
        }

        if (e.getSource() == vista.btnRegistrarUsuario) {

            modelo.setUsuario(vista.txtUsuarioUsuario.getText());
            modelo.setContrasena(vista.txtContrasenaUsuario.getText());

            if (consultas.registrarUsuario(modelo)) {
                JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar el bibliotecario", "Error", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }

        }

    }

}
