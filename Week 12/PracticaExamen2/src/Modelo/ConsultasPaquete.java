/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;


/**
 *
 * @author Randall Segura
 */
public class ConsultasPaquete extends Conexion {
    
    
    //almacen 
    
    public boolean registrarAlmacen(Almacenes alm){
        
        PreparedStatement ps=null;
        
        Connection con=getConexion();
        
        String sql= "INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (?,?,?)";
        
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,alm.getCodigo());
            ps.setString(2,alm.getLugar());
            ps.setInt(3,alm.getCapacidad());
            
            
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
    
    
    
    
    public boolean modificarAlmacen(Almacenes alm){
        
        PreparedStatement ps=null;
        
        Connection con= getConexion();
        
        String sql="UPDATE almacenes SET codigo=?,lugar=?,capacidad=? WHERE idAlm=?";
        
        
        try{
            
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,alm.getCodigo());
            ps.setString(2,alm.getLugar());
            ps.setInt(3,alm.getCapacidad());
            ps.setInt(4,alm.getIdAlm());
            
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
    
    
    public boolean eliminarAlmacen(Almacenes alm){
        
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql="DELETE FROM almacenes WHERE idAlm=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,alm.getIdAlm());
            
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    
    public boolean buscarAlmacen(Almacenes alm){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        ResultSet rs= null;
        String sql= "SELECT * FROM almacenes WHERE codigo=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,alm.getCodigo());
            
            rs=ps.executeQuery();
            
            if (rs.next()){
                
                alm.setIdAlm(Integer.parseInt(rs.getString("idAlm")));
                alm.setCodigo(Integer.parseInt(rs.getString("codigo")));
                alm.setLugar(rs.getString("lugar"));
                alm.setCapacidad(Integer.parseInt(rs.getString("capacidad")));
                return true;
                
                
            }
            
            return false;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
               con.close(); 
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        
        
    }
    
    
    //cajas 
    
    
    
    public boolean registrarCaja(Cajas caj){
        
        PreparedStatement ps=null;
        
        Connection con=getConexion();
        
        String sql= "INSERT INTO cajas (numReferencia,contenido,precio,almacen) VALUES (?,?,?,?)";
        
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,caj.getNumReferencia());
            ps.setString(2,caj.getContenido());
            ps.setInt(3,caj.getPrecio());
            ps.setInt(4,caj.getAlmacen());
            
            
          
            
            
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
    
    
    
    
    public boolean modificarCajas(Cajas caj){
        
        PreparedStatement ps=null;
        
        Connection con= getConexion();
        
        String sql="UPDATE cajas SET numReferencia=?,contenido=?,precio=?,almacen=? WHERE idCaj=?";
        
        
        try{
            
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,caj.getNumReferencia());
            ps.setString(2,caj.getContenido());
            ps.setInt(3,caj.getPrecio());
            ps.setInt(4,caj.getAlmacen());
            ps.setInt(5,caj.getIdCaj());
            
            
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
    
    
    public boolean eliminarCajas(Cajas caj){
        
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql="DELETE FROM cajas WHERE idCaj=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,caj.getIdCaj());
            
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    
    public boolean buscarCajas(Cajas caj){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        ResultSet rs=null;
        String sql= "SELECT * FROM cajas WHERE numReferencia=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,caj.getNumReferencia());
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                caj.setIdCaj(Integer.parseInt(rs.getString("idCaj")));
                caj.setNumReferencia(Integer.parseInt(rs.getString("numReferencia")));
                caj.setContenido(rs.getString("contenido"));
                caj.setPrecio(Integer.parseInt(rs.getString("precio")));
                caj.setAlmacen(Integer.parseInt(rs.getString("almacen")));
                return true;
            }
            return false;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
               con.close(); 
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        
        
    }
    
    
    
    
    
    
    
    
}
