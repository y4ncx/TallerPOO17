package Ejercicio3;

class Bicicleta extends Transporte {
    private int ruedas;


    public Bicicleta() {
        this.ruedas = 2;
    }


    @Override
    public void mostrarDetalles() {
        System.out.println("Bicicleta con " + ruedas + " ruedas.");
    }
}