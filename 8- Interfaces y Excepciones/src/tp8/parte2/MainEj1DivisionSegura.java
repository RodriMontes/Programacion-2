/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.parte2;

/**
 *
 * @author vlc
 */

import java.util.Scanner;

public class MainEj1DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese numerador: ");
        int a = sc.nextInt();
        System.out.print("Ingrese divisor: ");
        int b = sc.nextInt();

        try {
            int r = a / b;
            System.out.println("Resultado: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }
}

