/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionestructurada;

/**
 *
 * @author vlc
 */
public class ArrayRecursivo {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        // Modificamos el precio del tercer producto
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirRecursivo(precios, 0);
    }

    public static void imprimirRecursivo(double[] precios, int indice) {
        if (indice == precios.length) {
            return; // caso base
        }
        System.out.println("Precio: $" + precios[indice]);
        imprimirRecursivo(precios, indice + 1); // llamada recursiva
    }
}
