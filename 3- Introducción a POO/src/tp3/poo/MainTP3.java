/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.poo;

/**
 *
 * @author vlc
 */
public class MainTP3 {
    public static void main(String[] args) {

        // ============================
        // 1. PRUEBA: ESTUDIANTE
        // ============================
        System.out.println("=== PRUEBA ESTUDIANTE ===");
        Estudiante e1 = new Estudiante("Juan", "Pérez", "Programación II", 7.5);
        e1.mostrarInfo();

        System.out.println("Subiendo calificación...");
        e1.subirCalificacion(1.0);
        e1.mostrarInfo();

        System.out.println("Bajando calificación...");
        e1.bajarCalificacion(2.0);
        e1.mostrarInfo();


        // ============================
        // 2. PRUEBA: MASCOTA
        // ============================
        System.out.println("\n=== PRUEBA MASCOTA ===");
        Mascota m1 = new Mascota("Firulais", "Perro", 3);
        m1.mostrarInfo();

        System.out.println("La mascota cumple años...");
        m1.cumplirAnios();
        m1.mostrarInfo();


        // ============================
        // 3. PRUEBA: LIBRO (ENCAPSULAMIENTO)
        // ============================
        System.out.println("\n=== PRUEBA LIBRO ===");
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        libro.mostrarInfo();

        System.out.println("Intentando asignar año inválido...");
        libro.setAnioPublicacion(-10); // inválido → no debe cambiar

        System.out.println("Asignando año válido...");
        libro.setAnioPublicacion(2020); // válido
        libro.mostrarInfo();


        // ============================
        // 4. PRUEBA: GALLINAS
        // ============================
        System.out.println("\n=== PRUEBA GALLINAS ===");
        Gallina g1 = new Gallina(1, 1, 0);
        Gallina g2 = new Gallina(2, 2, 5);

        System.out.println("Estado inicial:");
        g1.mostrarEstado();
        g2.mostrarEstado();

        System.out.println("Simulando acciones...");
        g1.envejecer();
        g1.ponerHuevo();

        g2.ponerHuevo();
        g2.ponerHuevo();

        System.out.println("Estado final:");
        g1.mostrarEstado();
        g2.mostrarEstado();


        // ============================
        // 5. PRUEBA: NAVE ESPACIAL
        // ============================
        System.out.println("\n=== PRUEBA NAVE ESPACIAL ===");
        NaveEspacial nave = new NaveEspacial("Andrómeda", 50);

        nave.mostrarEstado();
        nave.despegar();

        System.out.println("Intentando avanzar 60 unidades sin recargar...");
        nave.avanzar(60); // no debería alcanzar combustible

        System.out.println("Recargando combustible...");
        nave.recargarCombustible(30);

        System.out.println("Intentando avanzar 40 unidades...");
        nave.avanzar(40);

        nave.mostrarEstado();

        System.out.println("\n=== FIN DE LAS PRUEBAS ===");
    }
}
