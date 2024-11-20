package Ejercicio1;

class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del cálculo del área
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}