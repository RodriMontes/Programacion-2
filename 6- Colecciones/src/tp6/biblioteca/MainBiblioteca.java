/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.biblioteca;

/**
 *
 * @author vlc
 */

public class MainBiblioteca {
    public static void main(String[] args) {
        // 1) Crear biblioteca
        Biblioteca biblio = new Biblioteca("UTN Biblioteca");

        // 2) Crear 3 autores
        Autor a1 = new Autor("AU1", "Borges", "Argentina");
        Autor a2 = new Autor("AU2", "Cortazar", "Argentina");
        Autor a3 = new Autor("AU3", "Asimov", "Rusia");

        // 3) Agregar 5 libros
        biblio.agregarLibro("L1", "Ficciones", 1944, a1);
        biblio.agregarLibro("L2", "El Aleph", 1949, a1);
        biblio.agregarLibro("L3", "Rayuela", 1963, a2);
        biblio.agregarLibro("L4", "Fundacion", 1951, a3);
        biblio.agregarLibro("L5", "Yo Robot", 1950, a3);

        // 4) Listar libros
        System.out.println("LISTA LIBROS");
        biblio.listarLibros();

        // 5) Buscar por isbn
        System.out.println("BUSCAR ISBN L3");
        Libro buscado = biblio.buscarLibroPorIsbn("L3");
        if (buscado != null) buscado.mostrarInfo();

        // 6) Filtrar por anio
        System.out.println("FILTRAR ANIO 1951");
        biblio.filtrarLibrosPorAnio(1951);

        // 7) Eliminar
        System.out.println("ELIMINAR L2");
        biblio.eliminarLibro("L2");
        biblio.listarLibros();

        // 8) Cantidad total
        System.out.println("CANTIDAD TOTAL: " + biblio.obtenerCantidadLibros());

        // 9) Autores disponibles
        biblio.mostrarAutoresDisponibles();
    }
}

