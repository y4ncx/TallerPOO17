package Ejemplos.EjemploViolacion1;

// Clase derivada CocheElectrico
public class CocheElectrico extends Vehiculo {
    @Override
    public void mover() {
        throw new UnsupportedOperationException("Coche eléctrico necesita recarga.");
    }
}