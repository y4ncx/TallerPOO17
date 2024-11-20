package Ejercicio1;

class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del cálculo del área
    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}