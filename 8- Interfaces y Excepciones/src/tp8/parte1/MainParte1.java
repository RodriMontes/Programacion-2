/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.parte1;

/**
 *
 * @author vlc
 */

public class MainParte1 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Rodrigo", "rodrigo@mail.com");

        Producto p1 = new Producto("Remera", 15000);
        Producto p2 = new Producto("Hoodie", 45000);

        Pedido pedido = new Pedido(c1);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Total pedido: $" + pedido.calcularTotal());

        pedido.cambiarEstado("ENVIADO");

        Pago pago1 = new PayPal("rodrigo@mail.com");
        pago1.procesarPago(pedido.calcularTotal());

        PagoConDescuento pago2 = new TarjetaCredito("1234-5678-9999", 10);
        pago2.procesarPago(pedido.calcularTotal());
    }
}
