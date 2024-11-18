package Ejercicio2;

public class PruebaEstudiantePersona {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan perez", 20, "2313245");
        Estudiante estudiante2 = new Estudiante("Maria lopez", 21, "984985");


        System.out.println("Detalles del Estudiante 1:");
        estudiante1.mostrarDetalles();

        System.out.println("\nDetalles del estudiante 2:");
        estudiante2.mostrarDetalles();


    }
}
