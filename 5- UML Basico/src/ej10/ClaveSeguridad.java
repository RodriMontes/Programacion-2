/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author vlc
 */
public class ClaveSeguridad {
    private String codigo;
    private java.time.LocalDateTime ultimaModificacion;

    public ClaveSeguridad(String codigo, java.time.LocalDateTime ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public java.time.LocalDateTime getUltimaModificacion() {
        return ultimaModificacion;
    }
}

