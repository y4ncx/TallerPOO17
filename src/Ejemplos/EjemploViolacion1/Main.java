package Ejemplos.EjemploViolacion1;

// Clase de prueba (con problema)
public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new CocheElectrico();
        miVehiculo.mover(); // Lanza una excepción inesperada.
    }
}