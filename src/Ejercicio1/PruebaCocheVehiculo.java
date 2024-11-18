package Ejercicio1;

public class PruebaCocheVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Honda", 200);
        Coche coche = new Coche("Toyota", 200, 4);


        System.out.println("Información del vehiculo: ");
        vehiculo.mostrarInformacion();


        System.out.println("\nInformación del coche: ");
        coche.mostrarInformacion();
    }
}
