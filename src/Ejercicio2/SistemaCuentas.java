package Ejercicio2;

public class SistemaCuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        System.out.println("Saldo cuenta 1: " + cuenta1.consultarSaldo());

        CuentaAhorros cuentaAhorros = new CuentaAhorros(10000, 2);
        System.out.println("Saldo cuenta de ahorros: " + cuentaAhorros.consultarSaldo());
        cuentaAhorros.aplicarInteres();
    }
}