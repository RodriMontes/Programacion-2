/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author vlc
 */
public class Calculadora {
    // Dependencia de uso
    public void calcular(Impuesto impuesto) {
        double total = impuesto.getMonto() * 1.21; // ejemplo IVA
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto base: " + impuesto.getMonto());
        System.out.println("Total con impuestos: " + total);
    }
}

