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
public class Conexion {
    
    //atributos
    private Connection con=null;
    private String base= "biblioteca";
    private String url= "jdbc:mysql://localhost:3306/" + base;
    private String user="root";
    private String password="";
    
    
    //metodo
    public Connection getConexion(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,user,password);
            
        }catch(ClassNotFoundException | SQLException e){
            System.err.println(e);
        }
        return con;
    }
    
}
