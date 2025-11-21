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

public class MainEj2Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero en texto: ");
        String texto = sc.nextLine();

        try {
            int n = Integer.parseInt(texto);
            System.out.println("Numero convertido: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Error: no es un numero valido.");
        }
    }
}

