/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Almacenes;
import Modelo.Cajas;
import Modelo.ConsultasPaquete;
import Vista.frmPaquete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class CtrlPaquete implements ActionListener{
    
    //atributos
    
    private final Cajas caja;
    private final Almacenes almacen;
    private final ConsultasPaquete consultas;
    private final frmPaquete vista;
    
    //constructor lleno

    public CtrlPaquete(Cajas caja, Almacenes almacen, ConsultasPaquete consultas, frmPaquete vista) {
        this.caja = caja;
        this.almacen = almacen;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnBuscarAlm.addActionListener(this);
        this.vista.btnGuardarAlm.addActionListener(this);
        this.vista.btnModificarAlm.addActionListener(this);
        this.vista.btnEliminarAlm.addActionListener(this);
        this.vista.btnGuardarCaj.addActionListener(this);
        this.vista.btnBuscarCaj.addActionListener(this);
        this.vista.btnModificarCaj.addActionListener(this);
        this.vista.btnEliminarCaj.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        
        
    }
    
    
    public void iniciar(){
        vista.setTitle("Paqueteria");
        vista.setLocationRelativeTo(null);
        vista.txtIdAlm.setVisible(false);
        vista.txtIdCaj.setVisible(false);
    }
    
    public void limpiar(){
        vista.txtIdAlm.setText("");
        vista.txtIdCaj.setText("");
        vista.txtCodigo.setText("");
        vista.txtLugar.setText("");
        vista.txtCapacidad.setText("");
        vista.txtNumReferencia.setText("");
        vista.txtContenido.setText("");
        vista.txtPrecio.setText("");
        vista.txtAlm.setText("");
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource()==vista.btnGuardarAlm){
            
            almacen.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
            almacen.setLugar(vista.txtLugar.getText());
            almacen.setCapacidad(Integer.parseInt(vista.txtCapacidad.getText()));
            
            if (consultas.registrarAlmacen(almacen)){
                JOptionPane.showMessageDialog(null,"Registro guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar");
                limpiar();
            }
        }
        
        
        if (e.getSource()==vista.btnModificarAlm){
            
            almacen.setIdAlm(Integer.parseInt(vista.txtIdAlm.getText()));
            almacen.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
            almacen.setLugar(vista.txtLugar.getText());
            almacen.setCapacidad(Integer.parseInt(vista.txtCapacidad.getText()));
            
            if(consultas.modificarAlmacen(almacen)){
                JOptionPane.showMessageDialog(null,"Modificacion exitosa");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar");
                limpiar();
            }
            
        }
       
        
        
        if (e.getSource()==vista.btnEliminarAlm){
            almacen.setIdAlm(Integer.parseInt(vista.txtIdAlm.getText()));
            
            
            if (consultas.eliminarAlmacen(almacen)){
                JOptionPane.showMessageDialog(null,"Eliminacion exitosa");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminar");
                limpiar();
            }
        }
        
        
        if (e.getSource()==vista.btnBuscarAlm){
            almacen.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
            
            
            if(consultas.buscarAlmacen(almacen)){
                vista.txtIdAlm.setText(String.valueOf(almacen.getIdAlm()));
                vista.txtCodigo.setText(String.valueOf(almacen.getCodigo()));
                vista.txtLugar.setText(almacen.getLugar());
                vista.txtCapacidad.setText(String.valueOf(almacen.getCapacidad()));
            }else{
                JOptionPane.showMessageDialog(null,"El registro no existe");
                
            }
            
            
            
        }
        
        
        
        if (e.getSource()==vista.btnGuardarCaj){
            
            caja.setNumReferencia(Integer.parseInt(vista.txtNumReferencia.getText()));
            caja.setContenido(vista.txtContenido.getText());
            caja.setPrecio(Integer.parseInt(vista.txtPrecio.getText()));
            caja.setAlmacen(Integer.parseInt(vista.txtAlm.getText()));
            
            
            if (consultas.registrarCaja(caja)){
                JOptionPane.showMessageDialog(null,"Registro guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrar");
                limpiar();
            }
        }
        
        
        if(e.getSource()==vista.btnModificarCaj){
            
            caja.setIdCaj(Integer.parseInt(vista.txtIdCaj.getText()));
            caja.setNumReferencia(Integer.parseInt(vista.txtNumReferencia.getText()));
            caja.setContenido(vista.txtContenido.getText());
            caja.setPrecio(Integer.parseInt(vista.txtPrecio.getText()));
            caja.setAlmacen(Integer.parseInt(vista.txtAlm.getText()));
            
            
            if(consultas.modificarCajas(caja)){
                JOptionPane.showMessageDialog(null,"Modificacion exitosa");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar");
                limpiar();
            }
            
        }
        
        
        if(e.getSource()==vista.btnEliminarCaj){
            
            caja.setIdCaj(Integer.parseInt(vista.txtIdCaj.getText()));
            
            if(consultas.eliminarCajas(caja)){
                JOptionPane.showMessageDialog(null,"Eliminado con exito");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminar");
                limpiar();
            }
            
        }
        
        
        if (e.getSource()==vista.btnBuscarCaj){
            
            caja.setNumReferencia(Integer.parseInt(vista.txtNumReferencia.getText()));
            
            
            
            if (consultas.buscarCajas(caja)){
                vista.txtIdCaj.setText(String.valueOf(caja.getIdCaj()));
                vista.txtNumReferencia.setText(String.valueOf(caja.getNumReferencia()));
                vista.txtContenido.setText(caja.getContenido());
                vista.txtPrecio.setText(String.valueOf(caja.getPrecio()));
                vista.txtAlm.setText(String.valueOf(caja.getAlmacen()));
        }else{
              JOptionPane.showMessageDialog(null,"Registro no encontrado");
             limpiar();
            }
                
        
        
        
    }
        
        
        
        if (e.getSource()==vista.btnLimpiar){
            limpiar();
        }
    
    
    
    }  
}
