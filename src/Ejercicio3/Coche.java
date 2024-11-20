package Ejercicio3;


class Coche extends Transporte {
    private int ruedas;


    public Coche() {
        this.ruedas = 4;
    }


    @Override
    public void mostrarDetalles() {
        System.out.println("Coche con " + ruedas + " ruedas.");
    }
}