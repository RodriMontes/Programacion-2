/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.universidad;

/**
 *
 * @author vlc
 */

public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        // 1) Crear 3 profesores
        Profesor pr1 = new Profesor("P1", "Juan Perez", "Programacion");
        Profesor pr2 = new Profesor("P2", "Ana Lopez", "Bases de datos");
        Profesor pr3 = new Profesor("P3", "Carlos Diaz", "Redes");

        // 1) Crear 5 cursos
        Curso c1 = new Curso("C1", "POO");
        Curso c2 = new Curso("C2", "Colecciones");
        Curso c3 = new Curso("C3", "SQL");
        Curso c4 = new Curso("C4", "Sistemas Operativos");
        Curso c5 = new Curso("C5", "Redes I");

        // 2) Agregar a universidad
        uni.agregarProfesor(pr1);
        uni.agregarProfesor(pr2);
        uni.agregarProfesor(pr3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3) Asignar profesores a cursos
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P1");
        uni.asignarProfesorACurso("C3", "P2");
        uni.asignarProfesorACurso("C4", "P2");
        uni.asignarProfesorACurso("C5", "P3");

        // 4) Listar cursos y profesores
        uni.listarCursos();
        pr1.listarCursos();
        pr2.listarCursos();
        pr3.listarCursos();

        // 5) Cambiar profesor de un curso
        System.out.println("CAMBIAR profesor de C2 a P3");
        uni.asignarProfesorACurso("C2", "P3");
        pr1.listarCursos();
        pr3.listarCursos();

        // 6) Eliminar curso
        System.out.println("ELIMINAR curso C3");
        uni.eliminarCurso("C3");
        pr2.listarCursos();

        // 7) Eliminar profesor
        System.out.println("ELIMINAR profesor P1");
        uni.eliminarProfesor("P1");
        uni.listarCursos();

        // 8) Reporte
        uni.reporteCursosPorProfesor();
    }
}

