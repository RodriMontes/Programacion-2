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

public class PrecioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (ej: 10 para 10%): ");
        double impuesto = sc.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (ej: 5 para 5%): ");
        double descuento = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

        sc.close();
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double imp = precioBase * (impuesto / 100);
        double desc = precioBase * (descuento / 100);
        return precioBase + imp - desc;
    }
}
