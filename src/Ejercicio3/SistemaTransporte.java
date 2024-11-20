package Ejercicio3;

public class SistemaTransporte {
    public static void main(String[] args) {


        Transporte transporte1 = new Bicicleta();
        Transporte transporte2 = new Coche();


        transporte1.mostrarDetalles();
        transporte2.mostrarDetalles();
    }
}