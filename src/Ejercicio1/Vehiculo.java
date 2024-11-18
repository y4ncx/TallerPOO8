package Ejercicio1;

public class Vehiculo {
    private String marca;
    private int velocidadMaxima;


    public Vehiculo(String marca, int velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;

    }

    public void mostrarInformacion(){
        System.out.println("Marca = " + marca);
        System.out.println("Velocidad Maxima = " + velocidadMaxima + "km/h");

    }

}
