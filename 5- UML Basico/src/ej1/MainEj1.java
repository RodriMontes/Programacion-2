/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author vlc
 */
import java.time.LocalDate;

public class MainEj1 {

    public static void main(String[] args) {
        Titular titular = new Titular("Ana Lopez", "12345678");

        Pasaporte pasaporte = new Pasaporte(
                "X123456",
                LocalDate.of(2024, 5, 10),
                "foto_ana.jpg",
                "JPG"
        );

        // Vinculamos bidireccionalmente
        pasaporte.setTitular(titular);

        System.out.println("Titular: " + titular.getNombre()
                + " - Pasaporte: " + titular.getPasaporte().getNumero());

        System.out.println("Foto: " + pasaporte.getFoto().getImagen()
                + " (" + pasaporte.getFoto().getFormato() + ")");
    }
}