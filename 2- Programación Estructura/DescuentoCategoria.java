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

public class DescuentoCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);

        double porcentajeDescuento;

        switch (categoria) {
            case 'A':
                porcentajeDescuento = 10;
                break;
            case 'B':
                porcentajeDescuento = 15;
                break;
            case 'C':
                porcentajeDescuento = 20;
                break;
            default:
                System.out.println("Categoria invalida.");
                sc.close();
                return;
        }

        double descuento = precio * (porcentajeDescuento / 100);
        double precioFinal = precio - descuento;

        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.println("Precio final: " + precioFinal);

        sc.close();
    }
}
