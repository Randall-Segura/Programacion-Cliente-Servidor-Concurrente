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
public class ConsultasJuguete extends Conexion {
    
    
    public boolean registrarJuguete(Juguete jug){
        
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        
        String sql="INSERT INTO juguetes (codigo, descripcion, tipo, precio) VALUES (?,?,?,?)";
        
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,jug.getCodigo());
            ps.setString(2,jug.getDescripcion());
            ps.setString(3,jug.getTipo());
            ps.setDouble(4,jug.getPrecio());
            
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
    
    
    
    public boolean buscarJuguete(Juguete jug){
        
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=getConexion();
        
        String sql="SELECT * FROM juguetes WHERE codigo=?";
        
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setInt(1,jug.getCodigo());
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                jug.setCodigo(Integer.parseInt(rs.getString("codigo")));
                jug.setDescripcion(rs.getString("descripcion"));
                jug.setTipo(rs.getString("tipo"));
                jug.setPrecio(Double.parseDouble(rs.getString("precio")));
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
