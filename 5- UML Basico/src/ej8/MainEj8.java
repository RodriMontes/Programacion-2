/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author vlc
 */
import java.time.LocalDateTime;

public class MainEj8 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Martin Diaz", "martin@example.com");

        Documento doc = new Documento(
                "Contrato de servicio",
                "Contenido del contrato...",
                "HASH-ABC-123",
                LocalDateTime.now(),
                usuario
        );

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Firmado por: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash: " + doc.getFirma().getCodigoHash());
        System.out.println("Fecha firma: " + doc.getFirma().getFecha());
    }
}

