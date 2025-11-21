/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.inventario;

/**
 *
 * @author vlc
 */

public class MainInventario {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1) Crear 5 productos y agregarlos
        Producto p1 = new Producto("A1", "Arroz", 1200, 15, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E1", "Auriculares", 2500, 8, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R1", "Remera", 1800, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H1", "Lampara", 3200, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A2", "Fideos", 900, 30, CategoriaProducto.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        // 2) Listar todos
        System.out.println("LISTA COMPLETA");
        inv.listarProductos();

        // 3) Buscar por ID
        System.out.println("BUSCAR ID R1");
        Producto buscado = inv.buscarProductoPorId("R1");
        if (buscado != null) buscado.mostrarInfo();

        // 4) Filtrar por categoria
        System.out.println("FILTRAR CATEGORIA ALIMENTOS");
        inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5) Eliminar por ID
        System.out.println("ELIMINAR ID E1");
        inv.eliminarProducto("E1");
        inv.listarProductos();

        // 6) Actualizar stock
        System.out.println("ACTUALIZAR STOCK A2 a 50");
        inv.actualizarStock("A2", 50);
        inv.listarProductos();

        // 7) Total stock
        System.out.println("TOTAL STOCK: " + inv.obtenerTotalStock());

        // 8) Producto con mayor stock
        Producto mayor = inv.obtenerProductoConMayorStock();
        System.out.println("PRODUCTO CON MAYOR STOCK:");
        if (mayor != null) mayor.mostrarInfo();

        // 9) Filtrar precio entre 1000 y 3000
        System.out.println("PRECIO ENTRE 1000 y 3000");
        inv.filtrarProductosPorPrecio(1000, 3000);

        // 10) Mostrar categorias disponibles
        System.out.println("CATEGORIAS DISPONIBLES");
        inv.mostrarCategoriasDisponibles();
    }
}

