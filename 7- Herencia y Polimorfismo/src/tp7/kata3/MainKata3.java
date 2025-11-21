/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.kata3;

/**
 *
 * @author vlc
 */
import java.util.ArrayList;
import java.util.List;

public class MainKata3 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 1200000));
        empleados.add(new EmpleadoTemporal("Luis", 80, 9000));
        empleados.add(new EmpleadoPlanta("Marta", 1500000));
        empleados.add(new EmpleadoTemporal("Juan", 40, 10000));

        for (Empleado e : empleados) {
            double sueldo = e.calcularSueldo(); // polimorfismo
            System.out.println(e.getNombre() + " sueldo = " + sueldo);

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }
    }
}

