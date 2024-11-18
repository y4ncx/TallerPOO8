package Ejemplos.EjemploIncorrecto3;

// Clase derivada (incorrecta)
public class Perro extends Animal {
    public Perro(String raza) {
        // No se llama al constructor de la clase base
        System.out.println("Raza: " + raza);
    }
}