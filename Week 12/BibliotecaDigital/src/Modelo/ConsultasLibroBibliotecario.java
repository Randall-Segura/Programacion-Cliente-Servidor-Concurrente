/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Randall Segura
 */
public class ConsultasLibroBibliotecario extends Conexion {
    
    public boolean agregarLibro(Libro libro){
        
        
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql="INSERT INTO libros (titulo, autor, categoria) VALUES (?,?,?)";
        
        try{
            
            ps=con.prepareStatement(sql);
            
            ps.setString(1,libro.getTitulo());
            ps.setString(2,libro.getAutor());
            ps.setString(3,libro.getCategoria());
            
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
    
    
    
    
    public boolean consultaTitulo(Libro libro){
        PreparedStatement ps=null;
        Connection con=getConexion();
        ResultSet rs=null;
        
        String sql="SELECT * FROM libros WHERE titulo=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setString(1,libro.getTitulo());
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                libro.setId(Integer.parseInt(rs.getString("id")));
                libro.setAutor(rs.getString("autor"));
                libro.setCategoria(rs.getString("categoria"));
                
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
    
    
    public boolean consultaAutor(Libro libro){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        ResultSet rs=null;
        
        String sql= "SELECT * FROM libros WHERE autor=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            ps.setString(1,libro.getAutor());
            
            rs=ps.executeQuery();
            
            if(rs.next()){
              libro.setId(Integer.parseInt(rs.getString("id")));
              libro.setTitulo(rs.getString("titulo"));
              libro.setCategoria(rs.getString("categoria"));
              
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
    
    public boolean consultaCategoria(Libro libro){
        
        PreparedStatement ps=null;
        ResultSet rs= null;
        Connection con=getConexion();
        
        String sql="SELECT * FROM libros where categoria=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            
            ps.setString(1,libro.getCategoria());
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                libro.setId(Integer.parseInt(rs.getString("id")));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
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
                System.out.println(e);
            }
        }
        
    }
    
    
    public boolean modificarLibro(Libro libro){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        
        String sql="UPDATE libros SET titulo=?, autor=?, categoria=? WHERE id=?";
        
        
        
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1,libro.getTitulo());
            ps.setString(2,libro.getAutor());
            ps.setString(3,libro.getCategoria());
            ps.setInt(4,libro.getId());
            
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
    
    
    public boolean eliminarLibro(Libro libro){
        
        PreparedStatement ps=null;
        Connection con=getConexion();
        
        String sql="DELETE FROM libros where id=?";
        
        try{
            
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,libro.getId());
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
    
    public String verLibros(){
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=getConexion();
        
        String sql= "SELECT id, titulo, autor, categoria FROM libros ORDER BY titulo";
        String lista="Lista de libros:\n\n";
        try{
           
            boolean libros=false;
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                lista+="\nId: " + rs.getInt("id")+
                        "\nTitulo: " + rs.getString("titulo")+
                        "\nAutor: " + rs.getString("autor")+
                        "\nCategoria: " + rs.getString("categoria")+
                        "\n---------------------------------------\n";
                libros= true;
                        
            }
            
            if(libros){
                JOptionPane.showMessageDialog(null,lista,"Lista de Libros",JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null,"De momento no hay libros","ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }catch(SQLException e){
            System.err.println(e);
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    return lista;
    }
}
