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

public class ValidacionNota {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");

        sc.close();
    } 
}
