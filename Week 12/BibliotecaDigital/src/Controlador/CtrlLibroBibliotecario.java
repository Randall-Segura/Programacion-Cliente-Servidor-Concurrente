/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConsultasLibroBibliotecario;
import Modelo.Libro;
import Vista.frmGestionLibros;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class CtrlLibroBibliotecario implements ActionListener {
    
    
    //atributos
    
    private Libro modelo;
    private ConsultasLibroBibliotecario consultas;
    private frmGestionLibros vista;
    
    //constructor lleno

    public CtrlLibroBibliotecario(Libro modelo, ConsultasLibroBibliotecario consultas, frmGestionLibros vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnVerLibros.addActionListener(this);
        
    }
    
    //metodos
    
    public void limpiar(){
        vista.txtTitulo.setText("");
        vista.txtAutor.setText("");
        vista.txtCategoria.setText("");
        vista.txtTitulo.requestFocus();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==vista.btnAgregar){
            modelo.setTitulo(vista.txtTitulo.getText());
            modelo.setAutor(vista.txtAutor.getText());
            modelo.setCategoria(vista.txtCategoria.getText());
            
            if (consultas.agregarLibro(modelo)){
                JOptionPane.showMessageDialog(null, "Libro Guardado con Exito");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error, no se pudo guardar el libro", "Error", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }
            
        }
        
        
        if (e.getSource() == vista.btnBuscar) {

            modelo.setTitulo(vista.txtTitulo.getText());
            modelo.setAutor(vista.txtAutor.getText());
            modelo.setCategoria(vista.txtCategoria.getText());

            if (!modelo.getTitulo().isEmpty()) {
                if (consultas.consultaTitulo(modelo)) {
                    vista.txtAutor.setText(modelo.getAutor());
                    vista.txtCategoria.setText(modelo.getCategoria());
                    vista.txtId.setText(String.valueOf(modelo.getId()));
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el libro por titulo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    limpiar();
                }

            } else if (!modelo.getAutor().isEmpty()) {
                if (consultas.consultaAutor(modelo)) {
                    vista.txtTitulo.setText(modelo.getTitulo());
                    vista.txtCategoria.setText(modelo.getCategoria());
                    vista.txtId.setText(String.valueOf(modelo.getId()));
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el libro por autor", "ERROR", JOptionPane.ERROR_MESSAGE);
                    limpiar();
                }
            } else if (!modelo.getCategoria().isEmpty()) {
                if (consultas.consultaCategoria(modelo)) {
                    vista.txtTitulo.setText(modelo.getTitulo());
                    vista.txtAutor.setText(modelo.getAutor());
                    vista.txtId.setText(String.valueOf(modelo.getId()));
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el libro por categoria", "ERROR", JOptionPane.ERROR_MESSAGE);
                    limpiar();
                }

            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un dato para buscar el libro", "Datos no Ingresados", JOptionPane.ERROR_MESSAGE); 
            }
                

        }
        
        
        if(e.getSource()==vista.btnModificar){
            
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            modelo.setTitulo(vista.txtTitulo.getText());
            modelo.setAutor(vista.txtAutor.getText());
            modelo.setCategoria(vista.txtCategoria.getText());
            
            if(consultas.modificarLibro(modelo)){
                JOptionPane.showMessageDialog(null,"Libro modificado exitosamente");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo modificar el libro", "ERROR", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }
        }
        
        if(e.getSource()==vista.btnEliminar){
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            
            if(consultas.eliminarLibro(modelo)){
                JOptionPane.showMessageDialog(null,"Libro eliminado con exito");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo eliminar el libro","Error", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }
        }
        
        
        
        if(e.getSource()==vista.btnVerLibros){
            String lista=consultas.verLibros();
        }
        
        
        if(e.getSource()==vista.btnLimpiar){
            limpiar();
        }
        
        
    }
    
    
    
    
}
