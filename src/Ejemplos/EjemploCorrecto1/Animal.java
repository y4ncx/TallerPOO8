package Ejemplos.EjemploCorrecto1;

// Clase base
public class Animal {
    protected String especie;
    public Animal(String especie) {
        this.especie = especie;
    }
    public void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
