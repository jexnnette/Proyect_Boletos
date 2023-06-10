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
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Sheyl
 */
public class DEventos {
    public ArrayList<Eventos> Lista_de_eventos(){
        ArrayList<Eventos> Temporal_List = new ArrayList<>();
        try(Statement sql = Conexion.getConection().createStatement()) {
            String Consulta = "Select * from eventos";
            ResultSet Resultados = sql.executeQuery(Consulta);
            while (Resultados.next()) {
            Eventos eventosObj = new Eventos();
            eventosObj.setIdEvento(Resultados.getInt("idevento"));
            eventosObj.setNombre_evento(Resultados.getString("nombre"));
            eventosObj.setSinopsis_evento(Resultados.getString("sinopsis"));
            eventosObj.setHoraInicio_Evento(Resultados.getTimestamp("fechainicio").toLocalDateTime());
            eventosObj.setHoraFin_Evento(Resultados.getTimestamp("fechafin").toLocalDateTime());
            eventosObj.setVIP_MYG(Resultados.getFloat("vip_mg"));
            eventosObj.setVIP(Resultados.getFloat("vip"));
            eventosObj.setPlateaA(Resultados.getFloat("planta_a"));
            eventosObj.setPlateaB(Resultados.getFloat("planta_b"));
            eventosObj.setIdResponsable(Resultados.getInt("idresponsable"));
            eventosObj.setVisible(Resultados.getBoolean("visible"));
            eventosObj.setFechavisible(Resultados.getTimestamp("fechavisible").toLocalDateTime());
            eventosObj.setFechaoculto(Resultados.getTimestamp("fechaoculto").toLocalDateTime());
            eventosObj.setEstado(Resultados.getBoolean("estado"));
            eventosObj.setFoto(Resultados.getString("foto"));
            Temporal_List.add(eventosObj);
            }
               
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Temporal_List;
        
    }
    
    public boolean CreateEvent(Eventos event){
        boolean results = false;
        
         try (Connection conn = Conexion.getConection()) {
             StringBuilder query = new StringBuilder();
             query.append("insert into eventos(nombre,sinopsis,fechainicio,fechafin,foto,visible,fechavisible,fechaoculto,idresponsable,vip,planta_a,planta_b,vip_mg)");
             query.append("VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
             
             PreparedStatement sql = conn.prepareStatement(query.toString());
             sql.setString(1, event.getNombre_evento());
             sql.setString(2, event.getSinopsis_evento());
             sql.setTimestamp(3, Timestamp.valueOf(event.getHoraInicio_Evento()));
             sql.setTimestamp(4, Timestamp.valueOf(event.getHoraFin_Evento()));
             sql.setString(5,event.getFoto());
             sql.setBoolean(6, event.isVisible());
             sql.setTimestamp(7, Timestamp.valueOf(event.getFechavisible()));
             sql.setTimestamp(8, Timestamp.valueOf(event.getFechaoculto()));
             sql.setInt(9, event.getIdResponsable());
             sql.setDouble(10, event.getVIP());
             sql.setDouble(11, event.getPlateaA());
             sql.setDouble(12, event.getPlateaB());
             sql.setDouble(13, event.getVIP_MYG());
             
             int rowAffected = sql.executeUpdate();
             
             results = rowAffected != 0;
             
         } catch (SQLException ex) { 
             System.out.println("hubo un error " + ex.toString());
         }      
         
         return results;
    }
}
