/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

/**
 *
 * @author vlc
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private MotorVehiculo motor; // agregacion
    private Conductor conductor; // bidireccional

    public Vehiculo(String patente, String modelo, MotorVehiculo motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public MotorVehiculo getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
}

