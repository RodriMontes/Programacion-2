/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6;

/**
 *
 * @author vlc
 */

import java.time.LocalDate;
import java.time.LocalTime;

public class MainEj6 {

    public static void main(String[] args) {
        ClienteReserva cliente = new ClienteReserva("Luis Gomez", "11-5555-5555");
        Mesa mesa = new Mesa(7, 4);

        Reserva reserva = new Reserva(
                LocalDate.of(2025, 5, 20),
                LocalTime.of(21, 0),
                cliente,
                mesa
        );

        System.out.println("Reserva para: " + reserva.getCliente().getNombre());
        System.out.println("Fecha: " + reserva.getFecha()
                + " - Hora: " + reserva.getHora());
        System.out.println("Mesa: " + reserva.getMesa().getNumero()
                + " - Capacidad: " + reserva.getMesa().getCapacidad());
    }
}

