package Ejercicio3;

public class PruebaEmpleadoGerente {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Kevin", 3000.50);
        System.out.println("Detalles del empleado:");
        empleado.mostrarDetalles();

        Gerente gerente = new Gerente("Maria", 5000.50, "Recursos Humanos");
        System.out.println("\nDetalles del gerente:");
        gerente.mostrarDetalles();
    }
}
