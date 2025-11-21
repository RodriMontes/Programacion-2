/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author vlc
 */

public class MainEj11 {

    public static void main(String[] args) {
        Artista artista = new Artista("Daft Punk", "Electronica");
        Cancion cancion = new Cancion("One More Time", artista);

        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }
}

