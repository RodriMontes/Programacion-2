/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author vlc
 */

public class MainEj5 {

    public static void main(String[] args) {
        Computadora pc = new Computadora(
                "MarcaX",
                "SN-001-ABC",
                "Modelo-PL-123",
                "Chipset-Z790"
        );

        Propietario propietario = new Propietario("Carla Lopez", "22333444");

        // Vinculacion bidireccional
        pc.setPropietario(propietario);

        System.out.println("Propietario: " + propietario.getNombre()
                + " - Computadora serie: " + propietario.getComputadora().getNumeroSerie());

        System.out.println("Placa madre: " + pc.getPlacaMadre().getModelo()
                + " - Chipset: " + pc.getPlacaMadre().getChipset());
    }
}

