package Ejercicio1;

public class SistemaFiguras {
    public static void main(String[] args) {

        // Creamos objetos

        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);



        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}