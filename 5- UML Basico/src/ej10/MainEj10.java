/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author vlc
 */

import java.time.LocalDateTime;

public class MainEj10 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(
                "0000003100000000123456",
                150000.0,
                "CLAVE-1234",
                LocalDateTime.now()
        );

        Titular titular = new Titular ("Sofia Rivas", "30444555");

        // Vinculacion bidireccional
        cuenta.setTitular(titular);

        System.out.println("Titular: " + titular.getNombre()
                + " - CBU: " + titular.getCuenta().getCbu());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave codigo: " + cuenta.getClave().getCodigo());
        System.out.println("Ultima modificacion clave: " + cuenta.getClave().getUltimaModificacion());
    }
}

