/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.poo;

/**
 *
 * @author vlc
 */
public class Empleado {

    // 1) Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático: contador global de empleados
    private static int totalEmpleados = 0;

    // Atributo estático auxiliar para generar IDs automáticos
    private static int ultimoIdGenerado = 0;

    // 2) Constructor que recibe TODOS los atributos (incluye id)
    //    Usa 'this' para distinguir atributos de parámetros.
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;                 // this.id = atributo / id = parámetro
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

        // Cada vez que se crea un empleado, incrementamos el contador estático
        totalEmpleados++;
    }

    // 2) Constructor SOBRECARGADO
    //    Recibe solo nombre y puesto, asigna:
    //    - id automático
    //    - salario por defecto (por ejemplo 100000.0)
    public Empleado(String nombre, String puesto) {
        // Generamos un id automático
        ultimoIdGenerado++;
        this.id = ultimoIdGenerado;

        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000.0; // salario por defecto (podés cambiarlo)

        totalEmpleados++;
    }

    // 3) Métodos sobrecargados actualizarSalario

    // 3.a) Recibe un PORCENTAJE de aumento (ej: 10 = 10%)
    public void actualizarSalario(double porcentajeAumento) {
        double aumento = this.salario * porcentajeAumento / 100.0;
        this.salario += aumento;
    }

    // 3.b) Recibe una CANTIDAD FIJA a aumentar (sobrecarga por tipo distinto)
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // 4) Método toString(): representación legible del empleado
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    // 5) Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // 6) Getters y Setters (encapsulamiento)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        // podrías agregar validación si querés
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // ejemplo con validación simple
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
}
