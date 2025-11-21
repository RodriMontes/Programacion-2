/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.parte1;

/**
 *
 * @author vlc
 */

public class TarjetaCredito implements PagoConDescuento {
    private final String numero;
    private double porcentajeDescuento;

    public TarjetaCredito(String numero, double porcentajeDescuento) {
        this.numero = numero;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * porcentajeDescuento / 100.0);
    }

    @Override
    public void procesarPago(double monto) {
        double finalConDescuento = aplicarDescuento(monto);
        System.out.println("Pago con tarjeta " + numero + " por $" + finalConDescuento);
    }
}
