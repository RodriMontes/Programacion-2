/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_introduccionjava;

/**
 *
 * Activdad 8 A
 */
import java.util.Scanner;

public class DivisionEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero entero: ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo numero entero: ");
        int b = scanner.nextInt();

        int resultado = a / b; // división entera

        System.out.println("Resultado (entero): " + resultado);
    }
}

