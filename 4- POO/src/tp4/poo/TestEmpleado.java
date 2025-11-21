/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.poo;

/**
 *
 * @author vlc
 */
public class TestEmpleado {

    public static void main(String[] args) {

        // Crear empleados usando el constructor completo
        Empleado e1 = new Empleado(1, "Ana Lopez", "Desarrolladora", 500000.0);
        Empleado e2 = new Empleado(2, "Carlos Gomez", "Tester", 420000.0);

        // Crear empleados usando el constructor con nombre y puesto
        Empleado e3 = new Empleado("Maria Perez", "Analista");
        Empleado e4 = new Empleado("Juan Rodriguez", "Soporte Técnico");

        // Aplicar aumentos de salario (métodos sobrecargados)

        // A e1 le aumentamos un 10% de salario
        e1.actualizarSalario(10.0);

        // A e2 le aumentamos una cantidad fija de 30000
        e2.actualizarSalario(30000);

        // A e3 le damos 5% de aumento
        e3.actualizarSalario(5.0);

        // A e4 le damos un aumento fijo de 50000
        e4.actualizarSalario(50000);

        // Imprimir la información de cada empleado con toString()
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());

        // Mostrar el total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}