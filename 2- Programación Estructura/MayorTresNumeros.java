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


public class MayorTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int n3 = sc.nextInt();

        int mayor = n1;

        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }

        System.out.println("El mayor es: " + mayor);

        sc.close();
    }
}
