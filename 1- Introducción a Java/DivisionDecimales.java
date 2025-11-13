/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_introduccionjava;

/**
 *
 * Activdad 8 B
 */
import java.util.Scanner;

public class DivisionDecimales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double b = scanner.nextDouble();

        double resultado = a / b; // división con decimales

        System.out.println("Resultado (double): " + resultado);
    }
}
