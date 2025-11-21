/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author vlc
 */

import java.time.LocalDate;

public class MainEj4 {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco X", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(
                "4500-1234-5678-9999",
                LocalDate.of(2027, 12, 31),
                banco
        );

        Cliente cliente = new Cliente("Juan Perez", "12345678");

        // Vinculacion bidireccional
        tarjeta.setCliente(cliente);

        System.out.println("Cliente: " + cliente.getNombre()
                + " - Tarjeta: " + cliente.getTarjeta().getNumero());

        System.out.println("Banco emisor: " + tarjeta.getBanco().getNombre());
        System.out.println("Vencimiento: " + tarjeta.getFechaVencimiento());
    }
}

