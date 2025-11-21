/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author vlc
 */
public class MainEj13 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Laura Gomez", "laura@example.com");

        GeneradorQR generador = new GeneradorQR();

        generador.generar("PAGO-123-XYZ", usuario);
    }
}

