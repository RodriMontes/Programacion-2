/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej9;

/**
 *
 * @author vlc
 */

import java.time.LocalDate;
import java.time.LocalTime;

public class MainEj9 {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Ana Torres", "OSDE");
        Profesional profesional = new Profesional("Dr. Lopez", "Cardiologia");

        CitaMedica cita = new CitaMedica(
                LocalDate.of(2025, 6, 15),
                LocalTime.of(10, 30),
                paciente,
                profesional
        );

        System.out.println("Cita medica:");
        System.out.println("Paciente: " + cita.getPaciente().getNombre()
                + " - Obra social: " + cita.getPaciente().getObraSocial());
        System.out.println("Profesional: " + cita.getProfesional().getNombre()
                + " - Especialidad: " + cita.getProfesional().getEspecialidad());
        System.out.println("Fecha: " + cita.getFecha() + " - Hora: " + cita.getHora());
    }
}

