/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author vlc
 */

public class MainEj12 {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Empresa XYZ", "30-11223344-9");
        Impuesto impuesto = new Impuesto(100000.0, contribuyente);

        Calculadora calculadora = new Calculadora();

        calculadora.calcular(impuesto);
    }
}

