/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.parte1;

/**
 *
 * @author vlc
 */

public class PayPal implements Pago {
    private final String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal (" + email + ") por $" + monto);
    }
}

