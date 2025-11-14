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

public class SumaParesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int sumaPares = 0;

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = sc.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        } while (numero != 0);

        System.out.println("La suma de los numeros pares es: " + sumaPares);

        sc.close();
    }
}
