/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sheyli
 */
public class DUser {
    public ArrayList<User> ListadoDeUsuarios(){
        
         ArrayList<User> listaUsuarios = new ArrayList<>();
         
         try (Statement sql = Conexion.getConection().createStatement()) {
             String query = "select * from usuarios";
             ResultSet resultado = sql.executeQuery(query);
             
             while(resultado.next()){
                 User usuario = new User();
                 usuario.setId(resultado.getInt("Idcliente"));
                 usuario.setName(resultado.getString("nombre")); 
                 usuario.setEmail(resultado.getString("correo"));
                 usuario.setPassword(resultado.getString("clave"));
                 usuario.setActive(resultado.getBoolean("activo"));
                 usuario.setIdRol(resultado.getInt("idrol")); 
                 listaUsuarios.add(usuario);
             }
             
         } catch (SQLException ex) { 
             System.out.println("hubo un error" + ex.toString());
         }      
         
         return listaUsuarios;
    }
    
     public User UserByPasswordAndEmail(String password, String email){
        
         User model = null;
         
         try (Connection conn = Conexion.getConection()) {
             String query = "SELECT * FROM usuarios where correo = ? and clave = ? LIMIT 1";
             PreparedStatement sql = conn.prepareStatement(query);
             sql.setString(1, email);
             sql.setString(2,password);
             ResultSet resultado = sql.executeQuery();
             
             while(resultado.next()){;
                 User usuario = new User();
                 usuario.setId(resultado.getInt("Idcliente"));
                 usuario.setName(resultado.getString("nombre"));
                 usuario.setEmail(resultado.getString("correo"));
                 usuario.setPassword(resultado.getString("clave"));
                 usuario.setActive(resultado.getBoolean("activo"));
                 usuario.setIdRol(resultado.getInt("idrol"));
                 usuario.setNumber(resultado.getString("numero"));
                 model = usuario;
             }
             
         } catch (SQLException ex) { 
             System.out.println("hubo un error "+ex.toString());
         }      
         
         return model;
    }
}
