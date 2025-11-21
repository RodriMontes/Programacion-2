/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.parte2;

/**
 *
 * @author vlc
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainEj3LecturaArchivo {
    public static void main(String[] args) {
        try {
            File f = new File("datos.txt");
            Scanner lector = new Scanner(f);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado.");
        }
    }
}
