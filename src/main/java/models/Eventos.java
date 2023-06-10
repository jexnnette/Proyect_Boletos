/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author Sheyl
 */
public class Eventos {
    private int IdEvento;
    private LocalDateTime fecha_evento;
    private String nombre_evento;
    private String sinopsis_evento;
    private LocalDateTime HoraInicio_Evento;
    private LocalDateTime HoraFin_Evento;
    private float VIP_MYG;
    private float VIP;
    private float PlateaA;
    private float PlateaB;
    private int IdResponsable;
    private boolean visible;
    private LocalDateTime fechavisible;
    private LocalDateTime fechaoculto;
    private boolean estado;
    private String foto;

    /**
     * @return the IdEvento
     */
    public int getIdEvento() {
        return IdEvento;
    }

    /**
     * @param IdEvento the IdEvento to set
     */
    public void setIdEvento(int IdEvento) {
        this.IdEvento = IdEvento;
    }

    /**
     * @return the fecha_evento
     */
    public LocalDateTime getFecha_evento() {
        return fecha_evento;
    }

    /**
     * @param fecha_evento the fecha_evento to set
     */
    public void setFecha_evento(LocalDateTime fecha_evento) {
        this.fecha_evento = fecha_evento;
    }

    /**
     * @return the nombre_evento
     */
    public String getNombre_evento() {
        return nombre_evento;
    }

    /**
     * @param nombre_evento the nombre_evento to set
     */
    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    /**
     * @return the sinopsis_evento
     */
    public String getSinopsis_evento() {
        return sinopsis_evento;
    }

    /**
     * @param sinopsis_evento the sinopsis_evento to set
     */
    public void setSinopsis_evento(String sinopsis_evento) {
        this.sinopsis_evento = sinopsis_evento;
    }

    /**
     * @return the HoraInicio_Evento
     */
    public LocalDateTime getHoraInicio_Evento() {
        return HoraInicio_Evento;
    }

    /**
     * @param HoraInicio_Evento the HoraInicio_Evento to set
     */
    public void setHoraInicio_Evento(LocalDateTime HoraInicio_Evento) {
        this.HoraInicio_Evento = HoraInicio_Evento;
    }

    /**
     * @return the HoraFin_Evento
     */
    public LocalDateTime getHoraFin_Evento() {
        return HoraFin_Evento;
    }

    /**
     * @param HoraFin_Evento the HoraFin_Evento to set
     */
    public void setHoraFin_Evento(LocalDateTime HoraFin_Evento) {
        this.HoraFin_Evento = HoraFin_Evento;
    }

    /**
     * @return the VIP_MYG
     */
    public float getVIP_MYG() {
        return VIP_MYG;
    }

    /**
     * @param VIP_MYG the VIP_MYG to set
     */
    public void setVIP_MYG(float VIP_MYG) {
        this.VIP_MYG = VIP_MYG;
    }

    /**
     * @return the VIP
     */
    public float getVIP() {
        return VIP;
    }

    /**
     * @param VIP the VIP to set
     */
    public void setVIP(float VIP) {
        this.VIP = VIP;
    }

    /**
     * @return the PlateaA
     */
    public float getPlateaA() {
        return PlateaA;
    }

    /**
     * @param PlateaA the PlateaA to set
     */
    public void setPlateaA(float PlateaA) {
        this.PlateaA = PlateaA;
    }

    /**
     * @return the PlateaB
     */
    public float getPlateaB() {
        return PlateaB;
    }

    /**
     * @param PlateaB the PlateaB to set
     */
    public void setPlateaB(float PlateaB) {
        this.PlateaB = PlateaB;
    }

    /**
     * @return the IdResponsable
     */
    public int getIdResponsable() {
        return IdResponsable;
    }

    /**
     * @param IdResponsable the IdResponsable to set
     */
    public void setIdResponsable(int IdResponsable) {
        this.IdResponsable = IdResponsable;
    }

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * @return the fechavisible
     */
    public LocalDateTime getFechavisible() {
        return fechavisible;
    }

    /**
     * @param fechavisible the fechavisible to set
     */
    public void setFechavisible(LocalDateTime fechavisible) {
        this.fechavisible = fechavisible;
    }

    /**
     * @return the fechaoculto
     */
    public LocalDateTime getFechaoculto() {
        return fechaoculto;
    }

    /**
     * @param fechaoculto the fechaoculto to set
     */
    public void setFechaoculto(LocalDateTime fechaoculto) {
        this.fechaoculto = fechaoculto;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
