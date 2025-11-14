/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionestructurada;

/**
 *
 * @author vlc
 */

import java.util.Scanner;

public class ClasificacionEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        String categoria;

        if (edad < 12) {
            categoria = "Niño";
        } else if (edad <= 17) {
            categoria = "Adolescente";
        } else if (edad <= 59) {
            categoria = "Adulto";
        } else {
            categoria = "Adulto mayor";
        }

        System.out.println("Eres un " + categoria + ".");

        sc.close();
    }
}
