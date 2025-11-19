/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.poo;

/**
 *
 * @author vlc
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    private final double CAPACIDAD_MAXIMA = 100.0;
    private final double CONSUMO_POR_UNIDAD = 1.0; // 1 unidad de combustible por 1 unidad de distancia

    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= CAPACIDAD_MAXIMA) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = CAPACIDAD_MAXIMA;
        }
    }

    public void despegar() {
        System.out.println("La nave " + nombre + " está despegando...");
    }

    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * CONSUMO_POR_UNIDAD;

        if (combustibleNecesario <= combustible) {
            combustible -= combustibleNecesario;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida para recargar.");
            return;
        }

        if (combustible + cantidad > CAPACIDAD_MAXIMA) {
            System.out.println("No se puede recargar tanto combustible, se superaría la capacidad máxima.");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible actual: " + combustible);
        System.out.println("-------------------------");
    }
}
