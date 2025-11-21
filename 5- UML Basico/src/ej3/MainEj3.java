/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author vlc
 */
public class MainEj3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Julio Verne", "Frances");
        Editorial editorial = new Editorial("Editorial X", "Calle Falsa 123");

        Libro libro = new Libro("Viaje al centro de la Tierra", "ISBN12345", autor, editorial);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
    }
}

