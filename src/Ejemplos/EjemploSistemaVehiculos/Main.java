package Ejemplos.EjemploSistemaVehiculos;

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new Coche();
        vehiculo.mover(); // Muestra: "El vehículo se está moviendo."
        coche.mover(); // Muestra: "El coche se está moviendo."
    }
}