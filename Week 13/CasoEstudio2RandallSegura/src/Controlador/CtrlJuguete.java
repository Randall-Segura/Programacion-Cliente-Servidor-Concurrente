/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConsultasJuguete;
import Modelo.Juguete;
import Vista.frmJuguete;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class CtrlJuguete implements ActionListener {
    
    
    //atributos
    
    private final Juguete modelo;
    private final ConsultasJuguete consultas;
    private final frmJuguete vista;
    
    
    
    //constructor lleno

    public CtrlJuguete(Juguete modelo, ConsultasJuguete consultas, frmJuguete vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
    }
    
    
    //metodos
    
    public void iniciar(){
        vista.setTitle("Jugueteria");
        vista.setLocationRelativeTo(null);
    }
    
    
    public void limpiar(){
        vista.txtCodigo.setText("");
        vista.txtDescripcion.setText("");
        vista.txtTipo.setText("");
        vista.txtPrecio.setText("");
        vista.txtCodigo.requestFocus();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        
        if (e.getSource()==vista.btnAgregar){
            
            modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
            modelo.setDescripcion(vista.txtDescripcion.getText());
            modelo.setTipo(vista.txtTipo.getText());
            modelo.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            
            
            if (consultas.registrarJuguete(modelo)){
                JOptionPane.showMessageDialog(null,"Juguete agregado exitosamente");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error no se pudo agregar", "ERROR", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }
        }
        
        
        if(e.getSource()==vista.btnBuscar){
            
            modelo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
            
            
            if(consultas.buscarJuguete(modelo)){
                vista.txtCodigo.setText(String.valueOf(modelo.getCodigo()));
                vista.txtDescripcion.setText(modelo.getDescripcion());
                vista.txtTipo.setText(modelo.getTipo());
                vista.txtPrecio.setText(String.valueOf(modelo.getPrecio()));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el juguete", "ERROR", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }
                
            
            
            
        }
        
        
        if (e.getSource()==vista.btnLimpiar){
            limpiar();
        }
        
        
    }
    
    
    
}
