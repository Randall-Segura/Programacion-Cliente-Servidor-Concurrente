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
public class ConsultasLogin extends Conexion {

    public boolean loginBibliotecario(Bibliotecario bibliotecario) {

        PreparedStatement ps = null;
        ResultSet rs=null;
        Connection con = getConexion();

        String sql = "SELECT * FROM bibliotecarios WHERE usuario=? AND contrasena=?";

        try {
            
            ps=con.prepareStatement(sql);
            ps.setString(1,bibliotecario.getUsuario());
            ps.setString(2,bibliotecario.getContrasena());
            rs=ps.executeQuery();
            
            return rs.next();

        } catch (SQLException e) {
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
    
    
    
    public boolean loginUsuario(Usuario usuario){
        
        PreparedStatement ps=null;
        ResultSet rs= null;
        Connection con= getConexion();
        
        String sql="SELECT * FROM usuarios WHERE usuario=? AND contrasena=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setString(1,usuario.getUsuario());
            ps.setString(2,usuario.getContrasena());
            rs=ps.executeQuery();
            return rs.next();
            
            
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
    
    
    public boolean registrarBibliotecario(Bibliotecario bibliotecario){
        
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql= "INSERT INTO bibliotecarios (usuario,contrasena) VALUES(?,?)";
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setString(1,bibliotecario.getUsuario());
            ps.setString(2,bibliotecario.getContrasena());
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
    
    
    public boolean registrarUsuario(Usuario usuario){
        
        PreparedStatement ps=null;
        
        Connection con= getConexion();
        
        String sql= "INSERT INTO usuarios (usuario,contrasena) VALUES (?,?)";
        
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setString(1,usuario.getUsuario());
            ps.setString(2,usuario.getContrasena());
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

}
