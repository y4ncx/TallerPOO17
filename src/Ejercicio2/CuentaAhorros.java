package Ejercicio2;


class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;


    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial); // Llamada al constructor de la clase base
        this.tasaInteres = tasaInteres;
    }


    public void aplicarInteres() {
        double interes = consultarSaldo() * (tasaInteres / 100);
    }
}