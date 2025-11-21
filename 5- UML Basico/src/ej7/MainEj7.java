/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

/**
 *
 * @author vlc
 */

public class MainEj7 {

    public static void main(String[] args) {
        MotorVehiculo motor = new MotorVehiculo("Nafta", "MTR-0001");
        Vehiculo vehiculo = new Vehiculo("AA123BB", "Sedan", motor);

        Conductor conductor = new Conductor("Pedro Ruiz", "B1-998877");

        // Vinculacion bidireccional
        vehiculo.setConductor(conductor);

        System.out.println("Conductor: " + conductor.getNombre()
                + " - Vehiculo patente: " + conductor.getVehiculo().getPatente());

        System.out.println("Motor tipo: " + vehiculo.getMotor().getTipo()
                + " - Numero serie: " + vehiculo.getMotor().getNumeroSerie());
    }
}

