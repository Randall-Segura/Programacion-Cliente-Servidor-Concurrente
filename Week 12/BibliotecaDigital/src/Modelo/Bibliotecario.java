/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Randall Segura
 */
public class Bibliotecario {
    
    //atributos
    
    private int id;
    private String usuario;
    private String contrasena;
    
    
    //constructor vacio

    public Bibliotecario() {
        this.id = 0;
        this.usuario = "";
        this.contrasena = "";
    }
    
    
    //constructor lleno

    public Bibliotecario(int id, String usuario, String contrasena) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
    
}
