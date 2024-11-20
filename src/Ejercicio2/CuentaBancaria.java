package Ejercicio2;

class CuentaBancaria {
    private double saldo;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }
}