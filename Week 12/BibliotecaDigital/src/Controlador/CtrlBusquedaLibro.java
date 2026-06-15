/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConsultasLibro;

import Modelo.Libro;

import Vista.frmBusquedaLibros;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class CtrlBusquedaLibro implements ActionListener {

    //atributos
    
    private Libro modelo;
    private ConsultasLibro consultas;
    private frmBusquedaLibros vista;

    //constructor lleno
    public CtrlBusquedaLibro(Libro modelo, ConsultasLibro consultas, frmBusquedaLibros vista) {

        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnBuscarLibro.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnPedirPrestado.addActionListener(this);
        this.vista.btnVerLibros.addActionListener(this);
        this.vista.btnMultas.addActionListener(this);
    }

    public void limpiar() {
        vista.txtAutor.setText("");
        vista.txtCategoria.setText("");
        vista.txtTitulo.setText("");
        vista.txtTitulo.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnBuscarLibro) {

            modelo.setTitulo(vista.txtTitulo.getText());
            modelo.setAutor(vista.txtAutor.getText());
            modelo.setCategoria(vista.txtCategoria.getText());

            if (!modelo.getTitulo().isEmpty()) {
                if (consultas.consultaTitulo(modelo)) {
                    vista.txtId.setText(String.valueOf(modelo.getId()));
                    vista.txtAutor.setText(modelo.getAutor());
                    vista.txtCategoria.setText(modelo.getCategoria());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el libro por titulo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    limpiar();
                }

            } else if (!modelo.getAutor().isEmpty()) {
                if (consultas.consultaAutor(modelo)) {
                    vista.txtId.setText(String.valueOf(modelo.getId()));
                    vista.txtTitulo.setText(modelo.getTitulo());
                    vista.txtCategoria.setText(modelo.getCategoria());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el libro por autor", "ERROR", JOptionPane.ERROR_MESSAGE);
                    limpiar();
                }
            } else if (!modelo.getCategoria().isEmpty()) {
                if (consultas.consultaCategoria(modelo)) {
                    vista.txtId.setText(String.valueOf(modelo.getId()));
                    vista.txtTitulo.setText(modelo.getTitulo());
                    vista.txtAutor.setText(modelo.getAutor());
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el libro por categoria", "ERROR", JOptionPane.ERROR_MESSAGE);
                    limpiar();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un dato para buscar el libro", "Datos no Ingresados", JOptionPane.ERROR_MESSAGE);
            }

        }

        if (e.getSource() == vista.btnPedirPrestado) {

            JOptionPane.showMessageDialog(null, "Resumen del Prestamo:\n"
                    + "\nTitulo: " + vista.txtTitulo.getText()
                    + "\nAutor: " + vista.txtAutor.getText()
                    + "\nCategoria: " + vista.txtCategoria.getText()
                    + "\nRecuerda devolver el libro en menos de 30 dias para evitar multas.");

        }
        
        
        if(e.getSource()==vista.btnVerLibros){
            String lista= consultas.verLibros();
        }
        
        
        if(e.getSource()==vista.btnMultas){
            JOptionPane.showMessageDialog(null,"De momento no presentas multas", "Sin multas", JOptionPane.WARNING_MESSAGE);
        }
        

        if (e.getSource() == vista.btnLimpiar) {
            limpiar();
        }

    }

}
