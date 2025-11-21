/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.kata2;

/**
 *
 * @author vlc
 */

public class MainKata2 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Circulo A", 3);
        figuras[1] = new Rectangulo("Rectangulo A", 4, 2);
        figuras[2] = new Circulo("Circulo B", 1.5);

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " area = " + f.calcularArea());
        }
    }
}

